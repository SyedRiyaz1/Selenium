package stevejobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie 
{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
ChromeDriver d= new ChromeDriver();
d.manage().window().maximize();
// delete all previous existing cookies
        d.manage().deleteAllCookies();
        // lunch site
        d.get("https://google.co.in");
        // browser reload automatically cookies
        // check how many cookies are loaded 
        Set<Cookie> stc=  d.manage().getCookies();
         // Collect in list
       List<Cookie> lc= new ArrayList<Cookie>(stc);
       System.out.println("collection cookis is:"+lc.size());
       for(Cookie c:lc)
   {
     System.out.println("collection cookis in each collection:"+c.getName()+" :"+c.getDomain());
  
   }
       System.out.println("...........................");
       // add our own cookies
       Cookie n= new Cookie("batch244","Magnesia");
       
       d.manage().addCookie(n);
     // check our added own cookies
       Set<Cookie>st=d.manage().getCookies();
       List<Cookie> cl= new ArrayList<Cookie>(st);
       System.out.println("list of cookis in :"+cl.size());
       for(Cookie ct:cl)
       {
         System.out.println(" own cookies also added cookis in each collection:"+ct.getName()+" :"+ct.getDomain());
      
       }
       // Delete cookies
       System.out.println("...........Delete...........");
       
           d.manage().deleteCookie(n);
           d.manage().deleteCookieNamed("UULE");
            // check for Deleted cookies
           Set<Cookie>stt=d.manage().getCookies();
           List<Cookie> clt= new ArrayList<Cookie>(stt);
           System.out.println("list of cookis in :"+clt.size());
           for(Cookie ctt:clt)
           {
        	 System.out.println("after deleted cookies are:"+ctt.getName()+""+ctt.getDomain());  
           }
           
}
}