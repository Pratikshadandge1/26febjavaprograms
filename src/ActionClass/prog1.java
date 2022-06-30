package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prog1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
 // WebElement dropdown =driver.findElement(By.xpath("//button[normalize-space(text())='select')]"));
	WebElement dropdown =driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']"));
	
	Actions act =new Actions(driver);
	act.moveToElement(dropdown). click().build().perform();
	
	for (int i=0;i<=7;i++)
	{
		Thread.sleep(1000);
		act.sendKeys(Keys.DOWN).build().perform();
	}
    //act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	driver.close();
	}

}
