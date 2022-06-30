package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeProg {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

WebElement search = driver .findElement(By.xpath("//input[@id='s']"));
search.sendKeys("harry");
driver.switchTo() .frame("//input[@name='s']");
WebElement search2 =driver.findElement(By .xpath("(//input[@type='text'][2])"));
search2.sendKeys("ron");
	}

}
