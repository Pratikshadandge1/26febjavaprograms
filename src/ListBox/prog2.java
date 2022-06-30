package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog2 {

	     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s=new Select(cars);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
	Thread.sleep(2000);
		s.deselectByVisibleText("Saab");
		
	     }


			
		}


