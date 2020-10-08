package stevejobs;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

  public class ScreenShot 
{

	public static void main(String[] args) throws IOException 
	{

		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
     		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://www.google.com");
		   WebElement e=d.findElement(By.name("q"));
		              e.sendKeys("Riyaz Ianamdar");
		   int w= e.getRect().getWidth();
		   int h= e.getRect().getHeight();
		   int x= e.getRect().getX();
		   int y= e.getRect().getY();
		   System.out.println(x+"  "+y+"  "+w+"   "+h);
		   File src =d.findElement(By.id("hplogo")).getScreenshotAs(OutputType.FILE);
		   File dst= new File("e:\\NeWScreeNImage.png");
		   FileHandler.copy(src,dst);
		
	
	}

}
