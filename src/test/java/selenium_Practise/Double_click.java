package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		WebElement e1 = driver.findElement(By.xpath("//div[@class=\"popup1\"]"));
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();
		WebElement e2 = driver.findElement(By.xpath("//div[@class=\"popup3\"]"));
		a1.doubleClick(e2).perform();
	}
}
