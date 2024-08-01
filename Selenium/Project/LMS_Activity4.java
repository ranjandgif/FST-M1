package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity4 {
	 WebDriver driver;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");    
	  }
	
	  @Test(priority=1)
	  public void activity4() {
		  
		  String secondpopular=driver.findElement(By.xpath("//h3[contains(text(),'Email')]")).getText();
		  
		  System.out.println("second most popular course Goal:" +secondpopular);
		   
		  Assert.assertEquals(secondpopular,"Email Marketing Strategies");
	  }
	  
	 
	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }

	  
}
