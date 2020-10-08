package DDTFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.examples.CellStyleDetails;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.model.Styles;

import com.oracle.webservices.internal.api.EnvelopeStyle.Style;

public class Read_Data_From_Excel_AND_Write_To_Excel_Uing_Hash_Map_Font 
{

public static void main(String[] args) throws Exception
	{
	    //open excel file and in read mode
		File f= new File("E:\\ReadData_from_Excel_1.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		// now sheet 1
		Sheet sh=wb.getSheet("Sheet1");

		int nour=sh.getPhysicalNumberOfRows();
		System.out.println("Numbers of rows in used:"+nour);
		// Number of column is used
		int nouc=sh.getRow(0).getLastCellNum();
		System.out.println("Numbers of used column:"+nouc);
		// get data from sheet to consol
		//define various style along with fonts
		HashMap<String,CellStyle> style= new HashMap<String,CellStyle>();
		Font f1=wb.createFont();
		f1.setFontHeight((short) 11);
		f1.setFontName("verdana");
		f1.setColor(IndexedColors.PINK.index);
		f1.setBold(true);
	//
		// cell back ground color style,font
		CellStyle cs1=wb.createCellStyle();
		cs1.setFont(f1);
		cs1.setAlignment(HorizontalAlignment.CENTER);
		cs1.setVerticalAlignment(VerticalAlignment.CENTER);
	style.put("Header Style", cs1);
	
	
	
	Font f2=wb.createFont();
	f2.setFontHeight((short) 11);
	f2.setFontName("verdana");
	f2.setColor(IndexedColors.PINK.index);
	f2.setBold(true);
//
	CellStyle cs2=wb.createCellStyle();
	cs2.setFont(f2);
	cs2.setAlignment(HorizontalAlignment.CENTER);
	cs2.setVerticalAlignment(VerticalAlignment.CENTER);
style.put("pass Style", cs2);


Font f3=wb.createFont();
f3.setFontHeight((short) 11);
f3.setFontName("verdana");
f3.setColor(IndexedColors.PINK.index);
f3.setBold(true);
//
CellStyle cs3=wb.createCellStyle();
cs1.setFont(f3);
cs1.setAlignment(HorizontalAlignment.CENTER);
cs1.setVerticalAlignment(VerticalAlignment.CENTER);
style.put("fail Style", cs3);

// create  result Column Heading as Current  Date and time
//MM> moth in number MMM> month in string
SimpleDateFormat sf= new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
Date d= new Date();
// header
Cell hc=sh.getRow(0).createCell(nouc);;
hc.setCellValue(sf.format(d));
hc.setCellStyle(style.get("Header Style"));
// auto fit for cell column
sh.autoSizeColumn(nouc);
// get data from  sheet1 and msanipulate
// 1st row (index=0) has column names
// start work from second row(index=1)
// number of row is used
for(int i=1;i<nour;i++)
{
	int x=(int) sh.getRow(i).getCell(0).getNumericCellValue();
	int y=(int) sh.getRow(i).getCell(1).getNumericCellValue();
	int z=(int) sh.getRow(i).getCell(2).getNumericCellValue();
	int w=x+y;
	if(z==w)
	{
		Cell c2=sh.getRow(i).createCell(nouc);
		c2.setCellValue("pass");
		c2.setCellStyle(style.get("pass style"));
		
		Cell c3=sh.getRow(i).createCell(nouc);
		c2.setCellValue("fail");
		c2.setCellStyle(style.get("times"));
	}
	
}
    // save and close
     FileOutputStream fo=new FileOutputStream(f);
     wb.write(fo);
     fo.close();
     wb.close();
	}

}
