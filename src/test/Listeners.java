package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Use the ITest liestener interface to use listeners in Selenium 
public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println ("Exitooo!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// screenshot code might go here
		// response if API failed
		System.out.println ("If at first you don't succeed, give 'em hell!" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
