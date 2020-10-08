package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginTest 
{

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
        d.get("https://www.facebook.com");
         
        d.findElement(By.name("email")).sendKeys("9481538032");
        d.findElement(By.name("pass")).sendKeys("riyaz9481538"); 
        d.findElement(By.id("loginbutton")).click();
        Thread.sleep(5000);
       // String str=d.findElement(By.xpath("//div[@id='error_box']/div[2]")).getText();
        String str=d.findElement(By.xpath(" //div[@role='alert']/div[2]")).getText();
        System.out.println(str);
           }
	}