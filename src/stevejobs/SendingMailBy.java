package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendingMailBy 
{

	    public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.gmail.com");
		   d.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("riyaz.selenium");
		   d.findElement(By.xpath("//*[text()='Next'] ")).click(); 
		   Thread.sleep(5000);
		  //d.findElement(By.xpath("//*[@name='password']")).sendKeys("i9481538032"); // not working
          //Thread.sleep(5000); //*[@ jsname='YPqjbf']
		   d.findElement(By.xpath("//*[@ jsname='YPqjbf'] ")).sendKeys("i9481538032");
		   d.findElement(By.xpath("//*[text()='Next'] ")).click(); 
		   Thread.sleep(20000);
		   //d.findElement(By.xpath("//*[text()='Compose' ")).click();
		   
		    //class="T-I J-J5-Ji T-I-KE L3"
		   //d.findElement(By.xpath("//*[text()='Compose']")).click();
 		     Thread.sleep(5000);  //jsmodel
		  // To  // //*[@id=':bn']
		  d.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("riyazsfdc@gmail.com");
        Thread.sleep(10000); 
        d.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Test Auto Mail");
        Thread.sleep(5000);
        d.findElement(By.xpath("//div[@role='textbox']")).sendKeys("how are you well");
        //d.findElement(By.xpath("//*[@aria-label='Message Body']")).sendKeys(" how  are you \n well buddy \n Stay with us");
        
             Thread.sleep(5000);
             d.findElement(By.xpath("//div[@class='dC']")).click();
        // new Actions(d).moveToElement(d.findElement(By.xpath("//div[contains(@aria-label,'Send')]"))).click().perform();;
                Thread.sleep(5000);
                               
          String str=d.findElement(By.xpath("(//*[@class='vh'])[1]/span[1]")).getText();
           System.out.println(str);
           Thread.sleep(5000);    //aria-label="Google Account: Riyaz Inamdar 
          d.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/child::span")).click();

           
           d.findElement(By.xpath("//*[text()='Sign out']")).click();
           Thread.sleep(5000);
        // d.close();
       //div[text()='Send']
           

	}

}
