package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowserRun 
{
//WebDriver d=null;
	public static void main(String[] args) 
	{
	WebDriver d=null;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Name");
	String str=s.nextLine();
	
	 if(str.equals("chrome"))
	 {
		 
		          System.setProperty("webdriver.chrome.driver",
		  			"E:\\batch 244\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.espncricinfo.com/"); 
		 
	 }  
	 if(str.equals("firefox"))
	 {
		      System.setProperty("webdriver.gecko.driver",
				"E:\\batch 244\\firefoxdriver.exe");
		        d=new FirefoxDriver();
		      d.get("http://vijaykarnatakaepaper.com/");
	 }
	 
	 if(str.equals("ie"))
	 {
		      System.setProperty("webdriver.ie.driver",
				"E:\\\\batch 244\\iedriverserver.exe");
		        d=new InternetExplorerDriver();
		      d.get("https://www.seleniumhq.org");
	 }
	 
	 else
	  System.out.println("Donot match Website");
	 System.exit(0);
	}
}
