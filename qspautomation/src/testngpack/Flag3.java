package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	@Test(priority = 0)
	  public void f() {
		  Reporter.log("method f",true);
	  }
	  @Test(priority = -1)
	  public void m() {
		  Reporter.log("method m",true);
	  }
	  @Test(priority = 2)
	  public void s() {
		  int i=2;
		  int res=i;
		  System.out.println(res);
		  Reporter.log("method s",true);
	  }
}
