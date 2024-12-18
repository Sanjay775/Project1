package package_maven.Project_maven;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launcg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		System.out.println(title);
		String win = driver.getWindowHandle();
		System.out.println(win);
		Thread.sleep(2000);
		driver.close();

	}

}
