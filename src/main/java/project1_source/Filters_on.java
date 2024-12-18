package project1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters_on {
	
	@FindBy(xpath="(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label//i)[3]") WebElement check;
	@FindBy(xpath="//span[.=\"SG\"]")  WebElement check1;
	public void check() throws InterruptedException {
		check.click();
		Thread.sleep(4000);
		check1.click();
	}
	public Filters_on(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
