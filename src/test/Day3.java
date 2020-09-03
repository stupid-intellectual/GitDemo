package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Parameters({"URL","APIKey/Username"})
	@Test
	public void WebloginCarLogin(String urlName, String key)
	{
		 // Selenium automation code goes here 
		System.out.println("Web Login COmplete!");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	@Test
	public void MobileCarLogin()
	{
		//Appium automation code goes here 
		System.out.println("Mobile Login COmplete!");
	}
	
	@Test (groups= {"Frijolito"})
	public void MobileCarSignin()
	{
		//Appium automation code goes here 
		System.out.println("Mobile Sign-in COmplete!");
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("Before Suite!");
	}
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("Before method!");
	}
	
	
	@Test(dataProvider="getData")
	public void MobileCarLogout(String username, String password)
	{
		//Appium automation code goes here 
		System.out.println("Mobile Log-out COmplete!");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APICarLoan()
	{
		//Rest API automation code goes here 
		System.out.println("Rest API Login COmplete!");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination : username and password - good credit history
		//2nd combination : username and password - no credit history 
		// 3rd combination: username and password - fraudulent credit history
		Object [] [] data = new Object [3][2];
		//Columns in the rows are nothing but values for that particular combination
		data [0][0] = "stupidintellectual";
		data [0][1] = "lalilulelo";
		data [1][0] = "frijolito24";
		data [1][1] = "amorshinpicioso";
		data [2][0] = "sergeantpepper";
		data [2][1] = "lonelyheartsclubband";	
		return data;
	}
}
