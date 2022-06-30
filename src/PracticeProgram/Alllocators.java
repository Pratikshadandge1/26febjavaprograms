package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllocators {

	public static void main(String[] args) {
    System.setProperty("webdriver .driver.chrome", "chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://is.rediff.com/signup/register");
	
	//by tagname
	//driver.findElement(By.tagName("input")).sendKeys("ron");
	
	
	//by id
	//driver.findElement(By.id("fullname")).sendKeys("ron");
	
	//by classname
	//driver.findElement(By.className("txtbox1")).sendKeys("pratikshad");
	
	//by link text
	driver.findElement(By.linkText("Privacy Policy")).click();
	driver.navigate().back();
	
	//by partiallinktext
	driver.findElement(By.partialLinkText("Feed")).click();
	}
	

}
