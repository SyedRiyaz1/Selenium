package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_fax_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"sample.test");
	 FirefoxDriver	d= new FirefoxDriver();
		d.get("https://google.com");

	}

}
