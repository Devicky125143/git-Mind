package GroupExecution;

import org.testng.annotations.Test;

public class grouphandling {
  @Test(priority = 1,groups = {"abc"})
  public void Tc1() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test(priority = 2,groups = {"abc"})
  public void Tc2() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test(priority = 4,groups = {"abc"})
  public void Tc3() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test(priority = 3,groups = {"vicky"})
  public void Tc4() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test(priority = 5,groups = {"vicky"})
  public void Tc5() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test(priority = 6,groups = {"vicky"})
  public void Tc6() {
	  System.out.println("i am Tc1 method ");
  }
  
  @Test
  public void Tc7() {
	  System.out.println("i am Tc1 method ");
  }
}
