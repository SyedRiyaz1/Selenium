package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTesting 
{

	public static void main(String[] args) throws Exception 
	   {   // open Browser
		  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		  ChromeDriver d= new ChromeDriver();
		 
		  Thread.sleep(5000);
		  // lunch site
	 d.get("https://www.geeksforgeeks.org/html-iframes/");

		  // xpath collect all parent frame
List<WebElement> lw=d.findElements(By.xpath("(//frame)|(//iframe)"));
   // check 
System.out.println("Check how many frame in parent page:"+lw.size());
       // now check for child frame
for(int i=1; i<lw.size();i++)
{
	d.findElements(By.xpath("(//frame)|(//iframe)"));
    d.switchTo().frame(lw.get(i));
	// check child count
	List<WebElement> lc=d.findElements(By.xpath("(//frame)|(//iframe)"));
	System.out.println("Child Frame in "+i+"frame:"+lc.size());
	// check for sub child 
	if(lc.size()!=0)
     {
   	 for(int j=1;j<lc.size();j++) 
   	 {
			lc=d.findElements(By.xpath("(//frame)|(//iframe)"));

   		  d.switchTo().frame(lc.get(j)); 

			List<WebElement> sub=d.findElements(By.xpath("(//frame)|(//iframe)"));
			
			System.out.println("SubChild count Frame in "+j+"frame:"+sub.size());
	
	}
	}
	d.switchTo().parentFrame();
	

}
d.switchTo().defaultContent();
	}

}
