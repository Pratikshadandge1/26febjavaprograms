package PracticeProgram;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	

	

	public static void main(String[] arg) throws IOException{
		
		System.setProperty("Webdriver.driver.chrome","chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

         
 
     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest=new File ("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\ss pic/photo.png");
		FileHandler.copy(source, dest);
    
	}

}
