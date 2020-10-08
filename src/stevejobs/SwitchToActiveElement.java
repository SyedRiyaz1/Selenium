package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		d.get("https://www.flipkart.com"); 
		//d.findElement(By.className("userName"));
		d.switchTo().activeElement().sendKeys("Riyaz");
		//d.close();

	}

}
