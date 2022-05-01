package CyberSuccess.cyberSuccessAutomation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyDifferentWindowsAmazon extends Baseclass {

	public static void main(String[] args) {
		
		getInstanceBrowser("Chrome");
		
		driver.navigate().to("https://www.amazon.in/");
		 
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		select.selectByVisibleText("Electronics");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		//
		
//		fluentWait(By.xpath("//div[@data-cel-widget=\"search_result_2\"]/descendant::h2"));
		
//		Actions act= new Actions(driver);
		
    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@data-cel-widget='search_result_2']/descendant::h2"))));
		
		driver.findElement(By.xpath("//div[@data-cel-widget='search_result_2']/descendant::h2")).click();
		
	    String ParentWidnow=driver.getWindowHandle();
	
	    System.out.println(ParentWidnow);
	    

	  Set<String> allWindows=driver.getWindowHandles();
	    
	   for(String windowId: allWindows) {
		   
		   if(!windowId.equals(ParentWidnow))
		   {
			   driver.switchTo().window(windowId);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   System.out.println(driver.getTitle());
			   System.out.println(windowId);
		   }
		   
		   
	   }
		
	}

	
	}


