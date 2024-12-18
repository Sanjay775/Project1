package project_test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project1_source.Login_success;
import project1_source.Search_Page;
import project1_source.Signup_newuser;
public class TestCase5 extends Launch_quit {
	@DataProvider(name="item")
	public Object[][] find(){
		Object data[][]=new Object[1][1];
		data[0][0]="bat";
		
		
		return data;
	}
	@Test(dataProvider="item")
	public void search(String item1) {
		Signup_newuser s1=new Signup_newuser(driver);
		s1.succe(driver);
		Login_success l1=new Login_success(driver);
		l1.credentials();
		Search_Page search=new Search_Page(driver);
		search.searchbox(item1);	
	}
}
