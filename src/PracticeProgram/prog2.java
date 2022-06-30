package PracticeProgram;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog2 {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver chrome.driver", "chromedriver");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
    
    
     Dimension d =new Dimension(200,300);
     driver.manage().window().setSize(d);
     Thread.sleep(3000);  
  
     
      Point p = new Point(20,700);
      driver.manage().window().setPosition(p);
      Thread.sleep(3000);
	   
      driver.close();
	
	}

}
