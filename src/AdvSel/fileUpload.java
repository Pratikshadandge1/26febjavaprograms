package AdvSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

Thread.sleep(3000);
	WebElement  uploadbtn=driver.findElement(By.xpath("//input[@type='file']"));
	Thread.sleep(2000);
	WebElement  pressbtn=driver.findElement(By.xpath("//input[@type='submit']"));
Thread.sleep(2000);
	uploadbtn.sendKeys("C:\\Users\\hp\\eclipse-workspace\\26FebJavaPrograms\\TestData");
	Thread.sleep(2000);
	pressbtn.click();
	
	
	System.out.println("hi gm");
	
	}

}
