package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity9 {

	WebDriver driver;
	WebDriverWait wait;
@BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms"); 
		  wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		  }

@Test(priority=1)
	  public void activity9() throws InterruptedException {
		  
		  driver.findElement(By.linkText("My Account")).click();
		  
		  String myaccountheader=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		  System.out.println("My account menu header:" +myaccountheader);
		   
		  Assert.assertEquals(myaccountheader,"My Account");	  
           }
	  
@Test(priority=2)
	  
	  public void loginTestCase() {
		 
		  driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
	  
		    WebElement usernameField = driver.findElement(By.id("user_login"));
	        WebElement passwordField = driver.findElement(By.id("user_pass"));
	        WebElement button = driver.findElement(By.id("wp-submit"));
	        
	        usernameField.clear();
	        passwordField.clear();
	      
	        usernameField.sendKeys("root");
	        passwordField.sendKeys("pa$$w0rd");
	        button.click();
	        
	        WebElement check= driver.findElement(By.className("ld-profile-card"));
	        
	        if(check.isDisplayed())
	        {
	        
	        System.out.println("you are logged in successfully to My Accounts page");
	        
	        }
	        
	        else
	        {
	        	
	        	System.out.println("your login is not successfull");
	        	wait.until(ExpectedConditions.visibilityOf(check));
		        
	        }}
	       
@Test(priority=3)

public void course() throws InterruptedException
{
	 driver.findElement(By.linkText("All Courses")).click();
	  
	  //Thread.sleep(100);
	  
driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
 driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();
 Thread.sleep(10);
String coursetitle = driver.getTitle();
System.out.println("Title of course page:"+coursetitle);

Assert.assertEquals(coursetitle,"Developing Strategy – Alchemy LMS");

try
{
	
	WebElement Coursestatus=driver.findElement(By.xpath("(//span[@text='Mark Complete'])"));
			Coursestatus.click();
	System.out.println("Course completion status : " +Coursestatus.getText());
}

catch(NoSuchElementException e)
{
System.out.println("Mark complete button is not visible");
WebElement Coursestatus1=driver.findElement(By.className("ld-lesson-list-progress"));
System.out.println("Course completion status : " +Coursestatus1.getText());
}	
}
@AfterClass
	  public void afterClass() {
		    
		  driver.close();
	  }
	  
}


