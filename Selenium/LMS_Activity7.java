package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity7 {
	WebDriver driver;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");   
		  
		  

	  }
	
	  @Test(priority=1)
	  public void activity7() throws InterruptedException {
		  
		  driver.findElement(By.linkText("All Courses")).click();
		  
		  Thread.sleep(100);
		  
		List<WebElement> coursecount= driver.findElements(By.className("ld_course_grid_price")) ;
		
		System.out.println("Total number of course available in the my course page :" +coursecount.size());
		
	
		
	
		  
		  

	  }
	  
	

	@AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }
}
