package com.orangeHRMAutomation;

import org.testng.annotations.Test;
import com.orangeHRM.Automation.loginPageOrangeHRM;

import CyberSuccess.cyberSuccessAutomation.Baseclass;
import CyberSuccess.cyberSuccessAutomation.ExcelUtil;
import CyberSuccess.cyberSuccessAutomation.PropertyHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class ImportFromEmpGridToExcelData extends Baseclass {
	 PropertyHandling prop;
	  
	
	 @BeforeClass
	  public void BrowserInstance() throws Exception {
		   	prop = new PropertyHandling();
			getInstanceBrowser(prop.getValue("browser"));
			driver.navigate().to(prop.getValue("orangeHRMUrl"));
			
			 loginPageOrangeHRM login=new loginPageOrangeHRM();
			 login.login(prop.getValue("orangeHRMUsername"),prop.getValue("orangeHRMPassword") );
			 
			 }
		            
	 
	 
	 @Test
	 public void ImportFromEmpGridToExcelData()
	 {  driver.findElement(By.id("menu_pim_viewPimModule")).click();
      List <WebElement> row=(List<WebElement>) driver.findElement(By.xpath("//table[@id='resultTable']//tr//td"));
      System.out.println(row.size());
      int RowCount=row.size();
      row.forEach((element)->{
       System.out.println(element.getText()); 
  	   });
      
//      ExcelUtil SetDataToExcel=new ExcelUtil();
//      String filePath = "C:\\Users\\Admin\\Documents\\TestData.xlsx";
//      SetDataToExcel.setExcelData(filePath, Sheet2, 0, 0, null)
	 
	 
		 
	 }
	 {
	
 
		
		  }
		 
}
