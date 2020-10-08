package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOnPage 
{

	public static void main(String[] args) 
	{
		    System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://flipkart.com");
		   List<WebElement> li=d.findElements(By.xpath("//a"));
		   int vlc=0;
		   int hlc=0;
		  for(int i=0;i<li.size();i++)
		  {
			if(li.get(i).isDisplayed())
			{
		
	    String x=li.get(i).getAttribute("href");
	    System.out.println("Attribute of HREF is:"+x);
	    vlc=vlc+1;
		}
		  
		  else {
			hlc=hlc+1;
		}
		  }
			System.out.println("Visible links are:"+vlc);
			System.out.println("hidden links are:"+hlc);
			//System.out.println("list of anxhort tag is:"+li.size());
		
}
}		
	
		
		
	
	


