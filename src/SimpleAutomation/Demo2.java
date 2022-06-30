package SimpleAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


   public class Demo2 {

	   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      Thread.sleep(3000);
      driver .manage().window().maximize();
		driver.get("http://amazon.com");
		Thread.sleep(3000);
		driver.close();
	

		
		
	}

		
	
	
	}
