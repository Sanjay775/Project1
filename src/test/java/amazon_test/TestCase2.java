package amazon_test;

import org.testng.annotations.Test;

import amazon_Source.Login_Credentials;
import amazon_Source.Login_page;

public class TestCase2 extends Launch_Quit {
	
	
	@Test
	public void cred() {
		Login_page l1=new Login_page(driver);
		l1.hover_Over(driver);
		Login_Credentials l2=new Login_Credentials(driver);
		l2.credentials();
		l1.searche();
	}

}
