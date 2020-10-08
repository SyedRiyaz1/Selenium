package stevejobs;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//not working please check down line 65 remove do corrcetion
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReport 
{
	public ExtentReport(String string, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception 
	{
		// give the Target location path
				// ie goto>Right click > See path avialable
		//ExtentReport er= new ExtentReports("E:\\batch 244\\mavenproject\\targetResults.html",fals);
		ExtentReport er=new ExtentReport("E:\\batch 244\\abdulkalam\\src\\stevejobs\\ExtentReport.java",false);
		ExtentTest et=er.StartTest("Google site tittle Test");
		 
		// open Browser
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		
		ChromeDriver d= new ChromeDriver();

		// launch site
		d.get("https://www.google.co.in/");
		WebDriverWait w= new WebDriverWait(d,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

		// TestCase 1 (TitleTesting)
		String actual =d.getTitle(); // from the website
		String expected="Google"; // match the string

		if(expected.equals(actual))
		{
			et.log(LogStatus.PASS,"Google test password");	
		}
		else
		{ 
			// take copy screen shot and  to hard disk to store
			 File src=d.getScreenshotAs(OutputType.FILE);
			 File des=new File("E:\\batch 244\\abdulkalam2\\target\\screenshot1.png");
			 FileHandler.copy(src, des);
			 // copy the Screen capture
			 et.log(LogStatus.FAIL,"title wrong and see"+ et.addScreenCapture("E:\\batch 244\\abdulkalam2\\target\\screenshot1.png"));
		

	}

}

	private ExtentTest StartTest(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


