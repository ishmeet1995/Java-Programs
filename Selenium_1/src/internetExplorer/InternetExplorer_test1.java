package internetExplorer;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorer_test1 {
		
	public static int sum() {
		return(1);
	}
	public static void main(String[] args)throws Exception { 	
		System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IE_Driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		InternetExplorerOptions ieoptions = new InternetExplorerOptions();
		ieoptions.requireWindowFocus();
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Testing"); //for finding an element
	
	}

}
