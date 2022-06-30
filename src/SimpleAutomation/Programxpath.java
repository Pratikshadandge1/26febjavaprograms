package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programxpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://is.rediff.com/signup/register" );
		//xpath by attributes
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("harry potter");
		
		//xpath by contains
		driver.findElement(By.xpath("//input[contains(@name,'em')]")).sendKeys("harry@1234");	

		//xpath by index
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("latur");
		Thread.sleep(2000);
		//xpath by text
	    driver.findElement(By.xpath("//a[text( )='Privacy Policy']")).click();
	   
	    //locator=tagname
	    driver.findElement(By.tagName("input")).sendKeys("ron");
	}
}
