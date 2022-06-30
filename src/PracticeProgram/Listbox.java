package PracticeProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.driver.chrome","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s=new Select(year);
		s.selectByVisibleText("2015");
		Thread.sleep(1000);
		s.selectByValue("2014");
		System.out.println("it is multiselcted ="+s.isMultiple());
	    
	     Thread.sleep(1000);
	     
	     
	     
	     List<WebElement> getalloptions = s.getOptions();
	     
	     
	    
		for (WebElement option:getalloptions)
	     {
	    	 System.out.println(option.getText());
	     }
	    for(int i=0;i<getalloptions.size();i++) 
	     {
	    	System.out.println(getalloptions.get(i).getText());
	     }
	    
	     WebElement getfirstoption = s.getFirstSelectedOption();
	     System.out.println("get first selected option="+getfirstoption.getText());
	     driver.close();
	
	}

}
