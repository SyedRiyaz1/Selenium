package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotmail {

	public static void main(String[] args) throws Exception {
	
		 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://login.live.com"); // placeholder="Email, phone, or Skype"
		   d.findElement(By.xpath("//*[@placeholder='Email, phone, or Skype']")).sendKeys("riyaz.selenium@outlook.com");
		   Thread.sleep(5000);
		   d.findElement(By.xpath("//*[@type='submit']")).click();
		   Thread.sleep(5000);  ////*[@name='passwd']
		   d.findElement(By.xpath("//*[@name='passwd']")).sendKeys("i9481538032");
		   d.findElement(By.xpath("//*[@type='submit']")).click(); ////*[text()='New message']
		   Thread.sleep(5000);
		                     //*[@aria-label='View inbox']
		   
			 d.findElement(By.xpath("//*[text()='More actions']")).click();
			 Thread.sleep(5000);
		   d.findElement(By.xpath("//*[@aria-label='View inbox']")).click();  // //*[text()='New message']
		  // Thread.sleep(5000);
		   //    d.manage().
		  // d.findElement(By.xpath("//*[text()='New message']")).click(); 
	      d.findElement(By.xpath("//*[text()='New message']")).click();
		    // d.findElement(By.xpath("//*[@id='id__5']")).click();

	}

}
