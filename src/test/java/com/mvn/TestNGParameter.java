package com.mvn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameter {
WebDriver driver;
	
	@BeforeTest
	public void before() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

	}
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException, IOException {
	  
		driver.findElement(By.id("user-name"))
		.sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.id("password"))
		.sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getCurrentUrl(), 
				"https://www.saucedemo.com/inventory.html");
	  }
  
  @AfterTest
  public void after() {
	driver.close();
  }
  
}
