 package LSTENERS;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class MyListener implements  ITestListener {
	 @Override
	public void onStart(ITestContext contextstart) {
		System.out.println("Test started:  "+"="+contextstart.getName());
	}
	 @Override
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test success:  "+"="+result.getName());
		  }
   @Override
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("Test failure : "+"= "+result.getName());
		  }

   @Override
   public  void onTestSkipped(ITestResult result) {
	    System.out.println("Test skipped : "+"="+result.getName());
	  }
   @Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	   System.out.println("Test fail and success: "+"="+result.getName());
	  }
   @Override
   public void onFinish(ITestContext context) {
	   System.out.println("test finish : "+"="+context.getName());
}
}