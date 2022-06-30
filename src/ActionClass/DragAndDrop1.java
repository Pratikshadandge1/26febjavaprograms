package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement img1 =driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement img2 =driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 =driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement img4 =driver.findElement(By.xpath("//img[@alt=\"On top of Kozi kopka\"]"));
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(img1, trash).build().perform();
		Thread.sleep(1000);
		a.moveToElement(img2).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(img3, trash).build().perform();
		Thread.sleep(1000);
		a.moveToElement(img4).clickAndHold().moveToElement(trash).release().build().perform();
	}

}
