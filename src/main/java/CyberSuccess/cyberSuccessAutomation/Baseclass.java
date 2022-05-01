package CyberSuccess.cyberSuccessAutomation;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Baseclass {
      public static WebDriver driver=null;
	 public static void getInstanceBrowser(String Browser)
	 { switch(Browser)
		 { 
	 case "Chrome":
	System.setProperty("webdriver.chrome.driver", "D:\\Aarti\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	break;
	
	 /*case "Edge":
	System.setProperty("webdriver.Edge.driver", "D:\\Aarti\\Driver\\msedgedriver.exe");
	driver= new EdgeDriver();
	 case "Opera":
			System.setProperty("webdriver.Opera.driver", "D:\\Aarti\\Driver\\operadriver.exe");
			driver=new OperaDriver();*/
	
	 } }
	 public static void validate(String Actual, String Expected) throws Exception {
			if(Actual.equals(Expected))	
			{
				System.out.println("Validated"+Actual+"Successfully");
			}
			else {
				throw new Exception("Not Validated as OrangeHRM");
			}}
	
	 public static void validate1(int Actual,int Expected)throws Exception {

           if(Actual==Expected)
           {
        	   System.out.println("Validated actual count "+Actual+" Successfully");  
           }
           else
           { throw new Exception("Not Validated as "+Expected);
        	              }
				
			}
			
			  public static String generateRandomStrings(int count) { 
				  Random random=new Random();
			  
			  return random.ints(65, 90).limit(count).collect(StringBuilder::new,
			  StringBuilder::appendCodePoint, StringBuilder::append).toString();
			  
			  }
			 
	
	@SuppressWarnings("unchecked")
	public static void fluentWait(final By by) {
	Wait wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(Exception.class);	
	
	wait.until(new Function<WebDriver,WebElement>(){
		
		public WebElement apply(WebDriver driver) {
			System.out.println("Applying Fluent wait....");
			
			
			return driver.findElement(by);
		}
		
	});
	}
	  
	
	}

	 
	 

