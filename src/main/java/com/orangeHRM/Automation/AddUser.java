package com.orangeHRM.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class AddUser extends AddEmployee {

	  	 public By adminModule=By.id("menu_admin_viewAdminModule");
		
	   	 public By userManagement=By.id("menu_admin_UserManagement");
		
	     public By userN=By.id("systemUser_userName");
	     
	     public String userNameValue=generateRandomStrings(5);
		
	     public By userRole=By.id("systemUser_userType");
	     
	     public By empName =By.id("systemUser_employeeName_empName");
	
		 public By searchUN=By.xpath("//input[@name=\'searchSystemUser[userName]\']");
		 
		public By userPw=By.id("systemUser_password");
		
	  //  public By confirmUserPW = 
		
		public By UserConfirmPW=By.id("systemUser_confirmPassword");
		 
		 
		
	    	 public void addUser() {

    	     driver.findElement(adminModule).click();
    	     
    	     addButton.click();
    	     
    	     driver.findElement(userRole);
    	     
    	     driver.findElement(userN).sendKeys(userNameValue);
    
    	     driver.findElement(empName).sendKeys("Aaliyah Haq");
  
    	     driver.findElement(userN).sendKeys(userNameValue);
    	     
    	     driver.findElement(userPw).sendKeys("Aarti123");
    	     
    	     driver.findElement(UserConfirmPW).sendKeys("Aarti123");
   
    	     driver.findElement(saveButton).click();
    	     
    	     System.out.println(userNameValue);
    	      
    	     driver.findElement(searchUN).sendKeys(userNameValue);
    	     
    	     driver.findElement(searchButton).click();

    	    }
    	    
	
	
	
	
}
