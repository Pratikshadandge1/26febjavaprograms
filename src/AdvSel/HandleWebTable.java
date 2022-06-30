package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage(). window().maximize();
driver.get("https://money.rediff.com/index.html");

	 
	 
List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));

System.out.println(row.size());
System.out.println(column.size());

for (int i=0;i<row.size();i++) {
	System.out.println(row.get(i).getText());
	
}

WebElement moreindices = driver.findElement(By.xpath("//a[text()='More BSE Indices ']"));
moreindices.click();

WebElement showmore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
showmore.click();

List<WebElement> row1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));

List<WebElement> column1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
System.out.println(row1.size());
System.out.println(column1.size());

for(int i=0;i<row1.size();i++)
{
System.out.println(row1.get(i).getText());	
}

driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());

driver.close();
	}

}
