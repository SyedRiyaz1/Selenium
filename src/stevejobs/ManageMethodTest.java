package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodTest 
{

	 public static void main(String[] args) throws Exception 
	{

		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://flipkart.com");
		   Thread.sleep(5000);
		   //check and set the  size of
		  int w= d.manage().window().getSize().getWidth();
		  int h= d.manage().window().getSize().getHeight();
		  System.out.println(w+" "+h);
		      //  get size return object Dimension call
		  Dimension dd= new Dimension(800,400);
		 d.manage().window().setSize(dd);
		 // check position
		int px= d.manage().window().getPosition().getX();
		int py= d.manage().window().getPosition().getY();
		  System.out.println(px+" "+py);
		  // define pointer to set coordinate
		  Point p= new Point(500,300); // selenium
		  // set the postion 
		  d.manage().window().setPosition(p);
		  // maxsize
		  d.manage().window().maximize();  // maximize with browser tool bar
		  // full screen
		  d.manage().window().fullscreen();// maximize without tool bar
		  d.close();
		  
		  /* in this progarm we need to do
		   * 1> getsize is a  Dimension class  so need create object
		   * 2> and setsize
		   * >>>
		   * in postion class also same
		   * 1> getpostion  is pointer class so  need to create object
		   * 2> set the postion
		   * >>>>>>>>>>>>>
		   * 
		   * 
		   * 
		   *  
		   *  
		   */

		 
		  
		  


	}

}
