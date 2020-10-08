package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autopoup 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a word to search:");
		String x=s.nextLine();
		System.out.println("Enter Expected suggestion:");
		String y=s.nextLine();
		ChromeDriver d= new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://google.co.in");
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(5000);
		List<WebElement> el=d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		System.out.println(el.size());
		int flag=0;
		for(WebElement e:el)
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
