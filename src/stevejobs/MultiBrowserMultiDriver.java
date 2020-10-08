package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserMultiDriver 
{

	public static void main(String[] args) 
	{
		  Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		WebDriver d=null;
		if(str.equals("chorme"))
		{
		System.setProperty("webdriver.chrome.driver",
				   "E:\\batch 244\\chromedriver.exe");
	         d= new ChromeDriver();
		    d.get(" http://www.vijaykarnatakaepaper.com/");
		}
		else if(str.equals("firefox"))
		{
	      System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
	       d = new FirefoxDriver();
	      d.get(" https://mail.google.com/mail/u/0/?tab=rm&ogbl");
	      
	   
		}
		else if(str.equals("ie"))
		{		
	     System.setProperty("webdriver.ie.driver","E:\\batch 244\\IEDriverServer.exe");
	     d = new InternetExplorerDriver();
	     d.get("https://www.facebook.com/");
		}
		else 
			System.out.println("Wrong Website");
		     
		      System.exit(0);
		      d.close();

}
}