package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert 
{

public static void main(String[] args) 
{
	  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
	  ChromeDriver d= new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  d.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
	  d.manage().deleteAllCookies();
	  d.manage().window().maximize();
	  d.switchTo().frame("result1");
	  d.findElement(By.xpath("//*[@value='Click me']")).click();
	String x=  d.switchTo().alert().getText();
	           d.switchTo().alert().accept();
	           System.out.println(x);
	           d.close();
	  
	 

	}

}
