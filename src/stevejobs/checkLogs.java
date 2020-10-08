package stevejobs;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;

public class checkLogs 
{

	    public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		   //check when browser not completely loaded
		
		List<LogEntry>lnt= 	d.manage().logs().get("browser").getAll();
		if(lnt.size()!=0)
		{
		for(LogEntry inc:lnt)
		  {
		  System.out.println(inc.getMessage());
		   
	      }
		}
		else
		{
			
		System.out.println("No Error Logs");	
		}
		d.close();
		}		
		
}
			
	
	
