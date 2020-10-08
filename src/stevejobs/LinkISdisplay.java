package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkISdisplay 
{

	public static void main(String[] args) 
	{
		
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://flipkart.com");
		 List<WebElement>l= d.findElements(By.xpath("//a"));
		 System.out.println(" total count of anchor tag is:"+l.size());
		 int vlc=0;
		 int hlc=0;
		 for(int i=0;i<l.size();i++)
		 {
		  if(l.get(i).isDisplayed())
		  {
		      vlc= vlc+1; 
			 String x=l.get(i).getAttribute("href");
			// System.out.println("Href attribute value is:"+x.length());

		  }
		  else 
		  {
			  hlc= hlc+1;
		  }
		      
		  }
	 
		 System.out.println("Visible link count is:"+vlc);
		 System.out.println("Disible link count is:"+hlc);
         d.close();
		 }
		 }


