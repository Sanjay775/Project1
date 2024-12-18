package project_test;

import java.time.Duration;

import org.testng.annotations.Test;

import project1_source.EditProfilr;
import project1_source.Login_success;
import project1_source.Signup_newuser;

public class Testcase4 extends Launch_quit {
	@Test
	public void edit() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Signup_newuser s1=new Signup_newuser(driver);
		s1.succe(driver);
		Login_success lo=new Login_success(driver);
		lo.credentials();
		Thread.sleep(2000);
		EditProfilr e1=new EditProfilr(driver);
		e1.edit(driver);
		
	}

}
