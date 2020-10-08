package DDTFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  SetCellMoveMent
{

	public static void main(String[] args) throws Exception 
	{
		// declare global objects
		
	    long timeStart=	System.currentTimeMillis();
		WebDriver driver=null;
		WebDriverWait wait=null;
		// java date
		SimpleDateFormat sf= new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d= new Date();
		// first create Excel sheet in drive and Reading and writing pupose
		File f= new File("E:\\testData-copy.xlsx");
		// read file from  drive
		FileInputStream fi= new FileInputStream(f);
		//new WorkbookFactory();
		Workbook wb= WorkbookFactory.create(fi);
		Sheet sh= wb.createSheet();
		sh.getColumnWidth(1200);
		
	}
}