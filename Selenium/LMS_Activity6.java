package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity6 {
	

		WebDriver driver;
		 

		  @BeforeClass
		  public void beforeClass() {
			  
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.get("https://alchemy.hguy.co/lms");  
			  
		  }
			  
		
		
		  
		
		  @Test(priority=1)
		  public void activity6() throws InterruptedException {
			  
			  driver.findElement(By.linkText("My Account")).click();
			  
			  Thread.sleep(100);
			  
			  String myaccountheader=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
			  System.out.println("My account menu header:" +myaccountheader);
			   
			  Assert.assertEquals(myaccountheader,"My Account");	  

		  }
		  
		  
		  @Test(priority=2)
		  
		  public void loginTestCase() throws InterruptedException {
			 
			  driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
		  
			  WebElement usernameField = driver.findElement(By.id("user_login"));
		        WebElement passwordField = driver.findElement(By.id("user_pass"));
		        WebElement button = driver.findElement(By.id("wp-submit"));
		        
		        usernameField.clear();
		        passwordField.clear();
		      
		        usernameField.sendKeys("root");
		        passwordField.sendKeys("pa$$w0rd");
		        button.click();
		        
		        Thread.sleep(100);
		        WebElement check= driver.findElement(By.className("ld-profile-card"));
		        
		        if(check.isDisplayed())
		        {
		        
		        System.out.println("you are logged in successfully to My Accouts page");
		        
		        }
		        
		        else
		        {
		        	
		        	System.out.println("your login is not successfull");
			        
		        }
		        	
		        	
		        
		        
		        
		  }
		   
		  @AfterClass
		  public void afterClass() {
			  
			  
			  
			  
			  driver.close();
		  }
  }


