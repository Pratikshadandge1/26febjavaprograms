package PracticeProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot111 {

	public static void main(String[] args) throws IOException {
       
		System.setProperty("webdriver.driver.chromedriver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\ssssss/picsss.png");
	FileHandler.copy(source, dest);
	driver.close();
	}

}
