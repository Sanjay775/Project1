package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;
	@FindBy(id="email") WebElement un;
	
	@FindBy(name="pass") WebElement pwd;
	
	@FindBy(name="login") WebElement button;
	@FindBy(xpath="//*[name()='g' and contains(@mask,'url(#:R1ld')]//*[name()='image' and contains(@x,'0')]")   WebElement logo;
	@FindBy(xpath="//span[@id=':r2s:']")  WebElement logout;
	
	public void user_name() {
		un.sendKeys("9845986316");
	}
	public void pass() {
		pwd.sendKeys("Sa24091999");
	}
	public void login() {
		button.click();
	}
	public void logo() {
		logo.click();
	}
	public void logout() {
		logout.click();
	}
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
