package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups="smoke")
	public void Hellotest()
	{
		System.out.println("hello");
		Reporter.log("test");
	}

}
