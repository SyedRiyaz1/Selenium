package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome1 {

	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch 244\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");

	}

}

