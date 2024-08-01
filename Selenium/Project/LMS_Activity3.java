package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity3 {
	 WebDriver driver;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");    
	  }
	  
	 
	  @Test(priority=1)
	  public void activity3() {
		  
        String firstinfobox=driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();
		  
		  System.out.println("Title of info page:" +firstinfobox);
		   
		  Assert.assertEquals(firstinfobox,"Actionable Training");
	  
	  }
	  
	 
	  @AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }

	  
}
