package PracticeProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1basicselenium {

    public static void main(String[] args) throws InterruptedException {
   System.setProperty("Webdriver.chrome.diver", "chromedriver");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://is.rediff.com/signup/register");
   Thread.sleep(1000);
   driver.navigate().refresh();
   driver.get("https://www.facebook.com/");
   Thread.sleep(2000);
   driver.navigate().to("https://www.google.com/");
   Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(1000);
  driver.navigate().forward();
  Thread.sleep(3000);
  driver.navigate().refresh();
 
  System.out.println("tiltle of APPLICATION="+ driver.getTitle());
   String expectedtitle = "Google";
    String actualtitle = "Google";
		
   
    if (expectedtitle.equals(actualtitle))
    {
    		System.out.println("google test case pass");
    		
    }
    else
    {
    	System.out.println("google test case fail");
    }
    
    String eop = driver.getCurrentUrl();
    System.out.println("url="+ eop);
  driver.close();
    }

}
