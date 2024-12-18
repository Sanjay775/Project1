package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/rightclick/");
		WebElement right = driver.findElement(By.linkText("Practice Link4"));
		Actions a1=new Actions(driver);
		a1.contextClick(right).perform();

	}

}
