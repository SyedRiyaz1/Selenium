package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert1 
{

	public static void main(String[] args) throws Exception 
	{
System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		Thread.sleep(5000);
        d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(5000);
		d.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/button")).click();
		Thread.sleep(5000);
	    String a =	d.switchTo().alert().getText();
	    System.out.println(a);
	    d.switchTo().alert().accept();
		//d.switchTo().defaultContent();
		d.close();
		}
   }
