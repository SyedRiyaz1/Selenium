package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadio3rdButton 
{

	public static void main(String[] args) throws Exception 
	{
System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
ChromeDriver d= new ChromeDriver();
//d.manage().window().maximize();// 
Thread.sleep(5000);
d.get("https://www.facebook.com");	
Thread.sleep(5000);

WebElement e=d.findElement(By.xpath("//input[@type='radio']/parent::span/following-sibling::span[2]/label"));
//e.click();
   if(e.isDisplayed())
   {
	   System.out.println(" Element is visible");
		if(e.isEnabled()) {
			System.out.println(" Element is Enabled");
			if(e.isSelected()) {
				System.out.println("Selected");
			 }
			else {
				System.out.println("not selected");
			}
		       }
		else {
			System.out.println("Not Enabled");
		    }
	   }
	else 
	{
		System.out.println(" Element is not visible");	
	}

}

}