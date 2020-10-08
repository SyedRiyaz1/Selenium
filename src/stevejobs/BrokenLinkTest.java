package stevejobs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest 
{

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		 ChromeDriver d= new ChromeDriver();
		 d.get("https://google.co.in");
		 Thread.sleep(5000);
		 int nulllink=0;
		 int notwrok=0;
		 int workinglink=0;
		 int brokenlink=0;
 		 int notreslink=0;
List<WebElement>le=d.findElements(By.xpath("(//a)|(//base)|(//area)|(//link)|(//href)|(//img)"));
 System.out.println("Total Link"+le.size());
 for(WebElement e:le)
   {
	 le=d.findElements(By.xpath("(//a)|(//base)|(//area)|(//link)|(//href)|(//img)"));
	 String x=e.getAttribute("href");
	 if(x==null)
	 {
		 nulllink=nulllink+1;	 
	 }
	 else
	 {
		if(x.contains("javascript")||
			x.contains("android")||
			 x.contains("malto")||
		     x.contains("phone")||
		      x.contains("andrioid ios"))
           {
			notwrok=notwrok+1;
           }
		     
	 
	 else 
	 {
		try
		{
		URL u= new URL(x);
		HttpURLConnection con= (HttpURLConnection)
				    u.openConnection();
		             con.connect();
		             String res=con.getResponseMessage();
		              con.disconnect();
		              //System.out.println(res);
		              if(res.contentEquals("OK"))
		              {
		               workinglink=workinglink+1;	  
		              }
		              else
		              {
		            	  brokenlink=brokenlink+1;	  
		              }
		
		}
		catch(Exception E)
		{
			notreslink	=notreslink+1;
		}
	 }
	}
	
 //d.close();
		 
   }
 
System.out.println("Null Links:"+nulllink);
System.out.println("Not working Links:"+ notwrok);
System.out.println("working Links:"+workinglink );
System.out.println("BrokenLinks Links:"+brokenlink );
System.out.println("Noresponse Links:"+notreslink);

  

	}

}
