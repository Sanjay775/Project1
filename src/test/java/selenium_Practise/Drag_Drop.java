package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"container\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		a1.dragAndDrop(drop, drag).perform();

	}

}
