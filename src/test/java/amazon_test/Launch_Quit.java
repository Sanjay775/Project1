package amazon_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Launch_Quit {
	WebDriver driver;
	@BeforeTest
	
	public void launch() {
		
			driver=new EdgeDriver();	
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		
	}

}
