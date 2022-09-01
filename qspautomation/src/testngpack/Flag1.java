package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description=" method m1")
  public void m1() {
	  Reporter.log("inside method m1",true);
	  
  }
}
