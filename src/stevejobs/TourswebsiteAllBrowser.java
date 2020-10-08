package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TourswebsiteAllBrowser 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("enter browser name");
		Scanner s= new Scanner(System.in);
		WebDriver d=null;
		String str=s.nextLine();
		if(str.equals("f"))
		 {
		 System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
		 d = new  FirefoxDriver();
		 }
		  else if(str.equals("ch")) 
		 {
			 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
			 d = new  ChromeDriver();
		 }
		  else if(str.equals("ie")) 
			 {
				 System.setProperty("webdriver.ie.driver","E:\\batch 244\\IEDriverServer.exe");
				 d = new InternetExplorerDriver();
			 }
		  else
		  {
			  System.out.println("Wrong browser");
			  System.exit(0);
		  }
		Thread.sleep(5000);
		d.get("http://newtours.demoaut.com");
		Thread.sleep(10000);
	    d.findElement(By.linkText("REGISTER")).click(); 
	     Thread.sleep(5000);
	     d.findElement(By.name("firstName")).sendKeys("Riyaz");
		 d.findElement(By.name("lastName")).sendKeys("Inamdar");
		 d.findElement(By.name("userName")).sendKeys("salem");
		 d.findElement(By.name("phone")).sendKeys("9481538032");
		 d.findElement(By.name("address1")).sendKeys("HaffezPet");
		 d.findElement(By.name("address2")).sendKeys("kondapur");
		 d.findElement(By.name("city")).sendKeys("Hydrabad");
		 d.findElement(By.name("state")).sendKeys("Telengana");
		 d.findElement(By.name("postalCode")).sendKeys("585311");
		 WebElement  e = d.findElement(By.name("country"));
		 Select s1 = new Select(e);
		 s1.selectByVisibleText("INDIA");
		 d.findElement(By.name("email")).sendKeys("Riyaz"); 
         d.findElement(By.name("password")).sendKeys("i9481538032");
         d.findElement(By.name("confirmPassword")).sendKeys("i9481538032"); 
         d.findElement(By.name("register")).click(); 
				//d.close(); 
		 
		
		}
	} 


