package com.orangeHRMAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class AmazonAssignment extends Baseclass {

static int count;
	
	public static void main(String[] args) throws Exception {
		
        getInstanceBrowser("Chrome");
		
		driver.navigate().to("https://www.amazon.in/");
		 
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		select.selectByVisibleText("Electronics");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Television");
		
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		List<WebElement> listElements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
      
		List<WebElement> priceElements=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	
		listElements.forEach((element)->{
	    System.out.println(element.getText()); 
	    count=count+1;
	    
	  });
		 System.out.println(count);
		 validate1(count, 30);
	        
		ArrayList<Integer> priceArray=new ArrayList<Integer>();
		priceElements.forEach((element)->{
			  
			  String price=element.getText(); 
			int index_comma = price.indexOf(",");
			String sPrice=(price.substring(0, index_comma)+price.substring(index_comma+1));
		   int iPrice=Integer.parseInt(sPrice);
			
			priceArray.add(iPrice);
			 });
		
		System.out.println(priceArray);
		
		int size_ArrayList=priceArray.size();
		
		int max=Collections.max(priceArray);
		System.out.println("Maximum Price of Television is "+max);
		
		int min=Collections.min(priceArray);
		System.out.println("Minimum Price of Television is "+min);
		

	}

}
