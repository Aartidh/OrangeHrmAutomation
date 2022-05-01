package com.orangeHRMAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.Automation.loginPageOrangeHRM;

public class LoginPage extends loginPageOrangeHRM {

	public static void main(String[] args) throws Exception {
	     getInstanceBrowser("Chrome");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        loginPageOrangeHRM loginPage= new loginPageOrangeHRM();
		//Valid Scenario
		loginPage.login("Admin", "admin123");
		driver.findElement(By.id("welcome")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//to wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));*/
		
		
		
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
//		
//        driver.navigate().back();
        
       /* loginPage.login("admin", "Admin123");//Csrf token validation failed
        
        loginPage.login("", "admin123");//Username cannot be empty
        
        loginPage.login("Admin", "");//Password cannot be empty
        
        loginPage.login("admin@12", "admin123");//Invalid credentials*/
        
//        loginPage.login("Admin", "123456");//Invalid credentials
//		
//        driver.findElement(By.linkText("Forgot your password?")).click();
//        
//        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
//        
//        driver.findElement(By.id("btnSearchValues")).click();
//        
//        String expectedUrl="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
//        
//        validate1(driver.getCurrentUrl(),expectedUrl);
//        
//        driver.findElement(By.id("securityAuthentication_userName")).clear();
//        
//       // driver.navigate().back();
//        
//        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Nikhil");
//        
//        driver.findElement(By.id("btnSearchValues")).click();
        
       
		

	
	}

	
	}

	
	

