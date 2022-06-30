package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prog2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.diver","chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

	
	
	Actions a= new Actions(driver);
	a.contextClick(rightclick).build().perform();
	Thread.sleep(2000);
	a.doubleClick(doubleclick).build().perform();
	Thread.sleep(1000);
	
	
	Alert alt =driver.switchTo().alert();
	
	Thread.sleep(2000);
	alt.accept();
	
	driver.close();
	}

}
