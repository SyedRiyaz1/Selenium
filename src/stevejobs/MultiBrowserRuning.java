package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserRuning 
{
	
	   public static void main(String[] args) 
	 {
		  // System.out.println("Enter a website");
		   Scanner s= new Scanner(System.in); 
		    WebDriver d =  null;   
			  
			  String str= s.next();
    	if(str=="chrome") {
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
        d= new ChromeDriver();
		d.get("http://varthabharati.erelego.com/");
	 }
	   /*else if (str=="firefox"){
		System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
	    d= new FirefoxDriver();
		d.get("https://mail.google.com/mail/u/0/#inbox/");
}
      else if(str=="ie") {
		System.setProperty("webdriver.ie.driver","E:\\batch 244\\IEDriverServer.exe");
	    d= new InternetExplorerDriver();
		d.get("https://www.facebook.com//");
}*/
     /* else {
    	 System.out.println("wrong website"); 
      }*/
}
}
	


