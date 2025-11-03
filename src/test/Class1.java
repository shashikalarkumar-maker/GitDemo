package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Will execute at last");
		System.out.println("adding line to check git commands");
		System.out.println("adding line to check git commands 2");
		System.out.println("adding line to check git commands 3");
	}

@Parameters({"URL"})
	@Test
	public void demo(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
	}
	@Test(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("hello demo2");
	}

	@AfterSuite
	public void suiteexaa()
	{
		System.out.println("I am suite ending");
	}
}
