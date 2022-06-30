package SimpleAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.amazon.com/");

System.out.println(driver.getTitle());
String expectedTitle = "amazon.com";
String actualTitle = driver.getTitle();
 if( expectedTitle.equals(actualTitle)) {
	 
	 System.out.println("amazon title test case pass");
 }
 else {
	 
	 System.out.println("amazon title test case fail");
		 
 }
 driver.close();
	}

}
