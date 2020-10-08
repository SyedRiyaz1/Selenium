package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isvisible 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   //d.manage().window().maximize();// 
		   Thread.sleep(5000);
		   d.get("https://accounts.google.com");
		   Thread.sleep(5000);
		   // check Element is visible in element or Not
		 if  (d.findElement(By.xpath("//*[@name='hiddenPassword']")).isDisplayed())
		 {
			 System.out.println("Element is visible in page");
		 }
		 else
		 {
			 System.out.println("Element is  invisible in page ");
		 }

	}

}
