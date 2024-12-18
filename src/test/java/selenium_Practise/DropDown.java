package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement dd = driver.findElement(By.id("Choice1"));
		Select s1=new Select(dd);
		s1.selectByVisibleText("Demo2");
		Thread.sleep(2000);
		WebElement dd1 = driver.findElement(By.id("Choice2"));
		Select s2=new Select(dd1);
		s2.selectByValue("practice15");
		Thread.sleep(2000);
		WebElement dd3 = driver.findElement(By.id("Choice3"));
		Select s3=new Select(dd3);
		s3.selectByIndex(5);
		Thread.sleep(2000);
		WebElement dd4 = driver.findElement(By.id("Choice4"));
		Select s4=new Select(dd4);
		s4.selectByVisibleText("Energy6");
		Thread.sleep(2000);
		WebElement dd5 = driver.findElement(By.id("Choice5"));
		Select s5=new Select(dd5);
		s5.selectByVisibleText("Day5");
		Thread.sleep(2000);
		WebElement dd6 = driver.findElement(By.id("Choice6"));
		Select s6=new Select(dd6);
		s6.selectByIndex(2);
		

	}

}
