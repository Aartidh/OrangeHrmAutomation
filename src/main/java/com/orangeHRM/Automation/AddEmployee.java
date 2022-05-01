package com.orangeHRM.Automation;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class AddEmployee extends Baseclass {
@FindBy(id="btnAdd")
public WebElement add;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
@FindBy(id="btnDelete")
public WebElement delete;
	
	public AddEmployee(){
		PageFactory.initElements(driver, this);
	}
	
	
	
   // public By addButton=By.id("btnAdd");
    // public By saveButton=By.id("btnSave");	
//	public By deleteButton=By.id("btnDelete");
	
	
	public By pimModule=By.id("menu_pim_viewPimModule");

    public By selectAllCheckbox=By.id("ohrmList_chkSelectAll");
   
    public By firstName=By.id("firstName");
    
    public By lastName=By.id("lastName");
    
    public By empList=By.id("menu_pim_viewEmployeeList");
    
    public By empSearch=By.id("empsearch_employee_name_empName");
    
    public By searchButton=By.id("searchBtn");
    
    public String fNameValue=generateRandomStrings(5);

    public String lNameValue=generateRandomStrings(7);
    
    public By check2=By.id("ohrmList_chkSelectRecord_30");
    
    public By cofirmDel=By.id("dialogDeleteBtn");
    
    public By reset=By.id("resetBtn");
    
    public By forward=By.xpath("//li[@class=\'next\']//a");
    
    public By backward=By.xpath("//li[@class=\'previous\']//a");
    
    public By last=By.xpath("//li[@class=\'last\']//a");
    
    public By first=By.xpath("//li[@class=\'first\']//a");
    
    		
    public void addEmp() {

     driver.findElement(pimModule).click();
     
		/*
		 * WebElement selectAllCheckbox=driver.findElement(this.selectAllCheckbox);
		 * 
		 * selectAllCheckbox.click();
		 * 
		 * boolean checkbox=selectAllCheckbox.isSelected();
		 * 
		 * System.out.println("All checkbox is selected: "+checkbox);
		 */
        add.click();
     
     driver.findElement(firstName).sendKeys(fNameValue);
     
     driver.findElement(lastName).sendKeys(lNameValue);

     save.click();

    }
    
    public void verifyAddedEmp() throws InterruptedException {
    	 driver.findElement(pimModule).click();
    	
    	//driver.findElement(empList).click();      
    	
        String empNameSrch=fNameValue+" "+lNameValue;
    	
        
        driver.findElement(empSearch).sendKeys(empNameSrch);
    	
       // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	
    //	wait.until(ExpectedConditions.visibilityOf((WebElement) searchButton));
    	
    	driver.findElement(searchButton).click();
    	
    	}
    public void deleteEmp() throws InterruptedException {
    	
    	 driver.findElement(pimModule).click();
    	 
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 
    	 js.executeScript("window.scrollBy(0,700)");
    	 
    	 driver.findElement(check2).click();
    	 
    	 js.executeScript("window.scrollTo(0,0)");
    	 
    	 delete.click();
    	 
    	 driver.findElement(cofirmDel).click();
    }
     
   public void resetBtnF() {
	   
	   driver.findElement(pimModule).click();
	   
	   driver.findElement(empSearch).sendKeys("Nikhil");
	   
	   driver.findElement(reset).click();
   } 	
   
   public void frwdBtnFun() {
	   
	   driver.findElement(pimModule).click();
	   
	   driver.findElement(forward).click();
	   
	   driver.findElement(backward).click();
	   
	   driver.findElement(last).click();
	   
	   driver.findElement(first).click();
   }
   
    	  
}