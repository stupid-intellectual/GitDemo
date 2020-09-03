package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void LastExecution()
	
	{
		System.out.println("This will print out last");
	}
	
	@Test
	public void Demo()
	
	{
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods= {"Demo"})
	public void SecondTest()
	{
		System.out.println("Bye Bye Guys!");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("After suite!");
	}
	
}
