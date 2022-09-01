package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelPath,String sheetname,int rowcount,int cellcount) throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row row = sh.getRow(rowcount);
	Cell cell = row.getCell(cellcount);
	String data = cell.getStringCellValue();
	return data;
	}
      public int getRowCount(String excelPath,String sheetname) throws IOException {
    	  FileInputStream fis = new FileInputStream(excelPath);
      Workbook wb = WorkbookFactory.create(fis);
      Sheet sh = wb.getSheet(sheetname);      
     int rc = sh.getLastRowNum();
     return rc;
      
      }
      public void writeExcelData(String excelPath,String sheetname,int rowCount,int cellcount,String data) throws IOException {
    	  FileInputStream fis = new FileInputStream(excelPath);
    	  Workbook wb = WorkbookFactory.create(fis);    	  
    	  Sheet sh = wb.getSheet(sheetname);
    	  Row row = sh.getRow(rowCount);
    	  Cell cell = row.getCell(cellcount);
    	  cell.setCellValue(data);
    	  FileOutputStream fos = new FileOutputStream(excelPath);
    	  wb.write(fos);
      }
}
