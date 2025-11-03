package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("bye");
	}
	
	@BeforeTest
	public void prerquisite()
	{
		System.out.println("Will execute first");
	}

}
