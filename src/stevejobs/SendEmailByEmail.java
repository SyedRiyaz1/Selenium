package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendEmailByEmail 
{
	           public static void main(String[] krishna) throws Exception 
	           {
			    System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
			   ChromeDriver d= new ChromeDriver();
			   d.manage().window().maximize();
			   d.get("https://www.gmail.com");
			
			  // d.findElement(By.xpath("//*[@autocomplete='username')")).sendKeys("riyaz");
			   Thread.sleep(10000);
			  // d.findElement(By.xpath("//*[@id='yDmH0d']")).sendKeys("riyaz.salenium"); //*[@text()='Next']
			   d.findElement(By.xpath("//*[@name= 'identifier'] ")).sendKeys("riyaz.selenium");
			   Thread.sleep(5000);
			   d.findElement(By.xpath("//*[text()='Next'] ")).click();
			   Thread.sleep(5000);
			   d.findElement(By.xpath("//*[@jsname='YPqjbf']")).sendKeys("i9481538032");
			   Thread.sleep(5000);
			   d.findElement(By.xpath("//*[text()='Next'] ")).click();  ////*[@role='button'][3] 
			//Thread.sleep(10000);
			 d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			d.findElement(By.xpath("//*[text()='Compose']")).click();
			 d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); ////*[@name='to'][1]
			//Thread.sleep(10000);   //jsmodel='utMpr'
			 d.findElement(By.xpath("//*[text()='Compose'] ")); ////*[@name='to'][1]
			 Thread.sleep(5000);
			 d.findElement(By.xpath("//*[@name='to'][1] ")).sendKeys("venu.srivenu@gmail.com;venugsv@gmail.com;loverboykrish9@gmail.com;vipzstreet@gmail.com");
			 //d.findElement(By.xpath("//*[@name='to'][1] ")).sendKeys("venu.srivenu@gmail.com");
			 
			 d.findElement(By.xpath("//*[@placeholder='Subject'] ")).sendKeys("hi");
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//div[@role='textbox']")).sendKeys(" Test mail \n genrated automation \n  by "); 
			              // //*[@aria-label='Send']
			 d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); ////*[@name='to'][1]
    
			 /* [@aria-label='Message Body']    ////*[@role='button']
			 d.findElement(By.xpath("//*[@roll]=")).sendKeys(" Test mail \n genrated automation \n  by ");
			 d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); ////*[@name='to'][1]*/

			 
			 d.findElement(By.xpath("//div[@id=':aq']")).click();
			 //d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); ////*[@name='to'][1] 
			 Thread.sleep(3000);


             

}
}