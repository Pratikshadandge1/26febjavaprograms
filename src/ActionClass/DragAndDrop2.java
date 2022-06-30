package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/drag_drop.html");

WebElement ele5000=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
WebElement ele25000=driver.findElement(By.xpath("//a[text()=' 5000']"));
WebElement bank =driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
WebElement sales=driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
WebElement accdebitside=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
WebElement amountdebitside=driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable'and @id='amt7']"));
WebElement acccreditside=driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
WebElement amountcreditside=driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable'and @id='amt8']"));


Actions a=new Actions(driver);
a.dragAndDrop(ele5000, amountdebitside).build().perform();

Thread.sleep(2000);
a.dragAndDrop(ele25000, amountcreditside).build().perform();
Thread.sleep(2000);
a.dragAndDrop(bank, accdebitside).build().perform();
Thread.sleep(2000);
a.dragAndDrop(sales, acccreditside).build().perform();

Thread.sleep(2000);

WebElement result =driver.findElement(By.xpath("//div [@class='table4_result']//a[@class='button button-green']"));
	
	String expres="Perfect!";
	String actres= result.getText();
	
	if( expres.equals(actres))
		
	{System.out.println("drop and drown test case pass");
	}
	else {
		System.out.println("drop and drown test case fail");
	}
	//String value= driver.getWindowHandle(); for get address
	//System.out.println(value);
	
	driver.close();
	}

}