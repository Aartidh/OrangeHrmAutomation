package com.orangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.orangeHRM.Automation.AddEmployee;
import com.orangeHRM.Automation.AddUser;
import com.orangeHRM.Automation.loginPageOrangeHRM;

import CyberSuccess.cyberSuccessAutomation.Baseclass;
import CyberSuccess.cyberSuccessAutomation.PropertyHandling;

public class SampleSeleniumCode extends loginPageOrangeHRM{

	
	
	public static void main(String[] args) throws Exception  {
		
	PropertyHandling prop = null;
	try {
		prop = new PropertyHandling();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	AddEmployee addEmployee=new AddEmployee();
		
	getInstanceBrowser(prop.getValue("browser"));

	driver.navigate().to(prop.getValue("orangeHRMUrl"));
	
	loginPageOrangeHRM loginPage= new loginPageOrangeHRM();
	
	loginPage.login((prop.getValue("orangeHRMUsername")),(prop.getValue("orangeHRMPassword")));
	
       addEmployee.addEmp();
	
    // addEmployee.verifyAddedEmp();
	
	   addEmployee.deleteEmp();
	
//	addEmployee.resetBtnF();
	
//	addEmployee.frwdBtnFun();
	
//	AddUser user=new AddUser();
	
//	user.addUser();
	
	
	
	

	
	}
}

		
	


