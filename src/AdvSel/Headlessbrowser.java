package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		
		ChromeOptions a=new ChromeOptions();
		a.addArguments("headless");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	
	
WebElement searchbar=driver.findElement(By.xpath("//input[@name='q']"));
	searchbar.sendKeys("nare");
	Thread.sleep(2000);

	List<WebElement> autosugestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	
  for(int i=0;i<autosugestion.size();i++)
	{
	System.out.println(autosugestion.get(i).getText());

	}
   for(int i=0; i<autosugestion.size();i++) {
   String exp ="narendra modi";
	String act=autosugestion.get(i).getText();
if 	(exp.equals(act)) 
   {
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click");
	autosugestion.get(i);
			
			break;
		
   }
}


driver.close();


	}


}