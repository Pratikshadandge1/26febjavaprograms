package AdvSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Multibrowser {

	public static void main(String[] args) {

		//System.setProperty("Webdriver.firefox.driver","firefox");
		//WebDriver driver =new FirefoxDriver();
		//driver.manage().window().maximize();
	//driver.get("https://www.flipkart.com");
	
	//System.setProperty("Webdriver.opera.driver","opera");
	//WebDriver driver =new OperaDriver();
	//driver.manage().window().maximize();
//driver.get("https://www.flipkart.com");

		System.setProperty("Webdriver.edge.driver","edge");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com");
	 
	 
	 driver.close();
	
	}

}
