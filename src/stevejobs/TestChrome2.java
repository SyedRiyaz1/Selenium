package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			        "E:\\batch 244\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.varthabharati.in/");
	//driver.get("https://www.espncricinfo.com/");

	}

}
