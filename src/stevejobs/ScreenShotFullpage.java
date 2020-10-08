package stevejobs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotFullpage 
{

	public static void main(String[] args) throws IOException 
	{
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
  		   d.manage().window().maximize();
		   d.get("https://www.google.com");
		   File   src = d.getScreenshotAs(OutputType.FILE);
		   File   des = new File("E:\\batch 244\\Programs\\pageScreen.png");
		   FileHandler.copy(src, des);
	}

}
