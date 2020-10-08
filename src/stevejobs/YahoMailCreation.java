package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahoMailCreation {
                                               //*[@id='usernamereg-firstName']
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://login.yahoo.com"); //@id='usernamereg-lastName'
		   /*d.findElement(By.xpath("//*[@id='usernamereg-firstName']")).sendKeys("riyaz"); 
		   d.findElement(By.xpath("//*[@id='usernamereg-lastName']")).sendKeys(".selenium"); 
                 //                   usernamereg-yid
		   d.findElement(By.xpath("//*[@id='usernamereg-yid']")).sendKeys("riyaz.selenium"); 
		  // id='usernamereg-password'
		   d.findElement(By.xpath("//*[@id='usernamereg-password']")).sendKeys("i9481538032"); 
                //id="usernamereg-phone"
		   d.findElement(By.xpath("//*[@id='usernamereg-phone']")).sendKeys("9100517319"); 
		   /*
		    new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("16");
                 new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(4);
              new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2018");
 
		    */
         /* WebElement e = d.findElement(By.name(" "));
          Select s= new Select(e);
          s.selectByVisibleText("October");*/
          
		   //id='usernamereg-month'
	/*d.findElement(By.xpath("//*[@id='usernamereg-month']")).sendKeys("October"); 
          //id="usernamereg-day"
	d.findElement(By.xpath("//*[@id='usernamereg-day']")).sendKeys("11"); 
// id="usernamereg-year"
d.findElement(By.xpath("//*[@id='usernamereg-year']")).sendKeys("1986"); 
// id='reg-submit-button'
//d.findElement(By.xpath("//*[@id='reg-submit-button']")).click();*/ 
           // id="login-signin"  //login-username/*
		   
		   // Enter User name
        d.findElement(By.xpath("//*[@id='login-username']")).sendKeys("riyaz.selenium"); 
        // Enter Click
        d.findElement(By.xpath("//*[@id='login-signin]")).click(); // id="login-passwd"
         Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("i9481538032"); 
       // id="login-signin"
        
        
     //   Thread.sleep(5000); 

        d.findElement(By.xpath("//*[@id='login-signin']")).click();
        Thread.sleep(5000); 
       
	}               //9+8899 (//table)[6]/tbody/tr[8]/td[4]/child::span

}
