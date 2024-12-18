package project1_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")  WebElement search;
	
	public void searchbox(String item) {
		search.sendKeys(item);
		search.sendKeys(Keys.ENTER);
	}
	public Search_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
