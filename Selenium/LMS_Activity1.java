package Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_Activity1 {
	 WebDriver driver;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");    
	  }
	  
	  @Test(priority=1)
	  public void activity1() {
		  
		  String pageheader1=driver.getTitle();
		  
		  System.out.println("Title of main page:" +pageheader1);
		   
		  Assert.assertEquals(pageheader1,"Alchemy LMS – An LMS Application" );
	  }
	 	  
	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }

	  
}
