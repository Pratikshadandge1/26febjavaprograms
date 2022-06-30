package waitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
	WebElement btn1= driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	btn1.click();
	WebDriverWait w =new WebDriverWait(driver,15);
	w.until(ExpectedConditions.alertIsPresent());
	
	 driver.switchTo().alert().accept();
	 driver.close();
		
	/*	WebElement btn2= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn2.click();
		WebElement changedlabed= driver.findElement(By.xpath("//h2[@class='target-text']"));
		
		WebDriverWait w1 =new WebDriverWait(driver,150);
		w1.until(ExpectedConditions.textToBePresentInElement(changedlabed,"selenium Webdriver"));*/
		
		/*WebElement btn3= driver.findElement(By.xpath("//button[@id='display-other-button']"));
	btn3.click();
	WebElement hiddenbtn= driver.findElement(By.xpath("//button[@id='hidden']"));
	WebDriverWait w =new WebDriverWait(driver,15);
	w.until(ExpectedConditions.visibilityOfAllElements(hiddenbtn));*/


	/*  WebElement btn4= driver.findElement(By.xpath("//button [@id='enable-button']"));
      btn4.click();
       WebElement enablenbtn= driver.findElement(By.xpath("// button[@id='disable']"));
        WebDriverWait w4 =new WebDriverWait(driver,15);
         w4.until(ExpectedConditions.en(enablenbtn));*/
	     
	

		/* WebElement btn5= driver.findElement(By.xpath("//button [@id='enable-button']"));
	      btn5.click();
	       WebElement enablenbtn= driver.findElement(By.xpath("// button[@id='disable']"));
	        WebDriverWait w4 =new WebDriverWait(driver,15);
	         w4.until(ExpectedConditions.presenceOfElementLocated(enablenbtn));
		     driver.close();/
		
	

	 /* WebElement btn6= driver.findElement(By.xpath("// button[@id='checkbox']"));
    btn6.click();
     WebElement checkboxbtn= driver.findElement(By.xpath("// input[@type='checkbox']"));
      WebDriverWait w4 =new WebDriverWait(driver,15);
       w4.until(ExpectedConditions.presenceOfElementLocated(null));
	     driver.close();*/
	
}
}