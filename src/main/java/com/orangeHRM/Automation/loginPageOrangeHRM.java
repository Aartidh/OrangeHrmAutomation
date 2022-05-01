package com.orangeHRM.Automation;

import org.openqa.selenium.By;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class loginPageOrangeHRM extends Baseclass {
 private By username=By.id("txtUsername");
	 
	 private By password=By.id("txtPassword");
	 
	 private By loginButton=By.id("btnLogin");
	 
	 private By forgetPass=By.linkText("Forgot your password?");
	 
   public void login(Object username, Object password)
   {
     
	   driver.findElement(this.username).sendKeys(""+username);
	  
	   driver.findElement(this.password).sendKeys(""+password);
	   driver.findElement(loginButton).submit();

}}
