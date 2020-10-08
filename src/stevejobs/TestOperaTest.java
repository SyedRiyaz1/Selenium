package stevejobs;

import org.openqa.selenium.opera.OperaDriver;

public class TestOperaTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver","E:\\batch 244\\operadriver_win64\\operadriver.exe");
		OperaDriver d = new OperaDriver();
		d.get("https://www.prajavani.net/");
		
	}

}
