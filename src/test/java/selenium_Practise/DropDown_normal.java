package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown_normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement shirt = driver.findElement(By.name("url"));
		shirt.sendKeys(Keys.ARROW_DOWN);
		shirt.sendKeys(Keys.ARROW_DOWN);
		shirt.sendKeys(Keys.ARROW_DOWN);
		
		

	}

}
