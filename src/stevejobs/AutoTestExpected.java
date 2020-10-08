package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;       // Executed

public class AutoTestExpected 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Set The Software
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		// d.manage().deleteAllCookies();
		/*Thread.sleep(5000);;//a
				d.get("https://www.google.co.in");//c

				Thread.sleep(5000);
				d.findElement(By.name("q")).sendKeys("kalam");//b
				Thread.sleep(5000);
	       List<WebElement> ls= d.findElements(By.xpath("ul[@role='listbox']/li/descendant::span"));
	      System.out.println(ls.size());*/
		/*d.get("https://www.google.co.in");//3

				d.findElement(By.name("q")).sendKeys("kalam");//2
				   Thread.sleep(5000);  //1
		        //take kalam inspect and  
		List<WebElement> l = d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		System.out.println("total count Of suggestion is:"+l.size());
		 */
		Scanner s= new Scanner(System.in);
		System.out.println("Enter A String");
		String x= s.nextLine();
		System.out.println("Enter a Deired String");
		String y= s.nextLine();

		Thread.sleep(5000);
		d.get("https://www.google.co.in");
		Thread.sleep(5000);                  
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(5000);
		List<WebElement> l = d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
		Thread.sleep(5000);
		System.out.println("Size of an Elemeent Text: "+l.size());
		int flag=0;
		for(WebElement e:l)
		{
			if(y.equalsIgnoreCase(e.getText()))
			{
				flag=1;
				System.out.println("Match String Is found");
				System.out.println("Desiresd Match Element  is :"+e.getText());
			}

		}
		if(flag==0)
		{
			System.out.println("No Match is found");
			d.close();

		}

	}

}
