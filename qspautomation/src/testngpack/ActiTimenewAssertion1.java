package testngpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import keywordDrivenFramework.IAutoconstant;

import org.testng.annotations.BeforeMethod;

//import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ActiTimenewAssertion1 implements IAutoconstant {
  WebDriver driver;
	
  @BeforeMethod
  public void setUp() {
	  System.setProperty(CHROME_KEY, CHROME_VALUE);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-a6tbu7j/login.do");
  }
  @Test
  public void f() {
	  Reporter.log("verify the username textbox displays or not",true);
	  SoftAssert sa = new SoftAssert();
	  boolean statusOfUsername = driver.findElement(By.name("username")).isDisplayed();
	  sa.assertEquals(statusOfUsername, true);
	  Reporter.log(" username textbox is Displayed ",true);
	  sa.assertAll();
	  Reporter.log("verify the password text box display with hard Assert");
	  boolean StatusOfPassword = driver.findElement(By.name("pwd")).isDisplayed();
	  Assert.assertEquals(StatusOfPassword,true);
	  Reporter.log(" password text box displayed");
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
