package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1Test {
	@Test (groups="smoke")
	public void Mangotest()
	{
		Reporter.log("Hello",true);
		Reporter.log("Mango",true);
	}

}
