package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsMethods1 {
  @Test
  public void test1() {
	  Reporter.log("inside method test1",true);
  }
  @Test
  public void test2() {
	  Reporter.log("inside method test2",true);
  }
  @BeforeMethod
  public void method1() {
	  Reporter.log("inside method before method",true);
  }

  @AfterMethod
  public void method2() {
	  Reporter.log("inside method after method",true);
  }

  @BeforeClass
  public void method3() {
	  Reporter.log("inside method beforeclass",true);
  }

  @AfterClass
  public void method4() {
	  Reporter.log("inside method afterclass",true);
  }

  @BeforeTest
  public void method5() {
	  Reporter.log("inside method before test",true);
	  
  }

  @AfterTest
  public void method6() {
	  Reporter.log("inside method aftertest",true);
  }

  @BeforeSuite
  public void method7() {
	  Reporter.log("inside method beforeSuite",true);
  }

  @AfterSuite
  public void method8() {
	  Reporter.log("inside method aftersuite",true);
  }
  

}
