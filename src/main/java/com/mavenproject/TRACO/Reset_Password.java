package com.mavenproject.TRACO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reset_Password 
{
	WebDriver driver;
	
	public Reset_Password(WebDriver driver4)
	{
		driver=driver4;
		
	}

	public void reset()
	{
		  
	    WebElement resetpassword=driver.findElement(By.xpath("//input[@id='password']"));
	    resetpassword.sendKeys("nairiti@1504");
	    
	  
	    
	    WebElement password =driver.findElement(By.xpath("//input[@id='repassword']"));
	    password.sendKeys("nairiti@1504");
	    
	    WebElement setpassword=driver.findElement(By.xpath("//button[@type='button'][@id='sub_btn_setpass']")); // Code where multiple xpath can be used
	    setpassword.click(); 
	    
	}
}
