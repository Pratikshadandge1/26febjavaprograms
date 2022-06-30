package ListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(source);
	File dest=new File("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\Screenshot/photo.jpeg");
	FileHandler.copy(source,dest);//filehanler is class in which copy is a method
	
	}

}
