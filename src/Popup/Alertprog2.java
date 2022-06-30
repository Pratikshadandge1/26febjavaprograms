package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprog2 {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","Chromedriver");	
	     WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
	       driver.get("http://demo.automationtesting.in/Alerts.html");
	       
		/*	WebElement alertbtn = driver.findElement(By .xpath("//button[@class='btn btn-danger']"));
	      alertbtn.click();
			Alert popup=driver.switchTo().alert();
	      Thread.sleep(2000);

	     String altpop1 = popup.getText();
	     System.out.println(altpop1);
	      popup.accept();
        Thread.sleep(3000);*/
	       
	   
	   
	  /*  WebElement alertwithokcancle= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    alertwithokcancle.click();
	  Thread.sleep(1000);
	    
	    WebElement alertbtn2= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    alertbtn2.click();
		  Thread.sleep(1000);

	   Alert pop2=driver.switchTo().alert();
	    Thread.sleep(2000);
	    
	    String altpop2 = pop2.getText();
	    System.out.println(altpop2);
	    pop2.accept();
	   // pop2.dismiss();
	    Thread .sleep(2000);*/
	    
	       WebElement alertwithtext= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	       alertwithtext.click();
	    Thread.sleep(2000);
	    
	       WebElement alertbtn3= driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	       alertbtn3.click();
	       Thread.sleep(2000);
	       
	       
	    Alert pop3=driver.switchTo().alert();
	       Thread.sleep(2000);
	       String altpop3 = pop3.getText();
	       System.out.println(altpop3);
	       pop3.sendKeys("i am  harry");
	       Thread.sleep(2000);
	       pop3.accept();
	       Thread.sleep(2000);
	       WebElement result= driver.findElement(By.xpath("//p[@id='demo1']"));
System.out.println(result.getText());
	      
	       
	    
	   	driver.close();
	
	       
	}
	}

