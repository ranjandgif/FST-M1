package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity5 {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");    
	  }
	
	  @Test(priority=1)
	  public void activity5() throws InterruptedException {
		  
		  driver.findElement(By.linkText("My Account")).click();
		  
		  
		  String myaccountheader=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		  System.out.println("My account menu header:" +myaccountheader);
		   
		  Assert.assertEquals(myaccountheader,"My Account");	  

	  }
	  
	 
	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }

	  
}
