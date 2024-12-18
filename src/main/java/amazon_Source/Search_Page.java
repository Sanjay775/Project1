package amazon_Source;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	WebDriver driver;
	@FindBy(xpath="(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]//span)[1]") 
	WebElement product;
	@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']") WebElement wish;
	@FindBy(xpath="//div[@class=\"a-popover-wrapper\"]") WebElement frame;
	@FindBy(xpath="//button[@class=\" a-button-close a-declarative\"]") WebElement pop;
	public void prod() throws InterruptedException {
		product.click();
		Thread.sleep(3000);	
		}
	public void wish(WebDriver driver) throws InterruptedException {
		wish.click();
		Thread.sleep(2000);	
		
		}
	public void pop1() {
		pop.click();
	}
	public Search_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
