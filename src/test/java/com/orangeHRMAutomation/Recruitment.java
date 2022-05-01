package com.orangeHRMAutomation;

import com.orangeHRM.Automation.AddEmployee;
import com.orangeHRM.Automation.RecruitmentPage;

import CyberSuccess.cyberSuccessAutomation.PropertyHandling;

public class Recruitment extends RecruitmentPage {

	public static void main(String[] args) {
		PropertyHandling prop = null;
		try {
			prop = new PropertyHandling();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		AddEmployee addEmployee=new AddEmployee();
			
		getInstanceBrowser(prop.getValue("browser"));

		driver.navigate().to(prop.getValue("orangeHRMUrl"));
		
		OrangeHrmLoginPage loginPage= new OrangeHrmLoginPage();
		
		loginPage.login((prop.getValue("orangeHRMUsername")),(prop.getValue("orangeHRMPassword")));
		 
		RecruitmentPage recPage=new RecruitmentPage();
		
		recPage.addCandidate();
		
		recPage.resetBtn();
		
		recPage.deleteBtn();
		
		
		

	}


	}


