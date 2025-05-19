package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//1. File Location
		File file=new File("./mydata.xlsx");
	//2. FileInputStream : Connection
		FileInputStream fis=new FileInputStream(file);
	//3. Workbook :sheets -> rows -> colum
		Workbook wb=WorkbookFactory.create(fis);
	//4. Read Sheet 
		Sheet sheet=  wb.getSheetAt(1);
    //5. Row row 
		Row row= sheet.getRow(3);
	//6. Cell 
		 Cell cell= row.getCell(1);
		 
    System.out.println(cell);
		 
		 
	}
	
}
