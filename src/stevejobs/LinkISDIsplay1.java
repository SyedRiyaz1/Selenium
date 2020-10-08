package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkISDIsplay1 
{

	    public static void main(String[] args)  throws Exception
	 {
		  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://flipkart.com");
		   Thread.sleep(5000);
		   int vlc=0;
			int hlc=0;
	List<WebElement> l= d.findElements(By.xpath("//a"));
	System.out.println("sisze of :"+l.size());
	
	for(WebElement e:l)
	{
		if(e.isDisplayed()) // visible to page or not
		{
		vlc=vlc+1;	
		String x=e.getAttribute("hef");
		// System.out.println("href attribute value is:"+x.length());
        }
		else {
			hlc=hlc+1;
		    }
	    }
	   
	 System.out.println("Visible link count is:"+vlc);
	 System.out.println("Disible link count is:"+hlc);
     d.close();

	}

}
