package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetechIntigerAndBooleanData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/excelData.xlsx");
		
		Workbook workBook = WorkbookFactory.create(fis);
		 
		Sheet sheet = workBook.getSheet("sheet2");
		Row row = sheet.getRow(0);
		
		sheet.get
	}

}
