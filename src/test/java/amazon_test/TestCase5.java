package amazon_test;

import java.util.Set;

import org.testng.annotations.Test;

import amazon_Source.AddtoCart;
import amazon_Source.Login_Credentials;
import amazon_Source.Login_page;
import amazon_Source.Remove_cart;

public class TestCase5 extends Launch_Quit{
	@Test
	public void remove() throws InterruptedException {
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
	    
	    Remove_cart r1=new Remove_cart(driver);
	    r1.Remove_from_cart();
	    
	    
	    
	}

}
