     package stevejobs;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoExpectedMatched {

	public static void main(String[] args) throws InterruptedException {
		// Set The Software
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
	                        	//"webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe"
		//Collect input
		Scanner s= new Scanner(System.in);
		System.out.println("please Enter Enter String");
		
		String x= s.next();
		System.out.println("Enter Desired Input");
		String y= s.next();
	    ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.co.in");
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys(x);
List<WebElement>ls=d.findElements(By.xpath("ul[@role='listbox']"));

System.out.println("WebElemen Total List:"+ ls.size());
/*int flag=0;
 for(WebElement e:ls)
 {
	if(y.contentEquals(e.getText()))
	{
	flag=1;
	System.out.println(e.getText());
	e.click();
	System.out.println("Matched");
	
	}
 }
if(flag==0)
     {
	 System.out.println("Not Matched");
    }*/
		
		

	}

}
