package test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Day4 {

	@Test(groups= {"Frijolito"})
	public void WebloginHomeLoan()
	{
		 // Selenium automation code goes here 
		System.out.println("Web Login COmplete!");
	}
	
	@Test
	public void MobileLoginHome()
	{
		//Appium automation code goes here 
		System.out.println("Mobile Login COmplete!");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation code goes here 
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream ( );
		
		System.out.println("Rest API Login COmplete!");
	}
}
