package stevejobs;

import java.util.List;            // Executed

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_popUp_Message 
{   
	     public static void main(String[] krishna) throws Exception 
	     // lucnch site and set the property
	{   
	    	System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		    ChromeDriver d= new ChromeDriver();
		    d.manage().window().maximize();
		    Thread.sleep(5000);
		    d.get("https://www.google.co.in");
		    Thread.sleep(5000);
            // search
		    d.findElement(By.name("q")).sendKeys("kalam");
		    Thread.sleep(5000);
        //take kalam inspect and  
List<WebElement> l = d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span"));
System.out.println("total count Of suggestion is:"+l.size());
for(WebElement e:l)
{
	System.out.println(e.getText());
	
}



		   

	}

}
