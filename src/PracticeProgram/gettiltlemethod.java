package PracticeProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettiltlemethod {

	public static void main(String[] args) {
    System.setProperty("Webdriver.driver.chrome", "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.myntra.com/");
    String D =driver.getTitle();
   System.out.println("titile="+D);
   
   String Expectedtitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
   String actualtitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
   if (Expectedtitle.equals(actualtitle))
	   
   {
	   System.out.println("test case is pass");
		  
   }
   else 
   {
	   System.out.println("test case is fail");
	   }  
      driver.close();
	
	}
		   
		   
		   
   
	   
    
	}


