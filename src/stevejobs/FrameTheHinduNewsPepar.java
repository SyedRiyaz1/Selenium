package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTheHinduNewsPepar 
{

	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		  Thread.sleep(5000);
		   d.get("https://www.thehindu.com");
		   Thread.sleep(10000);
		   // switch To frame
//d.switchTo().frame(arg0)
	List<WebElement> l=d.findElements(By.xpath("(//frame)|(//iframe)"));
	 Thread.sleep(5000);
	//System.out.println("List of parent frame in page:"+lw.size());
	 System.out.println("total frame in the page:"+l.size());
	 
	// count of child frame
	 
	 for(int i=0;i<l.size();i++)
     {
    d.switchTo().frame(l.get(i));
	List<WebElement> lc=d.findElements(By.xpath("(//frame)|(//iframe)"));
	System.out.println("count child frame in the "+i+" frame:"+lc.size());
      if(lc.size()!=0)
      {
    	 for(int j=0;j<lc.size();j++) 
    	 {
    		  d.switchTo().frame(lc.get(j)); 
    		  List<WebElement> sub=d.findElements(By.xpath("(//frame)|(//iframe)"));
    		  System.out.println("count Subchild frame in the "+j+" frame:"+sub.size());
    		  d.switchTo().parentFrame();
    	 }
    	 
      }
	
	 d.switchTo().defaultContent();
     }
	d.close();
	}
            
}
