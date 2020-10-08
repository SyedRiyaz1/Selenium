package stevejobs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();//
		   d.get("https://www.google.com");
		    WebElement e=d.findElement(By.name("q"));
		    e.sendKeys("Riyaz Ianamdar");
		   int x=e.getRect().getX();
		   int y=e.getRect().getY();
		   int w=e.getRect().getWidth();
		   int h=e.getRect().getHeight();
		   System.out.println(x+" "+y+" "+w+" "+h);
		    File src=e.getScreenshotAs(OutputType.FILE);
		    File des= new File("NewfileImage.png");
		    FileHandler.copy(src,des);
		    
		    
		    		

	}

}
