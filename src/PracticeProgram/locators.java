package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("Webdriver.chrome.driver","chromedriver");
    WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
    
	driver.get("https://is.rediff.com/signup/register");
	
	
   driver.findElement(By.tagName("input")).sendKeys("ron");
   Thread.sleep(2000);
   
   driver.findElement(By.id("emailid")).sendKeys("harry@gmail.com");
   Thread.sleep(1000);
   driver.findElement(By.name("pass")).sendKeys("velocity");
   Thread.sleep(1000);
   
   driver.findElement(By.linkText("http://investor.rediff.com/")).click();
   Thread.sleep(1000);
   
	driver.close();
	}

}
