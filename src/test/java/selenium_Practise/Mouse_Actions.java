package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.linkText("Men Footwear"));
		a1.moveToElement(e2).perform();
		WebElement e3 = driver.findElement(By.linkText("Men's Casual Shoes"));
		a1.moveToElement(e3).perform();
		e3.click();
		

	}

}
