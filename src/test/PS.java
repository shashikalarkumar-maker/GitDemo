package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	
	@BeforeMethod
	public void beforeRun()
	{
	System.out.println("Run me first");
	}
	
	
	public void doThis()
	
	{
		System.out.println("Do this method ");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("After te run");
	}
	

}
