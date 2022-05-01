package CyberSuccess.cyberSuccessAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyOrangeHRM extends Baseclass {

	public static void main(String[] args) throws Exception {
		getInstanceBrowser("Chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String pageTitle=driver.getTitle();
		validate(pageTitle,"OrangeHRM");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String CurrentUrl=driver.getCurrentUrl();
		validate(CurrentUrl,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement AdminModule=driver.findElement(By.id("menu_admin_viewAdminModule"));
		if(AdminModule.isDisplayed()) 
		{
		  System.out.println("Successfully validated AdminModule"+AdminModule);	
		}
		else
		{
			throw new Exception("Failed to validate AdminModule"+AdminModule);
			
			
		}}
	   
		

	}

	

	

	
