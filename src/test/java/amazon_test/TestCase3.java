package amazon_test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazon_Source.Login_Credentials;
import amazon_Source.Login_page;
import amazon_Source.Search_Page;

public class TestCase3 extends Launch_Quit{
	@Test
	public void wish() throws InterruptedException {
		Login_page l1=new Login_page(driver);
		l1.hover_Over(driver);
		Login_Credentials l2=new Login_Credentials(driver);
		l2.credentials();
		l1.searche();
		Search_Page s1=new Search_Page(driver);
		s1.prod();
		Set<String> id = driver.getWindowHandles();
	    String a=" ";
	    for(String id1:id) {
	    	a=id1;
	    }
	    driver.switchTo().window(a);
		s1.wish(driver);
		System.out.println(driver.getWindowHandles());
		s1.pop1();
		
		
		
	}

}
