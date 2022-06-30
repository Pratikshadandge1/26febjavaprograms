package ReadExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  { 

	 FileInputStream file =new  FileInputStream("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\TestData\\testdata1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = excel.getRow(0).getCell(0).getStringCellValue();
    String value1 = excel.getRow(0).getCell(1).getStringCellValue();
     String value3 = excel.getRow(0).getCell(2).getStringCellValue();

     System.out.println(value);
	 System.out.println(value1);
	 System.out.println(value3);

	}
	
	
	
	}


