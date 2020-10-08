package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownList 
{

	    public static void main(String[] args) throws Exception 
	{
		// open Browser
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.mercurytravels.co.in");
		   Thread.sleep(5000);
WebElement 	wlb=d.findElement(By.name("nights"));
Select s= new Select(wlb);
List<WebElement> lwb=s.getOptions();
for(WebElement e:lwb)
  {
System.out.println(e.getText());	
   }
		  
	 d.close();
	}

}
