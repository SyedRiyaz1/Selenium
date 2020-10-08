package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPoupAndExpectedMatch 
{

	public static void main(String[] args) throws Exception 
	{
		// set property

		Scanner s= new Scanner(System.in);
		String x=s.nextLine();
		System.out.println("Enter a String");
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		System.out.println("Enter a Disired String");
		String y=s.nextLine();
		//System.out.println("Enter String");
		d.manage().window().maximize();
		Thread.sleep(5000);
		// lunch the site
		d.get("https://www.google.co.in");
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(5000);

		List<WebElement>l= d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		int flag=0;
		for(WebElement e:l)
		{
			if(y.equalsIgnoreCase(e.getText()))
			{
				flag=1;
				System.out.println(" MATCH FOUND");
				System.out.println(e.getText());
			}

		}
		if(flag==0)
		{
			System.out.println("Match not found");
			d.close();
			s.close();

		}
		{

		}


	}	

}
