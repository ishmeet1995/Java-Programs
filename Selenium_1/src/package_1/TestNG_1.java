package package_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {

	@BeforeTest
	public void b_test() {
		System.out.println("Executing the before loop");
	}
	
	@Test
	public void test_1() {
		System.out.println("Inside test1");
	}
	
	@AfterTest
	public void a_test() {
		System.out.println("After Test");
	}
	
}
