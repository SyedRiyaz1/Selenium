package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFireFox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.udemy.com");
		
	}

}
