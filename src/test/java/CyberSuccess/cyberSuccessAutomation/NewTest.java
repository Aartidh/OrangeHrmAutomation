package CyberSuccess.cyberSuccessAutomation;

import org.testng.annotations.Test;

import com.orangeHRM.Automation.loginPageOrangeHRM;
import com.orangeHRMAutomation.LoginPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class NewTest extends Baseclass {
	
	PropertyHandling prop;
	
	
	@BeforeClass
	public void beforeClass() throws Exception {
	
	prop = new PropertyHandling();
	getInstanceBrowser(prop.getValue("browser"));
	driver.navigate().to(prop.getValue("orangeHRMUrl"));
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/","Successfully Validated");
	
	
	}
  @Test(dataProvider ="ExcelDataProvider")
  public void login(Object userName,Object PassWord) throws InterruptedException 
  {
	  LoginPage login=new LoginPage();
	 
	  String un=userName.toString();String pw=PassWord.toString();
         if(un.equals("Admin") && pw.equals("admin123"))
     {
		 login.login(userName.toString(),userName.toString());
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
//	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		 
//		 wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//a[@id=\"welcome\"]"))));
		
//		 Thread.sleep(3000); 

		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.findElement(By.partialLinkText("Welcome")).click(); 
         driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	   System.out.println("userName"+userName.toString()+" PassWord "+PassWord.toString());
	 } 
	 else {
		 login.login(userName.toString(),PassWord.toString());
//		 driver.navigate().refresh();
         
		String errormsg= driver.findElement(By.id("spanMessage")).getText();
		 System.out.println(errormsg);
	 }}
	 
  
  

  @DataProvider(name="ExcelDataProvider")
  public Object[][] ExcelDataProvider() throws IOException {
		String filePath = "C:\\Users\\Admin\\Documents\\TestData.xlsx";

     return ExcelUtil.getExcelData(filePath, "Sheet1");
     
    }}
  

