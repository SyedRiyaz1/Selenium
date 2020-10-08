package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert 

{
public static void main(String arg[]) throws Exception
{  // open chrome Browser  
	  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
	  ChromeDriver d= new ChromeDriver();
	  d.manage().deleteAllCookies();
	  d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  // set path
	  d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert2");
	  // collect in list
	  Thread.sleep(5000);
	  d.switchTo().frame("iframeResult");
	  Thread.sleep(5000);

	 WebElement l=d.findElement(By.xpath("(//*[@onclick='myFunction()'])"));
	       l.click();
	       Thread.sleep(5000);
	    String x= d.switchTo().alert().getText();
		  Thread.sleep(5000);
        System.out.println(x);
	        
	 
	  
}

}
