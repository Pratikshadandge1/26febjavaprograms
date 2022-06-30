package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProg1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
		WebElement signbtn=driver.findElement(By.xpath("//input[@type='submit']"));
	     signbtn.click();
	     Thread.sleep(3000);
	     
	     Alert pop = driver.switchTo().alert();
	     String value = pop.getText();
	       System.out.println("popup text=" + value);
	       
	       pop.accept();
	       
	      Thread.sleep(3000);
	       driver.close();
	       
	     
	}

}
