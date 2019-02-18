package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer1 {
		
	public static int sum() {
		return(1);
	}
	public static void main(String[] args) throws Exception { 	
		System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IE_Driver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");	
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getWindowHandle());
		Thread.sleep(10000);
	//driver.switchTo().defaultContent();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("testing"+Keys.ENTER);
	}

}
