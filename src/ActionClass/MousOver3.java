package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousOver3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='✕']")).click();

 WebElement loginbtn=driver.findElement(By.xpath("//a[text()='Login']"));
  Actions a= new Actions(driver);
  a.moveToElement(loginbtn).build().perform();
 
 WebElement giftcard =driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		 giftcard .click();

	}

}
