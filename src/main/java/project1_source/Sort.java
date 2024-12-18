package project1_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sort {
	@FindBy(id="a-autoid-0-announce") WebElement sort;
	@FindBy(xpath="//li[@class=\"a-dropdown-item\"]//a")  List<WebElement> option;
	
	public void sortby() throws InterruptedException {
		sort.click();
		option.get(2).click();
		
		}
	public void sortbynew() {
		sort.click();
		option.get(4).click();
	}
	public Sort(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
