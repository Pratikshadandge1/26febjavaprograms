package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class prog7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://is.rediff.com/signup/register" );
		
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Harry");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Harry@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dp@111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='repass']")).sendKeys("dp@111)");
		Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	   Thread.sleep(2000);
	
	   WebElement daylistbox=driver.findElement(By.xpath("//select[@name='date_day']"));
	    Select s1 = new Select (daylistbox);
         s1.selectByVisibleText("07");
        Thread.sleep(2000);

       WebElement monthlistbox = driver.findElement(By.xpath("//select[@name='date_mon']"));
       Select s2 = new Select (monthlistbox);
       s2.selectByVisibleText("JAN");

       WebElement yearlistbox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
       Select s3 = new Select (yearlistbox);
       s3.selectByVisibleText("1998");


         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune"); 
         Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='school']")).sendKeys("shri deshikendra");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='college']")).sendKeys("m.s. bidve");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='fld_captcha']")).sendKeys("7482");

        driver.findElement(By.xpath("//input[@value='Sign up']")).click();
        Thread.sleep(2000);

         driver.close();

	}

		
	}



