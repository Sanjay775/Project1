package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books"+Keys.ENTER);
		//driver.findElement(By.name("field-keywords")).sendKeys("bat"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("bat"+Keys.ENTER);
		//driver.findElement(By.linkText("Jaspo CRIC Addict Plastic Cricket Bat Set Combo with Soft Cricket Ball for Kids (Size-5)(8years & Above)")).click();
		driver.findElement(By.partialLinkText("Addict Plastic Cricket")).click();
		//driver.close();

	}

}
