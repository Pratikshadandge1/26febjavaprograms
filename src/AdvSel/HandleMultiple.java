package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//find total no. of links in webpage

public class HandleMultiple {
	//how we can handle multiple element on web app

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	 List<WebElement> links = driver.findElements(By.xpath("//a"));
	 System.out.println("total link="+links.size());
	 for(int i=0;i<links.size();i++)
	 {
		 System.out.println(links.get(i).getText());
	 }
	for(int i=0;i<links .size();i++)
	{
		String expected="Advertising";
			String actual= links.get(i).getText();
			
			if (expected.equals(actual))
			{
				links.get(i).click();
				break;
			}
	}
	System.out.println("Title="+driver.getTitle());
	Thread.sleep(2000);
	driver.close();
	}
	 
	
}
