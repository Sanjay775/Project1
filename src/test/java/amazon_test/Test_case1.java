package amazon_test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon_Source.Login_page;

public class Test_case1 extends Launch_Quit {
	
	@Test
	
	public void test() {
	 
	Login_page l1=new Login_page(driver);
	l1.hover_Over(driver);
		
	}

}
