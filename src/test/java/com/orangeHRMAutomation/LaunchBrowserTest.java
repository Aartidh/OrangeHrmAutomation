package com.orangeHRMAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
  @Test
  public void LaunchBrowserTest () {
		 WebDriver driver=null;
		 try {//launch the browser
			 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		
		
		
		//Nevigate to website
		//driver.get("https://google.com");
		driver.navigate().to("https://google.com");
		
		//move to back page
		driver.navigate().back();
		
		//get Title of page
		System.out.println("page 1 Title"+driver.getTitle());
		
		//move to Next page
	     driver.navigate().forward();
	   
	     //get Title of page
			System.out.println("page 2 Title"+driver.getTitle());
	     
		if(driver.getTitle().equals("Geegle"))
		{System.out.println("We have Successfully verified the google page");
			
		} 
		else {
			throw new Exception("We have not verfied google page");
			
		}driver.navigate().refresh();
		}
		catch(Exception e)
		{
			
		e.printStackTrace();
		} 
		
		finally {
			driver.close();
		}

	}
  }

