package DataDrivenTestUsingCsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
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


public class DataDriven_Using_Csv 
{

	public static void main(String[] args) throws Exception 
	{ 
		//  open file 1 for Reading
		File f1= new File("Datacsv.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader br= new BufferedReader(fr);

		File f2= new File("Data_csv_FileResult.txt");
		FileWriter fw= new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String line;
		WebDriver driver =null;
		SimpleDateFormat sf= new SimpleDateFormat("dd-MM-yyy-hh-mm-ss");
		Date dt= new Date();
		while((line=br.readLine())!=null)
		{
			String[] pieces=line.split(",");
			String bn=pieces[0];
			String userid=pieces[1];
			String uidcriteria=pieces[2];
			String pwds=pieces[3];
			String pwdscriteria=pieces[4];
			// handling try cath in all iteration
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
				driver.get("https://gmail.com");
				WebDriverWait wait= new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
				driver.findElement(By.name("identifier")).sendKeys(userid);
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				// for blank
				// fixed state
				 Thread.sleep(5000);
				if(uidcriteria.equalsIgnoreCase("blank")&& driver.findElement(By.xpath("(//*[contains(text(),'Enter an email ')])[2]")).isDisplayed())
				{
					bw.write( "Test Passed for blank userid");
					bw.newLine();
					
				}
				// invalid
				// user id is wrong or invalid with respective database
				else if(uidcriteria.equalsIgnoreCase("invalid")&& driver.findElement(By.xpath("(//*[contains(text(),'Enter an email ')])[2]")).isDisplayed())
				{
					bw.write( "Test Passed for invalid userid");
					bw.newLine();
					 Thread.sleep(5000);
				}
				// for  valid user enter password
				else if(uidcriteria.equalsIgnoreCase("valid") && driver.findElement(By.name("password")).isDisplayed() )
				{
					// Enter password peform password validation	
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
					driver.findElement(By.name("password")).sendKeys(pwds);
					driver.findElement(By.xpath("//*[text()='Next']")).click();
					 Thread.sleep(5000);
					// conditions with error message
					if(pwdscriteria.equalsIgnoreCase("blank")&& driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
					{
						bw.write("Login Test Passed for blank password");
						bw.newLine();
					
					}
					// invalid password
					else if(pwdscriteria.equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("//*[contains( text(),'Wrong password')]")).isDisplayed())
					{
						bw.write( "Login Test Passed for invalid password");
						bw.newLine();
						
					}
					// valid password
					else if(pwdscriteria.equalsIgnoreCase("valid")&&driver.findElement(By.xpath("//*[contains( text(),'Compose')]")).isDisplayed())
					{
						bw.write( "Login Test Passed for valid password");
						bw.newLine();
						
					}
                       
					// Get  Screen Shot and Attach to the ExtentReport 
					else
					{
						// date format in string 
						String ssname =sf.format(dt)+".png";
						// attach screen shot *******
						// Type Casting  webDriver To Take Scrren shot
						File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						// Create Empty file in project
						File Des=new File(ssname);
						FileHandler.copy(Src, Des);
						bw.write( " Gmail Password Test failed" +(Des.getAbsolutePath()));

					}
				}
				else
				{
					// date format in string 
					String ssname =sf.format(dt)+".png";
					// attach screen shot *******
					// Type Casting  webDriver To Take Scrren shot
					File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					// Create Empty file in project
					File Des=new File(ssname);
					FileHandler.copy(Src, Des);
					bw.write( " GmailUserid Test failed" +(Des.getAbsolutePath()));
					bw.newLine();
				}	

			}
			catch(Exception ex)
			{

				// date format in string 
				String ssname =sf.format(dt)+".png";
				// attach screen shot *******
				// Type Casting  webDriver To Take Scrren shot
				File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// Create Empty file in project
				File Des=new File(ssname);
				FileHandler.copy(Src, Des);
				bw.write(ex.getMessage()+(Des.getAbsolutePath()));

			}
			finally
			{

				//driver.close();
			}

		}

		fr.close();
		br.close();
		fw.close();
		bw.close();
	}

}


