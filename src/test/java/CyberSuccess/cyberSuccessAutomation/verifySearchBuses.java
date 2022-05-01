package CyberSuccess.cyberSuccessAutomation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class verifySearchBuses extends Baseclass {
	
	PropertyHandling prop;
	
	RedBuspage Redbus;
	
	@BeforeClass
	public void beforeclass() throws Exception {
		
		prop=new PropertyHandling();
		
		Redbus=new RedBuspage();
		
		getInstanceBrowser(prop.getProperty("browser"));
		
		driver.navigate().to("https://www.redbus.in/");
		}
	
	@Test
	
	public void searchBuses() {
		
	 driver.findElement(Redbus.fromLocation).sendKeys(prop.getProperty("fromLocation"));
	 
	 driver.findElement(Redbus.toLocation).sendKeys(prop.getProperty("toLocation"));
	 
	 
	 
	
	
	 

	}

}
