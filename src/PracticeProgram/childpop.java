package PracticeProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpop {

	public static void main(String[] args) {
System.setProperty("webdriver.driver.chrome","chromedrier");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.aspsnippets.com/demos/1102/");
	
WebElement openpop =driver.findElement(By.xpath("//input[@value='Open Popup']"));
	openpop.click();

Set<String> windows= driver.getWindowHandles();

Iterator<String> itr = windows.iterator();
	
	String win[]=new String [10];
	System.out.println("Total window="+windows.size());
	
	
	
	for( int i=0;i<windows.size();i++) {
		win[i]=itr.next();
		System.out.println(win[i]);
		}

	driver.quit();
	
	}

}
