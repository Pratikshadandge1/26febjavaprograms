package waitInSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbar.sendKeys("nare");
		
	//Thread.sleep(2000);
		   List<WebElement> autosuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		   
		   for(int i=0;i<autosuggestion.size();i++) {
			   
			   System.out.println(autosuggestion.get(i).getText());
		   }

		   for(int i=0;i<autosuggestion.size();i++) {
			   
			   String exp="Narendra Modi\r\n"
			   		+ "Prime Minister of India";
			   String act=	autosuggestion.	get(i).getText();
			   
			 if(exp.equals(act)) 
			   {
		      autosuggestion.get(i).click();
			   }
		 break;
		   }

	}

}
