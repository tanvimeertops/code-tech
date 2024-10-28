package com.mvn;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class JunitFBData {
	String username,password;
	UnitTestingWithJunit utj;
	
	@Before
	public void before() {
		utj=new UnitTestingWithJunit();
	}
	public JunitFBData(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"meertanvi.testing@gmail.com","Tops@123"},
			{"meertanvitesting@gmail.com","Tops@123"},
				{"meertanvi.testing123@gmail.com","Tops@123"}});  
	}
	
	@Test
	public void test() throws InterruptedException {
		utj.fbLogin(username, password);
	}
}
