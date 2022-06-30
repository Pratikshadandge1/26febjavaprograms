package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handleAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
	WebElement newwindowbtn=driver.findElement(By.xpath("//input[@name='NewWindow']"));
	newwindowbtn.click();
	
	
	Set<String> window = driver.getWindowHandles();
	System.out.println("no of window");
	}

}
