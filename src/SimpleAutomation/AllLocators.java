package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://is.rediff.com/signup/register" );

		//locator=tagname
	   driver.findElement(By.tagName("input")).sendKeys("ron");

	   //locator=id
	   driver.findElement(By.id ("Fullname")).sendKeys("HARRY");

	   //locator=classname
	   driver.findElement(By.className("txtbox1")).sendKeys("latur");

	   //by linktext
	  // driver.findElement(By.linkText("Privacy Policy")).click();
	   
	   
	  // Thread.sleep(1000);
	   
	   //by partiallinktext
	   driver.findElement(By.partialLinkText("Feed")).click();
	}

}
