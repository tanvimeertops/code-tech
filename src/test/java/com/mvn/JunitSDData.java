package com.mvn;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class JunitSDData {
	String username,password;
	UnitTestingWithJunit utj;
	String url="https://www.saucedemo.com/inventory.html";
	@Before
	public void before() {
		utj=new UnitTestingWithJunit();
	}
	public JunitSDData(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
	{"standard_user","secret_sauce"},
	{"problem_user","secret_sauce"},
	{"locked_out_user","secret_sauce"}});  
	}
	
	@Test
	public void test() throws InterruptedException {
		utj.sdLogin(username, password);
		Thread.sleep(10000);
		Assert.assertEquals(url, utj.url);
	}
	
}
