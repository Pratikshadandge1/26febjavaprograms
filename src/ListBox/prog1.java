package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog1 {


	//Get all option present in listbox
	public static void main(String[] args) {
	   System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.xpath("//select[@name='date_mon']"));
      Select s = new Select(month);
      List<WebElement> options = s.getOptions();

       for(int i=0;i<=12;i++)
      
	   { 
		System.out.println(options.get(i).getText());
       }
       
	//for(int i=0;i<options.size();i++)
	//{
       
	//System.out.println(options.get(i).getText());
	
	//}
//System.out.println("----------------------------------------");
//for(WebElement value123:options) 
//{
//	System.out.print(value123.getText()+" ");
//}
	//driver.close();
}

}


	


	


