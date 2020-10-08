package DDTFramework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.Rows;
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

public class Color_font_format 
{

	public static void main(String[] args) throws Exception 
	{
		// ceate workBook
Workbook wb= new XSSFWorkbook();
        // Create a sheet
Sheet sh=wb.createSheet("RiyazInamdar");
// font
Font fn= wb.createFont();
fn.setItalic(true);
fn.setFontHeight((short) 10);
fn.setFontName("New Roman");
fn.setColor(IndexedColors.RED.index);
fn.setBold(true);
// style
CellStyle cs= wb.createCellStyle();
cs.setAlignment(HorizontalAlignment.CENTER);
cs.setVerticalAlignment(VerticalAlignment.CENTER);
   cs.setFont(fn);
// Create Rows
Row r=sh.createRow(0);
     r.setHeight((short) 111);
   
Cell c=r.createCell(0);
     c.setCellStyle(cs);
     c.setCellValue("Kalam");
File f= new File("ColorSheet420.xlsx");
FileOutputStream fo= new FileOutputStream(f);
wb.write(fo);
wb.close();
fo.close();


	}

}
