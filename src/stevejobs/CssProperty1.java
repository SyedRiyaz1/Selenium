package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssProperty1 {

	public static void main(String[] args) throws Exception {
		// lunch site=

		  System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://www.google.com");
		   // lcocate an Element
		   //get Details of gmail link before geting focus
		  WebElement  e= d.findElement(By.linkText("Gmail"));
		  String x1=e.getCssValue("opacity"); // default is 1(one full color no shading color)
		  String y1=e.getCssValue("text-decoration");
          System.out.println("Details of gmail link before getting focus"); 
          System.out.println(x1+""+y1);
		  Actions a= new Actions(d);
          a.moveToElement(e).build().perform();
          Thread.sleep(5000);
         // get details of gmail link after geting Focus
         String x2=e.getCssValue("opacity");
         String y2=e.getCssValue("text-decoration");
         System.out.println("details of gmail link after geting focus");
         System.out.println(x2+""+y2);
         // close site();
                   //String R=e.getTagName();
                  // System.out.println("Riyaz Tagname:"+R);
                         //String R1=e.getAttribute(R);
                        // System.out.println("Riyaz Attribute value:"+R1);
                        // System.out.println("GetLoction"+e.findElement(arg0));
        String ht =e.getAttribute("gsr");
        System.out.println("Gmail class name"+ht);
        
         
	}

}
