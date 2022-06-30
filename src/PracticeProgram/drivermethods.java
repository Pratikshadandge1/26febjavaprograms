package PracticeProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermethods{
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.driver.chrome","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		//Thread.sleep(3000);
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		//driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		//driver.navigate().back();
		//driver.navigate().back();
		//Thread.sleep(1000);
		//driver.navigate().forward();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		
		Dimension d= new Dimension(100,700);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p =new Point (10,700);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
		
	}
}


