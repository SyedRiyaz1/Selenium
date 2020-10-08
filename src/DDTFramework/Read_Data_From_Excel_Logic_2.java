package DDTFramework;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_Excel_Logic_2 
{
	public static void main(String[] args) throws Exception 
	{
		//open excel file and in read mode
		File f= new File("E:\\ReadData_from_Excel.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		// now sheet 1
		Sheet sh=wb.getSheet("Sheet1");
		// no of rows in used
		// no of used rows
		int nour=sh.getPhysicalNumberOfRows();
		System.out.println("Numbers of rows in used:"+nour);
		// Number of column is used
		int nouc=sh.getRow(0).getLastCellNum();
		System.out.println("Numbers of used column:"+nouc);
		// get data from sheet to consol
		// goto each row of sheet and get data	 here heading is string get string values only
		// in first loop heading are prasent in 1st row so index is 0
		// heading is got
		// Only String value
		for(int i=1;i<nour;i++)  // // 2nd start row purpose
		{
			for(int j=0;j<nouc;j++)  // column
			{
				//double x=sh.getRow(i).getCell(j).getNumericCellValue();
				//******** Convert all to string 
				sh.getRow(i).getCell(j).setCellType(CellType.STRING);
				String x= sh.getRow(i).getCell(j).getStringCellValue();
			//String x=sh.getRow(i).getCell(j).setCellType(CellType.STRING).getStringCellValue();
				System.out.print(x+    "\t");

			}
			System.out.println();
		}

	}
}
