package DDTFramework;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Date_Value_In_Given_Cell {

	public static void main(String[] args) throws Exception 
	{

		Workbook wb=new XSSFWorkbook();

		// craete a new Sheet
		Sheet sh= wb.createSheet("Riyaz");
		//  colum shell width
		sh.setColumnWidth(0, 10000);
		// Font Define
		Font fn=wb.createFont();
		fn.setFontHeightInPoints((short) 11);
		//fn.setFontName("serif");
		fn.setColor(IndexedColors.GREEN.index);
		fn.setItalic(true);
		fn.setBold(true);
		//Allignment of Text in cell   	fn.setItalic(true);
		CellStyle cs=wb.createCellStyle();
		cs.setAlignment(HorizontalAlignment.CENTER);
		cs.setVerticalAlignment(VerticalAlignment.CENTER);
		cs.setFont(fn);
		// goto 1st row and  1st Column
		Row r=sh.createRow(0);
		// set row height
		r.setHeight((short) 1000);
		//cell
		Cell c=r.createCell(0);
		//c.setCellStyle(cs);
		//c.setCellValue("AbdulKalam");
		// save and close
		File f=new File("COLORDATETest11.xlsx");
		// Create Date
		CreationHelper ch=wb.getCreationHelper();
		cs.setDataFormat(ch.createDataFormat().getFormat("d/m/yyyy h:mm"));
		cs.setFont(fn);
		Date d= new Date();
		c.setCellStyle(cs);
		c.setCellValue(d);
		// shet
		FileOutputStream fo= new  FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();

	}

}
