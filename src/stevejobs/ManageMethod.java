package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod 
{

	public static void main(String[] args) throws Exception
	{
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// https://outlook.live.com
		   d.get("https://flipkart.com");
		   Thread.sleep(5000);
		   // Find the width of browser Window
		int w =d.manage().window().getSize().getWidth();
		   // Find the height of browser Window
          int h =d.manage().window().getSize().getHeight();
          // get size is Dimension so we need to Define
          System.out.println("width is:"+w); 
          //it provide default size and width
          System.out.println("height is:"+h);
          System.out.println(w+" "+h);
          
          int x=  d.manage().window().getPosition().getX();
          int y=  d.manage().window().getPosition().getY();
          System.out.println(x+" "+y);
          System.out.println(">..........Set Postion........");
          // if need alter the size set the Dimension
          Dimension dd= new Dimension(800,700);
          d.manage().window().setSize(dd);
     System.out.println(".......AFTER AlTER SIZE AND set daimension.......");
		int w1 =d.manage().window().getSize().getWidth();
        int h1 =d.manage().window().getSize().getHeight();
 
        System.out.println("width2 is:"+w1); 
        System.out.println("height2 is:"+h1);
        System.out.println(w1+" "+h1);
        System.out.println(">..........Find Postion........");

        // FIND THE position 
      int px=  d.manage().window().getPosition().getX();
      int py=  d.manage().window().getPosition().getY();
      System.out.println(px+" "+py);
      System.out.println(">..........Set Postion........");
           // set postion
      Point  p= new Point (500,300);   
        d.manage().window().setPosition(p);
         
        int px1=  d.manage().window().getPosition().getX();
        int py1=  d.manage().window().getPosition().getY();
        System.out.println(px1+" "+py1);
        System.out.println(">..........Set Postion........");
        d.manage().window().maximize();
        d.manage().window().fullscreen();
	}

}
