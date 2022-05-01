package com.orangeHRM.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class RecruitmentPage extends AddEmployee {
	
	
	
	private By recModule= By.id("menu_recruitment_viewRecruitmentModule");
	
	public By candFN=By.id("addCandidate_firstName");
	
	public By candLN=By.id("addCandidate_lastName");
	
	public By candEmailID=By.id("addCandidate_email");
	 
	String fN=generateRandomStrings(5);
	
	String lN=generateRandomStrings(7);
	
	private By candTab=By.id("menu_recruitment_viewCandidates");
	
	private By candSearch=By.id("candidateSearch_candidateName");
	
	private By check22=By.id("ohrmList_chkSelectRecord_3_2");
	
	private By drop1=By.xpath("//div[@class='ac_results']/ul/li[1]");
	
	private By reset=By.id("btnRst");
	
	
	
	AddEmployee addEmp=new AddEmployee();
	
	
	
	public void addCandidate()
	{
		driver.findElement(recModule).click();
	
		addEmp.add.click();
		
		driver.findElement(candFN).sendKeys(fN);
		
		driver.findElement(candLN).sendKeys(lN);
		
		driver.findElement(candEmailID).sendKeys(generateRandomStrings(7)+"@gmail.com");
		
	     save.click();
		
		driver.findElement(candTab).click();
		
	}
	
	public void resetBtn() {
		
		driver.findElement(candSearch).sendKeys("Nikhil Jadhav");
		
		driver.findElement(drop1).click();
		
		driver.findElement(reset).click();
		
		
	}
	
	public void deleteBtn() {
		
         driver.findElement(recModule).click();
    	 
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 
    	 js.executeScript("window.scrollBy(0,700)");
    	 
    	 driver.findElement(check22).click();
    	 
    	 js.executeScript("window.scrollTo(0,0)");
    	 
    	 addEmp.delete.click();
    	 
    	 driver.findElement(addEmp.cofirmDel).click();
    }
	
	
	
	
	}
	


