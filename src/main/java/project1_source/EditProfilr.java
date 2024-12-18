package project1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilr {
	@FindBy(xpath="//span[.=\"Hello, Sanjay\"]")   WebElement hover;
	@FindBy(xpath="//button[.='Manage Profiles']")  WebElement manage;
	@FindBy(linkText="View")  WebElement view;
	@FindBy(xpath="//div[.='Preferred department']")  WebElement prefered;
	@FindBy(xpath="//button[.='Edit']")  WebElement edit;
	@FindBy(xpath="//button[@class=\" a-button-close a-declarative\"]")  WebElement close;
	
	
	public void edit(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(hover).perform();
		manage.click();
		a.doubleClick(view).perform();
		prefered.click();
		edit.click();
		close.click();
	}
	public EditProfilr(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	

}
