package project1_source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Incorrect_pwd {
	
	@FindBy(id="ap_email") WebElement un;
	@FindBy(id="continue") WebElement button;
	@FindBy(id="ap_password") WebElement pwd;
	@FindBy(id="auth-signin-button") WebElement button1;
	

	
	public void credentials(String un1, String pwd1) {
		un.sendKeys(un1);
		button.click();
		pwd.sendKeys(pwd1);
		button1.click();
	}
	public Incorrect_pwd(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	

}
