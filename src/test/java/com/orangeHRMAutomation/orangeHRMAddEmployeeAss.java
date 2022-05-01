package com.orangeHRMAutomation;

import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangeHRM.Automation.loginPageOrangeHRM;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class orangeHRMAddEmployeeAss extends Baseclass {

	

	private static WebElement PIM_firstName;

	public static void main(String[] args) throws ClassCastException {
		getInstanceBrowser("Chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		loginPageOrangeHRM loginPage= new loginPageOrangeHRM();
		
		loginPage.login("Admin","admin123");

		//for(int i=0;i<10;i++)
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
	/*	WebElement selectAllCheckbox=driver.findElement(By.id("ohrmList_chkSelectAll"));
		
		selectAllCheckbox.click();
		
		boolean checkbox=selectAllCheckbox.isSelected();
		
		System.out.println("All checkbox is selected: "+checkbox);*/
		
		driver.findElement(By.id("btnAdd")).click();
		
		WebElement PIM_FirstName=driver.findElement(By.id("firstName"));
		PIM_FirstName.sendKeys(generateRandomStrings(10));
		String FName=PIM_FirstName.getText();
		
		WebElement PIM_LastName=driver.findElement(By.id("lastName"));
		
		PIM_LastName.sendKeys(generateRandomStrings(12));
		
		String LName=PIM_LastName.getText();
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.xpath("//input[@id=\'empsearch_employee_name_empName\']")).sendKeys(LName);
		
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement FName_In_List=(WebElement) driver.findElements(By.xpath("//Table[@id='resultTable']/tbody[1]/tr[1]/td[2]"));
		WebElement LName_In_List=(WebElement) driver.findElements(By.xpath("//Table[@id='resultTable']/tbody[1]/tr[1]/td[4]"));
		
		
		try {
			validate(LName,FName_In_List.getText());
			validate(FName, FName_In_List.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}}
		
         
		
		
		
	
	
	
	


