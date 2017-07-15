package com.mavenproject.TRACO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product_Select
{
	public Product_Select(WebDriver driver3)
	{
		driver=driver3;
	}
	WebDriver driver;
	

public void product() throws InterruptedException
 {
	String product1="Tracko-VT1";
	WebElement product=driver.findElement(By.xpath("//h3[contains(text(),'"+product1+"')]/following::a[contains(text(),'Details')][1]"));
    product.click();
    
    Thread.sleep(5000);
    
    WebElement order =driver.findElement(By.xpath("//a[text()='Order Now ']"));
    order.click();
   
    WebElement selectitem=driver.findElement(By.id("cmbPlans")); // Code to select element from doropdown list
    Select  dropdown=new Select(selectitem);
    dropdown.selectByVisibleText("WELCOME_NEW");   
    
    
    WebElement quantity=driver.findElement(By.id("qid"));
    quantity.sendKeys("1");
    
   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
   // WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut); //explicit wait
     
    
    Thread.sleep(10000); // Use explicit wait here
    
    WebElement vehicalno=driver.findElement(By.id("vehicle_0"));
    vehicalno.sendKeys("MH 31 EH 6211");
    
   WebElement addtoproceed =driver.findElement(By.xpath("//button[@type='button'][@text='Add & Proceed To Checkout']"));
   addtoproceed.click();
   
    

  }
}