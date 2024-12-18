package project1_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail {
	@FindBy(xpath="(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]//span)[1]") 
	 WebElement prod;
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]") WebElement rupees;
	@FindBy(xpath="//h1[.=' About this item ']") WebElement description;
	@FindBy(xpath="//h2[.='Customer reviews']") WebElement review;
	
	public void detail(WebDriver driver) {
		prod.click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> ids = id.iterator();
		String parent = ids.next();
		String child = ids.next();
		driver.switchTo().window(child);
		System.out.println(rupees.isDisplayed());
		System.out.println(description.isDisplayed());
		System.out.println(review.isDisplayed());		
		
	}
	public ProductDetail(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
