package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		
		Thread.sleep(2000);
	JavascriptExecutor js =((JavascriptExecutor)driver);
	////		js.executeScript("window.scrollBy(0,3000)");
			
	WebElement topstory= driver.findElement(By.xpath("//span[text()='Top Stories']"));
	js.executeScript("arguments[0].scrollIntoView();",topstory);
	
	WebElement contactus= driver.findElement(By.xpath("//a[text()='Contact Us']"));
	js.executeScript("arguments[0].scrollIntoView();",contactus);
	}
}