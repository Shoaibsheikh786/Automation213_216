package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFullExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//1. File 
		File file=new File("./mydata.xlsx");
		
		//2. FileInputStream 
		FileInputStream fis=new FileInputStream(file);
		//3. Workbook: sheet : row : col(cell)
		Workbook wb=WorkbookFactory.create(fis);
		//import org.apache.poi.ss.usermodel.WorkbookFactory;
		Sheet sheet=wb.getSheetAt(0);
		//loop : for
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);  //i-> 0,row-> first row
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell=row.getCell(j);   //j->1 
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
