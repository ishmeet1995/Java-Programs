package package_1;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class Fluent_wait_practice {
	static WebDriver driver = null;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void test_case() throws Exception{
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Testing" + Keys.ENTER);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS);
		
		WebElement element1 = wait.until(new Function<WebDriver , WebElement>(){

			@Override
			public WebElement apply(WebDriver arg0) {
				// TODO Auto-generated method 
				return(driver.findElement(By.partialLinkText("Software testing - Wikipedia")));
			}
			
		}
				
				);
				
		element1.click();
	}
	
	public static void main(String[] args) throws Exception {
		
		Fluent_wait_practice obj1 = new Fluent_wait_practice() ;
		obj1.setup();
		obj1.test_case();
		driver.close();
		driver.quit();

	}

}
