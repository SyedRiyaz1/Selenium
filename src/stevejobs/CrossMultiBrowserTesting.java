package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossMultiBrowserTesting 
{
public static void main(String[] args) 
{
	System.out.println("Enter Browser Driver Name");
	Scanner s= new Scanner(System.in);
	String str=s.nextLine();
	 WebDriver d =null;
	 if(str.equals("chrome"))
	 {
      System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe ");
      d= new ChromeDriver();
      //d.get("https://www.salesforce.com/in");
      d.get("https://accounts.google.com");
      d.findElement(By.name("identifier")).sendKeys("9100517319");
      // d.findElement(By.name("")).click();
       d.findElement(By.id("identifierNext")).click();
     d.findElement(By.id("Passwd")).sendKeys("i9481538032");
     //d.findElement(By.id("passwordNext")).sendKeys("i9481538032");
      // d.findElement(By.id("next")).click();

// Wait For Page To Load
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
//driver.findElement(By.id("signIn")).click();
      
      
	 }
	 else if(str.equals("firefox"))
	 {
	  System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe ");
      d= new FirefoxDriver();
      d.get("https://www.facebook.com/");
      d.findElement(By.name("email")).sendKeys("9481538032");
      d.findElement(By.name("passwd")).sendKeys("riyaz9481538032");
	 }
	 else if(str.equals("ie"))
	 {
      System.setProperty("webdriver.ie.driver", "E:\\batch 244\\Iedriverserver.exe ");
      d= new InternetExplorerDriver();
      d.get("https://support.udemy.com/hc/en-us");
	}
	 else
		 System.out.println("Wrong Website");
         
	// System.exit(0);
}
}
