
package project1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_newuser {
	
	@FindBy(xpath="//span[.=\"Hello, sign in\"]")   WebElement hover;
	@FindBy(xpath="(//span[.='Sign in'])[1]")  WebElement Signin;
	@FindBy(partialLinkText=" Amazon account")  WebElement create;
	@FindBy(xpath="//input[@id='ap_customer_name']") WebElement Fname;
	@FindBy(xpath="//input[@name='email']") WebElement mobile;
	@FindBy(xpath="//input[@id='ap_password']") WebElement pass;
	@FindBy(xpath="//span[@id='auth-continue']") WebElement clickon;
	@FindBy(xpath="//span[@id='a-autoid-0']") WebElement verify;
	
	public void hover(WebDriver driver) throws InterruptedException {
		Actions a=new Actions(driver);
		a.moveToElement(hover).perform();
		Signin.click();
		create.click();
		Fname.sendKeys("sanju");
		mobile.sendKeys("90280299");
		pass.sendKeys("sanju@14");
		clickon.click();
		Thread.sleep(10000);
		verify.click();	
	}
	public void succe(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(hover).perform();
		Signin.click();
	}
	
	 public Signup_newuser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
}
