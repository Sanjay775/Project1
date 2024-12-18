package project_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project1_source.Incorrect_pwd;
import project1_source.Signup_newuser;

public class TestCase3 extends Launch_quit {
	@DataProvider(name="test1")
	public Object[][] loginDetails() {
		Object data[][]=new Object[6][2];
		data[0][0]= "sanju89433";//invalid UN
		data[0][1]= "sanju891";// invalid pwd
		
		data[1][0]= "sammyzayn@alopa.com";//valid UN
		data[1][1]= "sanju8932";// invalid pwd
		
		data[2][0]= "sanju89@alopa.com";//invalid UN
		data[2][1]= "sanju89";// valid pwd
		
		data[3][0]= "sanju89";//valid UN
		data[3][1]= "sanju89";// valid pwd
		
		data[4][0]= "sanju89";//valid UN
		data[4][1]= "sanju89";// invalid pwd
		
		data[5][0]= "sanju89ddfdf";//invalid UN
		data[5][1]= "sanju89fd";// invalid pwd
		return data;
		
	}
	@Test(dataProvider="test1")
	public void incorrect(String name, String pwd) {
		Signup_newuser a=new Signup_newuser(driver);
		a.succe(driver);
	Incorrect_pwd p1=new Incorrect_pwd(driver);
	p1.credentials(name, pwd);
	}
}
