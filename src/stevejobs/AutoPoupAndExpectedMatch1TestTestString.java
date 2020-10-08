package stevejobs;
// Executed
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPoupAndExpectedMatch1TestTestString 
{
	public static void main(String[] args) throws Exception 

	{ 
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String");
		String x= s.nextLine();
		System.out.println("Desired String");
		String y= s.nextLine();
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Thread.sleep(5000);
		d.get("https://www.google.co.in");
		Thread.sleep(5000);
		// search
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(5000);
		// collect all the cache or autoPoup Element
		List<WebElement> l= d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		Thread.sleep(2000);
		System.out.println("total element in the cashe or auto popup message inthe url:"+l.size());
		int flag=0;
		for(WebElement e:l)
		{
			if(y.equalsIgnoreCase(e.getText()))
			{
				flag=1;
				//e.click();
				System.out.println("Expected outPut Found");
				System.out.println(e.getText());
			}


		}
		if(flag==0)
		{
			System.out.println("Expected result not found");
		}

	}

}
