package amazon_test;

import java.util.Set;

import org.testng.annotations.Test;

import amazon_Source.AddtoCart;
import amazon_Source.Login_Credentials;
import amazon_Source.Login_page;

public class TestCase4 extends Launch_Quit {
	@Test
	public void cred() throws InterruptedException {
		Login_page l1=new Login_page(driver);
		l1.hover_Over(driver);
		Login_Credentials l2=new Login_Credentials(driver);
		l2.credentials();
		l1.searche();
		Thread.sleep(3000);
		AddtoCart a2=new AddtoCart(driver);
		a2.Add_to_cart();
		Set<String> id = driver.getWindowHandles();
		String a=" ";
	    for(String id1:id) {
	    	a=id1;
	    }
	    driver.switchTo().window(a);
	    a2.add();
	    
	    
	}

}
