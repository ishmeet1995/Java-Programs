package package_1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
		
	public static int sum() {
		return(1);
	}
	public static void main(String[] args) { 	
		System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IE_Driver\\2.45\\selenium-ie-driver-2.45.0.jar");
		
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Testing"); //for finding an element
	/*	try {Thread.sleep(2000);} catch (Exception e){}
		driver.findElement(By.name("btnK")).click();
		try {Thread.sleep(2000);} catch (Exception e){}
		driver.findElement(By.partialLinkText("Software testing - Wikipedia")).click();
		try {Thread.sleep(2000);} catch (Exception e){}
		System.out.println(driver.findElement(By.id("mw-content-text")).getText());
		driver.close(); */
	}

}
