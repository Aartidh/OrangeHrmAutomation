package com.orangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CyberSuccess.cyberSuccessAutomation.Baseclass;

public class FramesOperation extends Baseclass {

	public static void main(String[] args) {
		
		
		getInstanceBrowser("Chrome");
		
		
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");         
		
		String parentWindow=driver.getWindowHandle();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title=\'Photo Manager\']//iframe")));
		
		WebElement src=driver.findElement(By.xpath("//img[@src=\'images/high_tatras_min.jpg\']"));
				
		WebElement dst=driver.findElement(By.xpath("//div[@id=\'trash\']"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(src, dst).build().perform();
		
		act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
