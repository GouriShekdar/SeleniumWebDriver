package com.mavenproject.TRACO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page

{
	WebDriver driver;
	
         public Login_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
        	 driver=driver2;
	}
		public void login(String num)
         {
        	 WebElement LG1=driver.findElement(By.xpath("//input[@id='login-mobile']"));
        	 LG1.sendKeys(num);
			
			//WebElement Class=driver.findElement(By.className(""))
				

        	 WebElement LG2=driver.findElement(By.xpath("//input[@id='login-password']"));
        	 LG2.sendKeys("nairiti@1504");
        	 
        	 WebElement signin=driver.findElement(By.xpath("//button[text()='Log in']"));
     	    
     	    signin.click();
        	 
         }
}
