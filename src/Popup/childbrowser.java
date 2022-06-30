package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome driver","chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.aspsnippets.com/demos/1102/");
				
				
				WebElement OpenPopUpBtn= driver.findElement(By.xpath("//input[@value='Open Popup']"));
				OpenPopUpBtn.click();	
				
				//storing the windows in colletion
			Set<String> windows= driver.getWindowHandles();
			//System.out.println(window);
			
			//use of cursor
			Iterator<String> itr = windows.iterator();
			String win[]=new String[10];
			System.out.println("total window="+ windows.size());
			
			for(int i=0;i<windows.size();i++)
			{
				win[i]=itr.next();
				System.out.println(win [i]);
			}
			//driver.quit();
			 driver.switchTo().window(win[0]);
			 System.out.println("Title of window 0="+driver.getTitle());
			 Thread.sleep(4000);
			 driver.close();
			 
			 driver.switchTo().window(win[1]);
			 System.out.println("Title of window 1="+driver.getTitle());
			 WebElement FN= driver.findElement(By .xpath ("//td[contains(text(),'Fir')]"));
			WebElement LN= driver.findElement(By.xpath("//td[contains(text(),'Las')]"));
			
		    System.out.println("FN="+FN.getText());
			System.out.println("LN="+LN.getText());
			Thread.sleep(4000);
		driver.close();
			}



	}


