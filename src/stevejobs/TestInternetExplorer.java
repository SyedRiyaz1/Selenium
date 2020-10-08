package stevejobs;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestInternetExplorer 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.ie.driver","E:\\batch 244\\Iedriverserver.exe");
	  
   InternetExplorerDriver d= new InternetExplorerDriver();
         d.get("https://www.espncricinfo.com/scores/");
	}

}
