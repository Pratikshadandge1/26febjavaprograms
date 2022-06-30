package ReadExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Prog4 {

   public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
   System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
   WebDriver driver =  new ChromeDriver();
   driver.get("https://is.rediff.com/signup/register");
   driver.manage().window().maximize();

    WebElement frame= driver.findElement(By.xpath("//input[@name='fullname']"));
    WebElement emailidtxt= driver.findElement(By.xpath("//input[@id='emailid']"));
    WebElement passwordtxt= driver.findElement(By.xpath("//input[@id='pass']"));
    WebElement repasstxt= driver.findElement(By.xpath("//input[@id='repass']"));
    WebElement genderradiobutton= driver.findElement(By.xpath("//input[@value='f']"));
    WebElement daylist= driver.findElement(By.xpath("//select[@name='date_day']"));
    WebElement monthlist= driver.findElement(By.xpath("//select[@name='date_mon']"));
    WebElement yearlist= driver.findElement(By.xpath("//select[@name='Date_Year']"));
    WebElement location= driver.findElement(By.xpath("//input[@name='city']"));
    WebElement schooltxt= driver.findElement(By.xpath("//input[@name='school']"));
    WebElement college= driver.findElement(By.xpath("//input[@name='college']"));
    WebElement captcha= driver.findElement(By.xpath("//input[@name='fld_captcha']"));
    WebElement Signupbutton= driver.findElement(By.xpath("//Input[@type='submit']"));

     FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\TestData\\testdata4.xlsx");
     Sheet text = WorkbookFactory.create(file).getSheet("Sheet4");

     frame.sendKeys(text.getRow(0).getCell(0).getStringCellValue());
     Thread.sleep(500);
     emailidtxt.sendKeys(text.getRow(0).getCell(1).getStringCellValue());
     Thread.sleep(500);
     passwordtxt.sendKeys(text.getRow(0).getCell(2).getStringCellValue());
     Thread.sleep(500);
     repasstxt.sendKeys(text.getRow(0).getCell(3).getStringCellValue());
     Thread.sleep(500);
     genderradiobutton.click();
     Thread.sleep(500);
     Select s = new Select(daylist);
     s.selectByVisibleText(text.getRow(2).getCell(0).getStringCellValue());
     Thread.sleep(500);
     Select s1 = new Select(monthlist);
     s1.selectByVisibleText(text.getRow(2).getCell(1).getStringCellValue());
     Thread.sleep(500);
     Select s2 = new Select(yearlist);
     s2.selectByVisibleText(text.getRow(2).getCell(2).getStringCellValue());
     Thread.sleep(500);
     location.sendKeys(text.getRow(2).getCell(3).getStringCellValue());
     Thread.sleep(500);
     schooltxt.sendKeys(text.getRow(3).getCell(0).getStringCellValue());
     Thread.sleep(500);

     college.sendKeys(text.getRow(3).getCell(1).getStringCellValue());



      Thread.sleep(4000);
      //captcha.sendKeys(text.getRow(3).getCell(2).getStringCellValue());
        Signupbutton.click();

	}
	}