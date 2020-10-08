package stevejobs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpRequest;

public class Brokenlink
{

	public static void main(String[] args) throws Exception
	{
	int wkl=0;
	int notwkl=0;
	int bkl=0;
	int notreslk=0;
	int nulllink=0;
	 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
	 ChromeDriver d= new ChromeDriver();
	 d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 d.get("https://in.ebay.com");
	 Thread.sleep(5000);
	  // collect all link
//List<WebElement> lw= d.findElements(By.xpath("(//a)|(//base)|(//area)|(//link)|(//img))|(//href)"));
List<WebElement> lw=d.findElements(By.xpath("(//a)|(//link)|(//image)|(//href)|(//area)|(//base)"));

Thread.sleep(5000);
    // collect in for loop
for(WebElement e:lw)
{ 
	if(e.getAttribute("href") == null)
	{
		nulllink=nulllink+1;
	} 
	      //collect  all not working Links
	else 
	{
	 String x= e.getAttribute("href");
	 if(x.contains("javascript")||
		     x.contains("mailto")||	 
		     x.contains("phone")) {
		 notwkl=notwkl+1;
	 }
	
	    else 
	{
		try 
		{
			URL u= new URL(x);
			HttpURLConnection con = (HttpURLConnection)
					u.openConnection();
			        con.getContent();
			        //  check Response message
			        Thread.sleep(5000);
			        String r=con.getResponseMessage();
			        con.disconnect();
			       // System.out.println(r);
			        if(r.equalsIgnoreCase("Ok"))
			        {
			        	wkl=wkl+1;	
			        }
			        else
			        	
			        {
			        	bkl =bkl+1;	
			        }
			         
			
		}
		catch(Exception E) 
		{
			notreslk=notreslk+1;	
		 }
	}
}
	d.close();
	}
        
	
 System.out.println("Count Of Broken link is:"+bkl);   
 System.out.println("Count Of NotResponse link is:"+notreslk); 
	}	
}
