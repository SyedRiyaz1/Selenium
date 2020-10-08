package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tourswebsite {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
			ChromeDriver d= new ChromeDriver();
	          d.get("http://newtours.demoaut.com/");
	          Thread.sleep(5000);
	          d.findElement(By.linkText("REGISTER")).click();
	          Thread.sleep(5000);
	          d.findElement(By.name("firstName")).sendKeys("Riyaz");  
	            //lastName
	          d.findElement(By.name("lastName")).sendKeys("Inamdar"); 
	          d.findElement(By.name("phone")).sendKeys("9481538032"); 
	          d.findElement(By.name("userName")).sendKeys("Saleem"); 
	          d.findElement(By.name("address1")).sendKeys("Marutinagar");
	          d.findElement(By.name("address2")).sendKeys("Vijaynagar"); 
	          d.findElement(By.name("city")).sendKeys("Bangalore"); 
	          d.findElement(By.name("state")).sendKeys("Karnataka"); 
	          d.findElement(By.name("postalCode")).sendKeys("585311");
	          WebElement e=d.findElement(By.name("country"));
	          Select s= new Select(e);
	          s.selectByVisibleText("INDIA");
	          Thread.sleep(5000);
	         // d.findElement(By.name("email")).sendKeys("Riyaz.selenium@gmail.com");
	         // d.findElement(By.name("password")).sendKeys("i9481538032");
	          d.findElement(By.name("email")).sendKeys("Riyaz"); 
	          d.findElement(By.name("password")).sendKeys("i9481538032");//name="confirmPassword"
	          d.findElement(By.name("confirmPassword")).sendKeys("i9481538032"); //register/
	          d.findElement(By.name("register")).click(); //register/

	          

 	}

}
