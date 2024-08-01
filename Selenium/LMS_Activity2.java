package Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_Activity2 {
	 WebDriver driver;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");    
	  }
	  
	 
	  
	  @Test(priority=1)
	  public void activity2() {
		  
		  String homepageheader=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		  
		  System.out.println("Title of home page:" +homepageheader);
		   
		  Assert.assertEquals(homepageheader,"Learn from Industry Experts" );
	  }
	  
	 
	  
	 
	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }

	  

}
