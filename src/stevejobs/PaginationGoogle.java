package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationGoogle {

	public static void main(String[] args) throws Exception 
	{
	

		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");	
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver d= new ChromeDriver();
		// login in onesite 
		d.get("https://www.google.com/");
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		Thread.sleep(5000);
		int count=0;
		     while(2>1)
		     {
		    	 count++;
		    	 try
		    	 {
		          d.findElement(By.xpath("//*[text()='Next']")).click();
		          
		    	 }
		    	  catch(Exception Ex)
		    	 {
		    		break;  
		    	 }
		    	 System.out.println("Count result of the page"+count);
		     }

}
}