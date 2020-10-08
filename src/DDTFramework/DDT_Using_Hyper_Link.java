package DDTFramework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT_Using_Hyper_Link 
{

	public static void main(String[] args) throws Exception 
	{
		// create WorkBook
	Workbook	wb= new XSSFWorkbook();
	// Create sheet
	Sheet sh=wb.createSheet("Riyaz");
	//sheet Column width
	sh.setColumnWidth(0, 10000);
	// font 
	Font fn=wb.createFont();
	// points to 11
	fn.setFontHeightInPoints((short) 11);
	fn.setFontName("Times");
	fn.setColor(IndexedColors.BLUE.index);
	fn.setItalic(true);
	fn.setBold(true);
	//Style Alignment
	
	
	CellStyle cs=wb.createCellStyle();
	cs.setAlignment(HorizontalAlignment.CENTER );
	cs.setVerticalAlignment(VerticalAlignment.CENTER);
	cs.setFont(fn);
	
	
	// Rows
	Row r=sh.createRow(0);
	//row Height set points
	r.setHeight((short) 1000);
	r.setRowStyle(cs);
	// date  
	
	
	Cell c=r.createCell(0);
	c.setCellStyle(cs);
	//c.setCellFormula("HYPERLINK(\"https://www.google.co.in\",\"clickhere\")");
	// before start and after end Sentance 
	c.setCellFormula("HYPERLINK(\"https://www.google.co.in\",\"clickhere\")");
	File f= new File("HyperLINK.XLSX");
	FileOutputStream fo= new  FileOutputStream(f);
	wb.write(fo);
	wb.close();
	fo.close();
	}

}
