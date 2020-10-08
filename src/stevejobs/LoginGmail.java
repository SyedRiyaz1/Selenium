package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] krishna) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
   ChromeDriver d= new ChromeDriver();
    d.get("https://accounts.google.com");
    d.findElement(By.xpath("//input[@name='identifier']")).sendKeys("9100517319");
    d.findElement(By.xpath(" //span[@class='RveJvd snByac']")).click();
   // d.findElement(By.xpath(" //input[@type='password']")).sendKeys("i9481538032 "); 
    //*[@type='password'] 
    //d.findElement(By.xpath("//input[@type='password']")).sendKeys("9100517319");
    Thread.sleep(5000);
    d.findElement(By.xpath("//input[@name='password']")).sendKeys("i948153803");
    
    d.findElement(By.xpath(" //span[@class='RveJvd snByac']")).click();// name="password" //*[text()='Wrong password']
    //String str= d.findElement(By.xpath(" //span[@jsslot='']")).getText();
    Thread.sleep(5000);
   String str=d.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText();
    //System.out.println(str);
  //  String str= d.findElement(By.xpath(" //*[text()='Wrong password'] ")).getText();
    System.out.println(str);
	}
}
