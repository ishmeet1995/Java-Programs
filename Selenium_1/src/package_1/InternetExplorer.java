package package_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
		
	public static int sum() {
		return(1);
	}
	public static void main(String[] args) { 	
		System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IE_Driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		
		
		WebDriver driver = new InternetExplorerDriver();
		try {Thread.sleep(2000);} catch (Exception e){}
		driver.get("https://google.com");
		try {Thread.sleep(5000);} catch (Exception e){}
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
