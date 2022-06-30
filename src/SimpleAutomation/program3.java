package SimpleAutomation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.data.PointData;

public class program3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		
    	Dimension d = new Dimension(200, 300);
    	driver.manage().window().setSize(d);
    	Thread.sleep(2000);
    	Point p = new Point( 10, 700);
 driver.manage().window().setPosition(p );   	
         driver.close();
	}

}
