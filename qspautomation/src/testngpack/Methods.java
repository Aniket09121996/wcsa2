package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Methods {
  @Test(enabled =false)
  public void n() {
	  Reporter.log("method n",true);
  }
  @Test(description = "sample method")
  public void g() {
	  Reporter.log("method g",true);
  }
  @Test(priority = 2)
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
  @Test(priority = 4)
  public void x() {
	  Reporter.log("method x",true);
  }
  @Test(priority = 5)
  public void z() {
	  Reporter.log("method z",true);
  }
  @Test
  public void v() {
	  Reporter.log("method v",true);
  }
  @Test(priority = 6)
  public void d() {
	  Reporter.log("method d",true);
  }
}
