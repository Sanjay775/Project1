package test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import source.Login_Page;

public class TestCase_1 {
	@Test
	public void Test1() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Login_Page l1=new Login_Page(driver);
		l1.user_name();
		l1.pass();
		l1.login();
		Thread.sleep(2000);
		l1.logo();
		l1.logout();
	}

}
