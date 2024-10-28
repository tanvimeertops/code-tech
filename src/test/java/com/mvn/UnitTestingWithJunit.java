package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTestingWithJunit {
public void fbLogin(String username,String password) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("//*[@id=\"mount_0_0_2f\"]/div/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\":r22:\"]")).click();
}
}
