package com.mvn;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTestingWithJunit {
	String url;
public void sdLogin(String username,String password) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	url=driver.getCurrentUrl();
    
	driver.findElement(By.id("react-burger-menu-btn"))
	.click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("logout_sidebar_link")).click();
	driver.quit();
}
}
