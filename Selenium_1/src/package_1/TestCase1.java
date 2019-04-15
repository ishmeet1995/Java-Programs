package package_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase1 {

	public static void main(String[] args) { 	
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://google.com");
		try {Thread.sleep(2000);} catch (Exception e){}
		driver.findElement(By.name("q")).sendKeys("Testing"); //for finding an element
		try {Thread.sleep(2000);} catch (Exception e){}
		driver.findElement(By.name("btnK")).click();
		try {Thread.sleep(2000);} catch (Exception e){}
		driver.findElement(By.partialLinkText("Software testing - Wikipedia")).click();
		try {Thread.sleep(2000);} catch (Exception e){}
		System.out.println(driver.findElement(By.id("mw-content-text")).getText());
		driver.close();
	}

}