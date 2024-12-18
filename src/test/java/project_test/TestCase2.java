package project_test;

import org.testng.annotations.Test;

import project1_source.Login_success;
import project1_source.Signup_newuser;

public class TestCase2 extends Launch_quit{
	
	@Test
	public void succ() {
		Signup_newuser s2=new Signup_newuser(driver);
		s2.succe(driver);
		Login_success l1=new Login_success(driver);
		l1.credentials();
		
		}
	}
