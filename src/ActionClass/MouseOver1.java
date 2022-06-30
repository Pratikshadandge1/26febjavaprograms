package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		 WebElement aboutus=driver.findElement(By.xpath("//a[text()='About Us']"));
	
		 Actions a=new Actions(driver);
		 a.moveToElement(aboutus).build().perform();
		 
		 Thread.sleep(2000);
		 WebElement careerlink =driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
		 careerlink.click();
	
	}

}
