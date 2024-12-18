package amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(xpath="(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]//span)[1]") 
	WebElement product;
	@FindBy(id="add-to-cart-button")  WebElement cart;
	public void Add_to_cart() throws InterruptedException {
		product.click();
		Thread.sleep(3000);
		
	}
	public void add() {
		cart.click();
	}
	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
