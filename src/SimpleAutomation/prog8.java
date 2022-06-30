package SimpleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog8 {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","chromedriver");
WebDriver driver =new ChromeDriver();
driver.get("https://is.rediff.com/signup/register");

   WebElement redifflink =driver.findElement(By.xpath("//a[@class='ft11']"));
   WebElement redifficon =driver.findElement(By.xpath("//img[@class='halflogo']"));
   WebElement Newuserlable = driver.findElement(By.xpath("//img[@class='halflogo']"));
   WebElement Telluslable = driver.findElement(By.xpath("//p[@class='grey1']"));
   WebElement YourFullnamelable = driver.findElement(By.xpath("//div[text( )='Your Full name']"));
  WebElement YourcurrentemailID = driver.findElement(By.xpath("//div[text( )='Your current email ID']"));
  WebElement eglable = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
  WebElement passwordlable = driver.findElement(By.xpath("//div[text()='New password']"));
  WebElement Retypepasswordlable = driver.findElement(By.xpath("//div[text()='Retype password']"));
  WebElement Genderlable = driver.findElement(By.xpath("//div[text()='Gender:']"));
  WebElement Maleradiobutton = driver.findElement(By.xpath("//input[@value='m']"));
  WebElement Femalradiobutton = driver.findElement(By.xpath("//input[@value='f']"));
  WebElement DateofBirthlable = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
  WebElement Daylistbox = driver.findElement(By.xpath("//select[@name='date_day']"));
  WebElement Monthlistbox= driver.findElement(By.xpath("//select[@name='date_mon']"));
  WebElement yearlistbox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
  WebElement Locationlable = driver.findElement(By.xpath("//div[text()='Location']"));
  WebElement Schoollable = driver.findElement(By.xpath("//div[text()='School']"));
  WebElement Collegelable = driver.findElement(By.xpath("//div[text()='College']"));
  WebElement Enterthecodegivenintheaboveimagelable = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
  WebElement signupradiobutton = driver.findElement(By.xpath("//input[@type='submit']"));
  WebElement rediffonthenetlogo = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
  WebElement invertlink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
  WebElement advertilink = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
  WebElement disclaimetlink = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
  WebElement privacypolicylink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
  WebElement feedbacklink= driver.findElement(By.xpath("//a[text()='Feedback']"));
  WebElement termsofuselink= driver.findElement(By.xpath("//a[text()='Terms of Use']"));   
  WebElement fooderlink= driver.findElement(By.xpath("//div[@class='footer']"));
  WebElement captcha= driver.findElement(By.xpath("//img[@id='img_captcha']"));
 
  int count=0;

if(redifflink.isDisplayed())
 
  {count++;
	System.out.println("rediff link display is available");

   }
  else
  {System.out.println("rediff link display is  not available");
	  
  }
if( redifficon.isDisplayed())

{
count++;
	System.out.println("redifficon display is available");
	}
 
else
	
  {
	System.out.println("redifficon display is  not available");
	  
  }
if( Newuserlable.isDisplayed())

{
count++;
	System.out.println("Newuserlable display is available");
	}
 
else
	
  {count++;
	System.out.println("Newuserlable display is  not available");
	  
	}

if(Telluslable.isDisplayed())
 
  {count++;
	System.out.println("Telluslable display is available");

   }
  else
  {System.out.println("Telluslable display is  not available");
	  
  }

if( YourFullnamelable.isDisplayed())
 
  {count++;
	System.out.println("YourFullnamelabledisplay is available");

   }
  else
  {System.out.println("YourFullnamelable display is  not available");
	  
  }

if( YourcurrentemailID.isDisplayed())
 
  {count++;
	System.out.println("YourcurrentemailID display is available");

   }
  else
  {System.out.println("YourcurrentemailID display is  not available");
	  
  }

if(eglable.isDisplayed())
 
  {count++;
	System.out.println("eglable link display is available");

   }
  else
  {System.out.println("eglable link display is  not available");
	  
  }

if(passwordlable.isDisplayed())
 
  {count++;
	System.out.println("passwordlable display is available");

   }
  else
  {System.out.println("passwordlable display is  not available");
	  
  }

if(Retypepasswordlable.isDisplayed())
 
  {count++;
	System.out.println("Retypepasswordlable display is available");

   }
  else
  {System.out.println("Retypepasswordlable display is  not available");
	  
  }
if(Genderlable.isDisplayed())
	 
{count++;
	System.out.println("Genderlable display is available");

 }
else
{System.out.println("Genderlable display is  not available");
	  
}
if(Maleradiobutton.isDisplayed())
	 
{count++;
	System.out.println("Maleradiobuttondisplay is available");

 }
else
{System.out.println("Maleradiobutton display is  not available");
	  
}
if(Femalradiobutton.isDisplayed())
	 
{count++;
	System.out.println("Femalradiobutton display is available");

 }
else
{System.out.println("Femalradiobutton display is  not available");
	  
}
if(DateofBirthlable .isDisplayed())
	 
{count++;
	System.out.println("DateofBirthlable  display is available");

 }
else
{System.out.println("DateofBirthlable display is  not available");
	  
}
if(Monthlistbox.isDisplayed())
	 
{count++;
	System.out.println("Monthlistbox display is available");

 }
else
{System.out.println("Monthlistbox display is  not available");
	  
}
if(yearlistbox.isDisplayed())
	 
{count++;
	System.out.println("Yearlistbox display is available");

 }
else
{System.out.println("Yearlistbox display is  not available");
	  
}
if(Locationlable.isDisplayed())
	 
{count++;
	System.out.println("Locationlable display is available");

 }
else
{System.out.println("Locationlable display is  not available");
	  
}
if(Schoollable.isDisplayed())
	 
{count++;
	System.out.println("Schoollable display is available");

 }
else
{System.out.println("Schoollable display is  not available");
	  
}
if(Collegelable.isDisplayed())
	 
{count++;
	System.out.println("Collegelable display is available");

 }
else
{System.out.println("Collegelable display is  not available");
	  
}
if(Enterthecodegivenintheaboveimagelable.isDisplayed())
	 
{count++;
	System.out.println("Enterthecodegivenintheaboveimagelable display is available");

 }
else
{System.out.println("Enterthecodegivenintheaboveimagelable display is  not available");
	  
}
if(signupradiobutton .isDisplayed())
	 
{count++;
	System.out.println(" signupradiobutton  display is available");

 }
else
{System.out.println(" signupradiobutton  display is  not available");
	  
}
if(rediffonthenetlogo .isDisplayed())
	 
{count++;
	System.out.println("rediffonthenetlogo  display is available");

 }
else
{System.out.println("rediffonthenetlogo  display is  not available");
	  
}
if(invertlink.isDisplayed())
	 
{count++;
	System.out.println("invertlink display is available");

 }
else
{System.out.println("invertlink display is  not available");
	  
}if(advertilink.isDisplayed())
	 
{count++;
	System.out.println("advertilink display is available");

 }
else
{System.out.println("advertilink display is  not available");
	  
}

if(disclaimetlink.isDisplayed())
	 
{count++;
	System.out.println("disclaimetlink display is available");

 }
else
{System.out.println("disclaimetlink display is  not available");
	  
}
if(privacypolicylink.isDisplayed())
	 
{count++;
	System.out.println("privacypolicylink display is available");

 }
else
{System.out.println("privacypolicylink display is  not available");
}
if(feedbacklink.isDisplayed())

{count++;
System.out.println("feedbacklink display is available");

}
else
{System.out.println("feedbacklink display is  not available");
}
if(termsofuselink.isDisplayed())
	 
{count++;
	System.out.println("termsofuselink display is available");

}
else
{System.out.println("termsofuselink display is  not available");
 } 
	
	if(fooderlink.isDisplayed())
		 
	{count++;
		System.out.println("footerlink display is available");

	}
	else
	{System.out.println("footerlink display is  not available");
	 } 
	if(captcha.isDisplayed())
		 
	{
		count++;
		System.out.println("captcha display is available");}
	else
	{System.out.println("captcha display is  not available");
	 }
	System.out.println("Total count="+count); 
	}
}