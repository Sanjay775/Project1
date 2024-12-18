package project_test;

import org.testng.annotations.Test;

import project1_source.Signup_newuser;

public class TestCase1 extends Launch_quit {
	
	@Test
	public void signup() throws InterruptedException {
		Signup_newuser s1=new Signup_newuser(driver);
		s1.hover(driver);
		
	}

}
