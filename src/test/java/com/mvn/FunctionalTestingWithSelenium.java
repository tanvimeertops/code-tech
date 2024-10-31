package com.mvn;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FunctionalTestingWithSelenium {

	WebDriver driver=null;
	
	@Before
	public  void loadBrowser() {
		driver=new BrowserConfiguration()
	.BrowserSelection("chrome", "https://www.saucedemo.com/");
	}
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	    
		driver.findElement(By.id("react-burger-menu-btn"))
		.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}
}
