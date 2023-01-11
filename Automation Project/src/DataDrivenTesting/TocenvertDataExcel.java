package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TocenvertDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/excelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		workbook.getSheet("sheet1").getRow(0).createCell(3).setCellValue("Name");
		FileInputStream fos = new FileInputStream("")

}
}