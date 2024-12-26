package TEST;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testmylistener {
   
	@Test
	public void tc1() {
		System.out.println("test case 1 ");
		int a=10;
		Assert.assertEquals(a,20);
	}
	@Test(dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("test case 2 ");
		int a=30;
		Assert.assertEquals(a,30);
	}

	@Test()
	public void tc3() {
		System.out.println("test case 3 ");
		int a=20;
		Assert.assertEquals(a,20);
	}
	@Test(successPercentage = 10)
	public void tc4() {
		System.out.println("test case 4 ");
		int b=10;
		Assert.assertEquals(b,10);
	}
	@Test
	public void tc5() {
		System.out.println("test case 5");
	
	}
	@Test
	public void tc6() {
		System.out.println("test case 6");
	}
}
