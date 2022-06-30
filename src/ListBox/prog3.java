package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class prog3 {

	public static void main(String[] args) {
		
			   System.setProperty("Webdriver.chrome.driver","chromedriver");
				WebDriver driver= new ChromeDriver();
				driver.get("https://is.rediff.com/signup/register");
				driver.manage().window().maximize();
				WebElement day = driver.findElement(By.xpath("//select[@name='date_day']"));
				Select s=new Select(day);
	}

}
