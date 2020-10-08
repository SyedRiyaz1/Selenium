package stevejobs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullScreenShotImage 
{

	public static void main(String[] args) throws IOException 
	{
		  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://facebook.com");
	    File src= d.getScreenshotAs(OutputType.FILE);
	    File des= new File("E:\\batch 244\\Programs\\FaceBook.png");
	    FileHandler.copy(src, des);

	}

}
