package com.hrm.automation;



import com.orangeHRM.Automation.AddEmployee;
import com.orangeHRMAutomation.LoginPage;


import CyberSuccess.cyberSuccessAutomation.Baseclass;
import CyberSuccess.cyberSuccessAutomation.PropertyHandling;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class AddEmp extends AddEmployee {
 
	PropertyHandling prop = null;
	LoginPage loginPage;
	AddEmployee addEmployee;
	
	
  @Test(priority=1)
  public void loginOrangeHrm() throws Exception {
	  
	  	prop = new PropertyHandling();
	  	getInstanceBrowser(prop.getValue("browser"));
	  	driver.navigate().to(prop.getValue("orangeHRMUrl"));
	  	loginPage = new LoginPage();
		loginPage.login((prop.getValue("orangeHRMUsername")),(prop.getValue("orangeHRMPassword")));
  
       }
		@Test(priority=2)
		public void checkbox() throws Exception {
		
	     addEmployee=new AddEmployee();
	  
	     driver.findElement(addEmployee.pimModule).click();
	     
	     WebElement selectAllCheckbox=driver.findElement(this.selectAllCheckbox);
	     
	     selectAllCheckbox.click();
	     
	     boolean checkbox=selectAllCheckbox.isSelected();
	     
	     System.out.println("All checkbox is selected: "+checkbox);
	     
		}
		@Test(priority=3)
		public void addEmployee() throws Exception{
			
			addEmployee.addEmp();
//	      add.click();
//     
//          driver.findElement(firstName).sendKeys(fNameValue);
//     
//          driver.findElement(lastName).sendKeys(lNameValue);
//
//          save.click();
      }
		@Test(priority=4)
		public void addEmployeeValidation() throws Exception{
			 driver.findElement(pimModule).click();
			
			String empNameSrch=addEmployee.fNameValue+" "+addEmployee.lNameValue;
			
			System.out.println(empNameSrch);
		    	 
		     driver.findElement(addEmployee.empSearch).sendKeys(empNameSrch);
		     
		     driver.findElement(addEmployee.searchButton).click();
		 
        }
		
		
		
		
		
		
		


}
