package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4xpathattribution {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D60571832564%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjwsJ6TBhAIEiwAfl4TWAykpNPTtB3-hshLV_mHUkIO8Vsr7qavI_5EO2lokGadciuqwUI21BoCn_cQAvD_BwE%26hvadid%3D486387378181%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D9895529035244490886%26hvtargid%3Dkwd-296458789801%26hydadcr%3D14452_2154371%26ref%3Dpd_sl_nxqtetlae_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&)");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anand");
		Thread.sleep(2000);
	driver.close();
	}

}
