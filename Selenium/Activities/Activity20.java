package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity20 {

	public static void main(String[] args) {
		
      WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		System.out.print("main page title: " +driver.getTitle());
		driver.findElement(By.id("prompt")).click();
		Alert dialoguebox=driver.switchTo().alert();
		System.out.print("\n main page title: " +dialoguebox.getText());
		dialoguebox.sendKeys("Awesome!");

		dialoguebox.accept();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}