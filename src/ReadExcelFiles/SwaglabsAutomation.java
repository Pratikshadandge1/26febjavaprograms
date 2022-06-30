	package ReadExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsAutomation {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver .manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
	WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	
	FileInputStream file =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\TestData\\test2.xlsx");
    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");

      username.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
     password.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
 
    WebElement Loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
    Loginbutton.click();

	

	}

}
