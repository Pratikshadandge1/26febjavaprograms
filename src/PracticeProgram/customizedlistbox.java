package PracticeProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class customizedlistbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wbdriver.driver.chrome","chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement acc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act =new Actions(driver);
		act.moveToElement(acc).build().perform();
		 WebElement starthere = driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		 act.click(starthere).build().perform();
		 
	 WebElement mobno = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
	 
	 act.moveToElement(mobno).click().build().perform();
	 Thread.sleep(1000);
	 act.sendKeys(Keys.DOWN).build().perform();
	 Thread.sleep(3000);
	 
	 //for(int i=30;i>=30;i++) {
	  
	 //Thread.sleep(10);
	 //act.sendKeys(Keys.ARROW_UP).build().perform();
	 //}
	
	 WebElement urnametxtbox = driver.findElement(By.xpath("//input[@type='text']"));
	 act.moveToElement(urnametxtbox).build().perform();
	 act.keyDown(Keys.SHIFT).build().perform();
	 urnametxtbox.sendKeys("pratiksha");
	 Thread.sleep(2000);
	 driver.close();
	 
	}
}
		