package internetExplorer;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;

import com.ibm.icu.util.RangeValueIterator.Element;

public class InternetExplorer_test1 {
		
	public static int sum() {
		return(1);
	}
	public static void main(String[] args)throws Exception { 	
		System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IE_Driver\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		options.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//InternetExplorerOptions ieoptions = new InternetExplorerOptions();
		//ieoptions.requireWindowFocus();
		
		driver.get("https://google.com");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@name = 'q']")); //for finding an element
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).click().sendKeys(ele1,"Hello").build().perform();
	
	}

}
