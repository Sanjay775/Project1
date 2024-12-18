package project1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_success {
	@FindBy(id="ap_email") WebElement un;
	@FindBy(id="continue") WebElement button;
	@FindBy(id="ap_password") WebElement pwd;
	@FindBy(id="auth-signin-button") WebElement button1;
	
	public void credentials() {
		un.sendKeys("7019858945");
		button.click();
		pwd.sendKeys("Sa24091999");
		button1.click();
	}
	public Login_success(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
