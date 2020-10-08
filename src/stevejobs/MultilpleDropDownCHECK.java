package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultilpleDropDownCHECK 
{
           
	    public static void main(String[] args) 
	{     // open Browser
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();
		  
		   // lunch sited
d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select_multiple");
    d.switchTo().frame("iframeResult");
    
WebElement lwb= d.findElement(By.name("cars")); 
Select s= new Select(lwb);
if(s.isMultiple())
{
System.out.println("Multiple Select drop-down");	
}
else
{
	System.out.println("Single Select drop-down");
}
    

	}

}
