package package_1;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Practice {
	 static WebDriver driver = null;
	 static String search_item = "Einstien";
	
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform() throws Exception{
		driver.findElement(By.name("q")).sendKeys(search_item);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(200);
		open_wiki();
	}

	static void open_wiki() {
		driver.findElement(By.xpath("//a[contains(@href, '/wiki/')]//h3[@class = 'LC20lb' and contains(text(),"+search_item+")]")).click();
		System.out.println(driver.findElement(By.id("bodyContent")).getText());
		
	}
	public void DriverClose() throws Exception{
		driver.close();
		driver.quit();
	}
	public static void main(String args[]) throws Exception{
		Links_Practice new_test = new Links_Practice();
		new_test.setup();
		new_test.TaskToPerform();
		new_test.DriverClose();
	
		
		
		 
	}
}
