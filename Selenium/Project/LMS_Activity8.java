package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LMS_Activity8 {
  
	WebDriver driver;
	WebDriverWait wait;
	 

	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/lms");  
		  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  }
	  
	  @DataProvider(name = "writetous")
	    public static Object[][] credentials() {
	        return new Object[][] 
	        		{ 
	       { "FST selenium project","dummyid@gmail.com","LMS_project testing","Automating the script via selenium java for FST"},
	        	
	        	};
	    }
	
	  @Test(dataProvider = "writetous")
	  public void activity8(String name, String email,String subject, String Message) throws InterruptedException {
		  
		  driver.findElement(By.linkText("Contact")).click();
		  
		  WebElement Title =driver.findElement(By.className("uagb-ifb-title"));
		  
		  wait.until(ExpectedConditions.visibilityOf(Title));
		  
		  WebElement fullnamefield=driver.findElement(By.id("wpforms-8-field_0"));
		  WebElement emailfield=driver.findElement(By.id("wpforms-8-field_1"));
		  WebElement subjectfield=driver.findElement(By.id("wpforms-8-field_3"));
		  WebElement Messagefield=driver.findElement(By.id("wpforms-8-field_2"));
		  WebElement button=driver.findElement(By.id("wpforms-submit-8"));
		  
		  
		  
		  fullnamefield.clear();
		  emailfield.clear();
		  subjectfield.clear();
		  Messagefield.clear();
		  
		  fullnamefield.sendKeys(name);
		  emailfield.sendKeys(email);
		  subjectfield.sendKeys(subject);
		  Messagefield.sendKeys(Message);
		  button.click();
		  
		 String confirmationmessage= driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us')]")).getText();
		 
		 System.out.println("Confirmation message from contact page :" +confirmationmessage);
	
	  }
	  
	

	@AfterClass
	  public void afterClass() {
		  
		  driver.close();
	  }
	
	
	
	
}
