package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class MultiBrowser31oct 
{

	public static void main(String[] args) 
	{
     WebDriver d= null;
     Scanner s= new Scanner(System.in);
     System.out.println("Enter Browser Name");
     String  x= s.nextLine();
      if(x.equalsIgnoreCase("chrome"))
      {
    	  
    	System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
    	d= new ChromeDriver();
      }
      else if(x.equalsIgnoreCase("firefox"))
      {

	    System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
        d= new FirefoxDriver();	
      }
      else if(x.equalsIgnoreCase("msedge"))
      {
    System.setProperty("webdriver.edge.driver","E:\\batch 244\\msedgedriver.exe");
    EdgeOptions Edgop= new EdgeOptions();
    Edgop.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Beta\\Application\\msedge.exe");
      d= new EdgeDriver(Edgop);
      }
      
      else if(x.equalsIgnoreCase("opera"))
      {
      System.setProperty("webdriver.opera.driver","E:\\batch 244\\operadriver_win64\\operadriver_win64\\operadriver.exe");
      OperaOptions opera=new OperaOptions();
      opera.setBinary("C:\\Users\\home\\AppData\\Local\\Programs\\Opera\\64.0.3417.61\\opera.exe");
      d=new OperaDriver(opera);
	  }
      
      else if(x.equalsIgnoreCase("ie"))
      {
      System.setProperty("webdriver.ie.driver","E:\\batch 244\\IEDriverServer.exe");
      d= new InternetExplorerDriver();
      }
     
      
      
      d.manage().window().maximize();
      d.get("https://facebook.com");
}   

}
