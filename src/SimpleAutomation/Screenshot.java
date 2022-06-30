package SimpleAutomation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {

		
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
	File source	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}

}
