package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample111 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		WebElement homeIcon =driver.findElement(By.xpath("//a[@id='tryhome']"));
		WebElement iframe1 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	//driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(iframe1);
		WebElement button = driver.findElement(By.xpath("//button[@type= 'button']"));
   button.click();
   
   driver.switchTo().parentFrame();
   driver.switchTo().defaultContent();
 Thread.sleep(3000);
homeIcon.click();
	Thread.sleep(3000);
	driver.close();
	}

}
