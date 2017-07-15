package com.mavenproject.TRACO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_up {

	WebDriver driver;
	
	public Sign_up(WebDriver driver5)
	{
		driver=driver5;
	}
	
	public void Sign_up1(String mob, String ema) throws InterruptedException
	{
		String p_name="Hello";
				
		
		System.out.println(" This is code to initialoze the Locators and connect to the lOgin page of Traco");
		
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(),'Sign Up Free')]"));
		signup.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys(p_name);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(ema);
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys(mob);
		
	    WebElement signbutton=driver.findElement(By.xpath("//button[@type='button'][@id='sub_btn_signup']")); // Code where multiple xpath can be used
	    signbutton.click(); 
	    
	    Thread.sleep(5000);
	    
	    WebElement otp=driver.findElement(By.xpath("//input[@id='otp']"));
	    otp.sendKeys("123456");
	    
	    WebElement verifymobile=driver.findElement(By.xpath("//button[@id='sub_btn_verify']"));
	    verifymobile.click();
	    
	    Thread.sleep(5000);
	    
	    WebElement ok=driver.findElement(By.xpath("//button[text()='OK']"));
	    
	    ok.click();
	   
	}
}
