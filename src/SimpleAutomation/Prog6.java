package SimpleAutomation;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog6 {

	
	public static void main(String[]args) {

		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://is.rediff.com/signup/register" );
		
		WebElement YourFullnameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		YourFullnameTextbox.sendKeys("harry");
		 WebElement emailIdTextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
				System.out.println("Is displayed =" + emailIdTextbox.isDisplayed());
				System.out.println("Is enable=" + emailIdTextbox.isEnabled());
				System.out.println("Is selected =" + emailIdTextbox.isSelected());

				System.out.println("******************************************************");
				
				System.out.println("Is displayed ="+emailIdTextbox.isDisplayed());
                emailIdTextbox.sendKeys("@123");
				System.out.println("Is displayed =" + emailIdTextbox.isDisplayed());
				System.out.println("Is displayed =" + emailIdTextbox.isEnabled());
				System.out.println("Is displayed =" + emailIdTextbox.isSelected());

			WebElement daylistbox=driver.findElement(By.xpath("//select[@name='date_day']"));
			 Select s = new Select(daylistbox);
			//s.selectByIndex(10);
			s.selectByValue("12");
			s.selectByVisibleText("20");
				
			
			driver.close();
	}
	//input[@name='emailid']
}
