package amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Remove_cart {
	
		@FindBy(xpath="//span[@id=\"sw-gtc\"]")  WebElement rem;
		@FindBy(xpath="(//button[@class=\"a-declarative\"])[1]")  WebElement remove;
		
		public void Remove_from_cart() throws InterruptedException {
			rem.click();
			Thread.sleep(2000);
			remove.click();
		}
		public Remove_cart(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

}
