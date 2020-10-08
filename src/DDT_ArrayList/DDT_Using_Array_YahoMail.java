package DDT_ArrayList;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DDT_Using_Array_YahoMail 
{

	public static void main(String[] args) throws IOException, Exception 
	{

		ArrayList<String> uid= new ArrayList<String>();
		ArrayList<String> uidcriteria= new ArrayList<String>();
		ArrayList<String> pwd= new ArrayList<String>();
		ArrayList<String> pwdcriteria= new ArrayList<String>();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number of Itterration");
		int noi=Integer.parseInt(s.nextLine());	
		for(int i=0;i<noi;i++)
		{
			System.out.println("Enter Userid");
			uid.add(s.nextLine());
			Thread.sleep(5000);
			System.out.println("Enter uesrid Criteria(valid/invalid/blank)");
			uidcriteria.add(s.nextLine());
			if(uidcriteria.get(i).equalsIgnoreCase("valid"))
			{
				System.out.println("Enter password");
				pwd.add(s.nextLine());
				System.out.println("Enter password Criteria(valid/invalid/blank)");	
				pwdcriteria.add(s.nextLine());
			}
			else
			{			
				pwd.add("N/A");
				pwdcriteria.add("N/A");				
			}
		}
		// enter BrowserName
		System.out.println("Enter Browser Name");
		String bn=s.nextLine();
		ExtentReports er= new ExtentReports("ExtenTreportTest.html",false);
		ExtentTest et=er.startTest("ExtentTestWithArray");
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date dt=new Date();
		sf.format(dt);
		WebDriver driver=null;
		// Number of Iteration for Browser 
		for(int i=0;i<noi;i++)
		{
			try
			{
				if(bn.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
					System.setProperty("webdriver.chrome.silentoutput","true");
					driver= new ChromeDriver();
				}
				else if(bn.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver","E:\\batch 244\\geckodriver.exe");
					System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"sample.test");
					driver= new FirefoxDriver();
				}
				//set ie Browser zoom Level is Exact 100 % manuvally 
				else if(bn.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver","E:\\batch 244\\IEDriverServer.exe");
					driver= new InternetExplorerDriver();
				}
				else if(bn.equalsIgnoreCase("opera"))
				{
					System.setProperty("webdriver.opera.driver","E:\\batch 244\\operadriver_win64\\operadriver_win64\\operadriver.exe");
					OperaOptions oo= new OperaOptions();
					// coped from  C drive
					oo.setBinary("C:\\Users\\home\\AppData\\Local\\Programs\\Opera\\64.0.3417.92\\opera.exe");
					driver= new OperaDriver(oo);
				}
				else 
				{
					System.setProperty("webdriver.edge.driver", "E:\\batch 244\\msedgedriver.exe");
					EdgeOptions eo=new EdgeOptions();
					// coped from  C drive take without  version also \78.0.276.19 run the progarm
					eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Beta\\Application\\msedge.exe");
					driver=new EdgeDriver(eo);
					System.setProperty("webdriver.edge.silentoutput","true");
				}
				// common code for all browsers
				driver.manage().window().maximize();
				driver.get("https://login.yahoo.com/");
				WebDriverWait w= new WebDriverWait(driver,20);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
				driver.findElement(By.xpath("//*[@name='username']")).sendKeys(uid.get(i));
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[2]/input")));
				driver.findElement(By.xpath("//form/div[2]/input")).submit();
				Thread.sleep(5000);
				//criteria should be Tested
				if(uidcriteria.get(i).equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[@id='username-error']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"For invalid,  this user error Messages is Displayed");
				}
				else if(uidcriteria.get(i).equalsIgnoreCase("blank") && driver.findElement(By.xpath("//*[@data-error='messages.ERROR_INVALID_USERNAME']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"For blank user, this error Messages is Displayed");
				}
				else if(uidcriteria.get(i).equalsIgnoreCase("valid") && driver.findElement(By.xpath("//form/div[2]/input")).isDisplayed())
				{
					Thread.sleep(5000);
					// enter password and perforpassord validation
					//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[2]/input")));
					driver.findElement(By.xpath("//form/div[2]/input")).sendKeys(pwd.get(i),Keys.ENTER);
					Thread.sleep(5000);
					//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Next')]")));
					//driver.findElement(By.xpath("//*[contains(text(),'Next')]")).submit();
					//check criteria
					if(pwdcriteria.get(i).equalsIgnoreCase("blank") && driver.findElement(By.xpath("//*[@class='error-msg']")).isDisplayed())
					{
						et.log(LogStatus.PASS,"For blank password, this error Messages is Displayed");

					}
					else if(pwdcriteria.get(i).equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Invalid password.')]")).isDisplayed())
					{
						et.log(LogStatus.PASS,"For invalid password, this error Messages is Displayed");
					}

					else if(pwdcriteria.get(i).equalsIgnoreCase("valid") && driver.findElement(By.xpath("(//*[text()='Compose']) | (//*[text()='Mail'])[2]")).isDisplayed())
					{
						et.log(LogStatus.PASS,"For valid userid and valid password");
					}
					// attach screen shot and attach to extent Report
					else
					{
						String ssname= sf.format(dt)+".png";
						File  Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dest= new File (ssname);
						FileHandler.copy(Src, dest);
						et.log(LogStatus.FAIL, "Gmail Test Password fail"+et.addScreenCapture(dest.getAbsolutePath()));
					}
				}
				else
				{
					String ssname= sf.format(dt)+".png";
					File  Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest= new File (ssname);
					FileHandler.copy(Src, dest);
					et.log(LogStatus.FAIL, "Gmail userid fail"+et.addScreenCapture(dest.getAbsolutePath()));
				}
			}
			catch(Exception Ex)
			{
				String ssname= sf.format(dt)+".png";
				File  Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest= new File (ssname);
				FileHandler.copy(Src, dest);
				et.log(LogStatus.FAIL, Ex.getMessage()+et.addScreenCapture(dest.getAbsolutePath()));
			}
			finally
			{
				//close site
				driver.close();
			}
		}		  
		er.endTest(et);
		er.flush();
	}
}
