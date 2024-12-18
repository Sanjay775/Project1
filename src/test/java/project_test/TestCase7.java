package project_test;

import org.testng.annotations.Test;

import project1_source.Login_success;
import project1_source.ProductDetail;
import project1_source.Search_Page;
import project1_source.Signup_newuser;

public class TestCase7 extends Launch_quit{
	@Test
	public void search() throws InterruptedException {
		Signup_newuser s1=new Signup_newuser(driver);
		s1.succe(driver);
		Login_success l1=new Login_success(driver);
		l1.credentials();
		Search_Page search=new Search_Page(driver);
		search.searchbox("bat");	
		ProductDetail p1=new ProductDetail(driver);
		p1.detail(driver);
	
}}
