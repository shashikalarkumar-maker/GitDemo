package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class3 {
	
	@Test
	public void webloginCarLoan()
	{
		System.out.println("weblogin car");
	}
	
	@Test(timeOut=4000)
	public void mobileLoinCarLoan()
	{
		System.out.println("mobile login car1");
	}
	
	@Test(dependsOnMethods= {"mobileSignOutCarLoan"})
	public void mobileSignInCarLoan()
	{
		System.out.println("mobile login car2");
	}
	@Test(groups= {"smoke"})
	public void mobileSignOutCarLoan()
	{
		System.out.println("mobile login car3");
	}
	
	@BeforeSuite
	public void suiteexa()
	{
		System.out.println("I am suite starting");
	}
	
	
	
	@Test(dataProvider="getdata")
	public void loginApiCarLoan(String un, String pass)
	{
		System.out.println("login api car");
		System.out.println("User name is "+un+"password is : " +pass);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st conmbination -un pass
		//2nd conmbination -un pass
		//3rd conmbination -un pass
		
		//Create multi dimentional arrayof object
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetUsername";
		data[0][1]="firstpass";
		//2nd set
		data[1][0]="SecondsetUsername";
		data[1][1]="Secondpass";
		//3rd set
		data[2][0]="ThirdsetUsername";
		data[2][1]="Thirdpass";
		return data;
	}

}
