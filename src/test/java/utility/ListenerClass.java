package utility;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter{
	
	@Override
	public void onTestStart(ITestResult tr) {
		log("Test Method Started....");
	}
	
	@Override
	public void onStart(ITestContext Result) {
		log("About to begin executing Test....");
	}
	
	@Override
	public void onFinish(ITestContext Result) {
		log("Completed executing test....");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		log("Test Method '" + tr.getName() + "' PASSED");

		// This will print the class name in which the method is present
		log(tr.getTestClass());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as 0
		log("Priority of this method is " + tr.getMethod().getPriority());

		System.out.println(".....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		log("Test Method '" + tr.getName() + "' FAILED");
		log("Priority of this method is " + tr.getMethod().getPriority());
		System.out.println(".....");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test Method '" + tr.getName() + "' SKIPPED");
		System.out.println(".....");
	}

	private void log(String methodName) {
		System.out.println(methodName);
	}

	private void log(IClass testClass) {
		System.out.println(testClass);
	}

}
