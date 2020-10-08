package DDTFramework;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT_xlsx2 
{

	public static void main(String[] args) throws Exception 
	{
		Workbook wb= new XSSFWorkbook();
		wb.createSheet("Shafiya");
		File f= new File("MyExcelFile2.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
	

	}

}
