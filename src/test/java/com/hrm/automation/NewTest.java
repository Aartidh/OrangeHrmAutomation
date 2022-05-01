
package com.hrm.automation;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod 
	public void afterMethod()
	{
		System.out.println("Inside After Method");
	}
	
	@BeforeGroups({"Sanity","Regression"})
	public void beforeGroup()
	{
		System.out.println("INside BF Group");
	}
	
	@AfterGroups({"Sanity","Regression"})
	public void afterGroup()
	{
		System.out.println("INside AF Group");
	}
	
	
	
	
  @Test(groups={"Sanity","Regression"})
  public void Sample() {
	  
	  System.out.println("Hello Sample method............");
	  
  }
  
  @Test(groups="Regression")
  public void M1()
  {
	  System.out.println("Hello m1 method................");
  }
  
  @Test
  public void M2()
  {
	  System.out.println("..........in m2");
  }
  
  
}
