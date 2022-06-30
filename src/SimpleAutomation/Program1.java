package SimpleAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
	
	System.getProperty("webdrive.chrome.driver" ,"chrome.exe");
	RemoteWebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.rediff.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
    driver.close();
	}

}
