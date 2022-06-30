package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkthestatus {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement emailidtxt = driver.findElement(By.xpath("//input[@name='emailid']"));
		
		
		System.out.println("is displayed="+emailidtxt.isDisplayed());
		System.out.println("is enabled="+emailidtxt.isEnabled());
		System.out.println("is selected="+emailidtxt.isSelected());
	   driver.close();
	}

}
