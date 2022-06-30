package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchbar=driver.findElement(By.xpath("//input[@name='q']"));
		searchbar.sendKeys("seleni");
		Thread.sleep(2000);

		List<WebElement> autosugestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
	for(int i=0;i<autosugestion.size();i++)
		{
		System.out.println(autosugestion.get(i).getText());
	
		}
	for(int i=0; i<autosugestion.size();i++) {
	String exp ="selenium webdriver";
		String act=autosugestion.get(i).getText();
		
		if
		(exp.equals(act))
			{autosugestion.get(i).click();
			break;
		}	
	}
	
	Thread.sleep(2000);
	driver.close();
	}
	
	

}
