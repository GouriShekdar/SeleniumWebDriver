package com.mavenproject.TRACO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.beust.jcommander.Parameter;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Traco_Main
{
	String mobile_no="9072625020";
	String email_id="q3@Ymail.com";
	
  WebDriver driver;
	
	@Test
  public void f() throws InterruptedException 
	{
		Sign_up ref4=new Sign_up(driver)  ;
		ref4.Sign_up1(mobile_no,email_id);
		    
		Reset_Password ref3=new Reset_Password(driver);
		ref3.reset();
		
	    Login_Page ref=new Login_Page(driver);
		ref.login(mobile_no);
		
		Product_Select ref2=new Product_Select(driver);
		ref2.product();
			
	    
    }
	
 @Parameters("browser")
  @BeforeTest
  public void beforeTest(String val)
  {
	  String browser=val;
	  
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.out.println(" Inilization of the Chrome Traco Url");
		  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe"); // code to initialoze the drivers
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.out.println(" Inilization of the Firefox Traco Url");
		  System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe"); // code to initialoze the drivers
		  driver=new FirefoxDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.out.println(" Inilization of the IE Traco Url");
		  System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe"); // code to initialoze the drivers
		  driver=new InternetExplorerDriver();
	  }
	  else
	  {
		  System.out.println("Invalid browser");
	  }
	  
	  driver.manage().window().maximize(); // code for maximize the window
	  driver.get("https://dev.tracko.co.in/"); // code to get the url to hit 
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest 
  public void afterTest()
  {
	  System.out.println("This is to exit the browser window");
	  //driver.close();
  }

}
