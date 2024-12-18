package amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")  WebElement Hover;
	@FindBy(xpath="(//span[.='Sign in'])[1]")  WebElement Signin;
	@FindBy(id="twotabsearchtextbox") WebElement search;
	
	public void hover_Over(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(Hover).perform();;
		Signin.click();
	}
	public void searche() {
		search.sendKeys("football"+Keys.ENTER);
	}
	
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
