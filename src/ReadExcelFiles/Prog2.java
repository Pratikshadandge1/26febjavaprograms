package ReadExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    FileInputStream file1 =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\TestData\\test2.xlsx");
   Sheet excelSheet = WorkbookFactory.create(file1).getSheet("Sheet2");
	for(int row=0;row<=2;row++)
	{
	   for(int col=0;col<=4;col++)
	   {
          
		  String value = excelSheet.getRow(row).getCell(col).getStringCellValue();


	       System.out.println(value + " ");
	   }
	 System.out.println();
	}
	}
}

