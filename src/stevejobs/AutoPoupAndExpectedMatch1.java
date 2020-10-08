package stevejobs;
                                        // Executed
import java.util.List;
import java.util.Scanner;
                               // Executed
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPoupAndExpectedMatch1 {

	public static void main(String[] args) throws InterruptedException {
		// take input
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a word to search");
		String x= s.nextLine();
		System.out.println("Enter a Expected sugestion");
		String y= s.nextLine();
		// open chrome Browser
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   //System.out.println("Enter String");
		   d.manage().window().maximize();
		   Thread.sleep(5000);
		   // lunch the site
		   d.get("https://www.google.co.in");
		   Thread.sleep(5000);
		   // enter a word to search
		    d.findElement(By.name("q")).sendKeys(x);
		    Thread.sleep(5000);
		    // handle auto complete or cache Elements
			List<WebElement> l= d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		 // Select Expected Suggsestion in  auto complite list
			int flag=0;
			for(int k=0;k<l.size();k++)
				System.out.println(l.get(k).getText());
			
			for(int i=0;i<l.size();i++)
			{
				String z= l.get(i).getText();
				if(l.get(i).getText().contains(y))
				{
					flag=1;
					// select suggetsion
					l.get(i).click();
					Thread.sleep(2000);
					d.navigate().back();
					Thread.sleep(2000);
					
					d.findElement(By.name("q")).sendKeys(x);
				    Thread.sleep(5000);
				    l= d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
					
				}
			}
		if(flag==0)
		{
			System.out.println("Expected suggestion is not found");
			//d.close();// close the browser session 
			s.close();// close scanner session
		}
		
		

	}

}
