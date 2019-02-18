package package_1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce_dorpdown_test {
	WebElement ele = null, desired_job = null, desired_emp_no = null;
	WebDriver driver = new ChromeDriver();
	String Job = "Sales Manager";
	String EMP = "1000";
	boolean job_found = false;
	
	public void setup() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales.jsp?d=70130000000EqoP");
		driver.manage().window().maximize();
	}
	
	public void operation() {
		driver.findElement(By.xpath("//input[@id = 'UserFirstName']")).sendKeys("Ishmeet");
		driver.findElement(By.xpath("//input[@id = 'UserLastName']")).sendKeys("Bindra");
		this.get_job();		
		driver.findElement(By.xpath("//input[@id = 'UserPhone']")).sendKeys("9971440015");
		driver.findElement(By.xpath("//input[@id = 'UserEmail']")).sendKeys("ibindra1995@gmail.com");
		driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("DXC");
		this.get_employee_no();
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']")).click();
		
	}
	
	public void get_employee_no() {
		driver.findElement(By.xpath("//span[contains(text(),'Employees')]")).click();
		ele = null;
		ele = driver.findElement(By.xpath("//div[@class = 'live-chat-modal']//following::ul[2]"));
		String a = ele.getAttribute("style");
		System.out.println(a);
		List<WebElement> elements = ele.findElements(By.tagName("li"));
		Iterator<WebElement> itr = elements.iterator();
		while(itr.hasNext()) {
			desired_emp_no =  itr.next().findElement(By.tagName("a"));
			if(desired_emp_no.getText().contains(EMP)) {
				break;
			}
		}
		System.out.println("found valid emoloyee number");
		desired_emp_no.click();
		
		
	}
	
	public void get_job() {
		driver.findElement(By.xpath("//span[contains(text(),'Job title')]")).click();
		ele = null;
		ele = driver.findElement(By.xpath("//div[@class = 'live-chat-modal']//following::ul[1]"));
		List<WebElement> elements = ele.findElements(By.tagName("li"));
		Iterator<WebElement> itr = elements.iterator();
		while(itr.hasNext()) {
			desired_job =  itr.next().findElement(By.tagName("a"));
			if(desired_job.getText().equalsIgnoreCase(Job)){
				job_found = true;
				break;
			}
		}
		if(job_found) {
			System.out.println("found valid job title");
			desired_job.click();
		}
		else
			System.out.println("Job Type invalid");
		
	}
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		Salesforce_dorpdown_test obj1 = new Salesforce_dorpdown_test();
		obj1.setup();
		obj1.operation();
		
		
	}
}
