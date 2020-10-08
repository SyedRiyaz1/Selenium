package DDTFramework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class DDT_xls1 
{

	public static void main(String[] args) throws Exception 
	{
	Workbook wb= new HSSFWorkbook();
	wb.createSheet("ShafiyaBeta");
	File f= new File("MyExcelFile.xls");
	FileOutputStream fo= new FileOutputStream(f);
	wb.write(fo);
	wb.close();
	fo.close();

	}

}
