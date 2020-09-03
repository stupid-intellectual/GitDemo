package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test (groups= {"Frijolito"})
	public void Plain()
	
	{
		System.out.println("Amorshin Picioso, Te Extraño!");
	}
	
	@BeforeTest
	public void Prerequesite()
	{
		System.out.println ("This will execute first in the test run for this class.");
		
	}
}
