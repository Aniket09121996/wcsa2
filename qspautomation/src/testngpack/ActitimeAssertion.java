package testngpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ActitimeAssertion {
	WebDriver driver;
	 @BeforeMethod
	  public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.stealmylogin.com/demo.html");
	  }
  @Test
  public void actiTimeAssertion() {
	  Reporter.log("verify the title of webpage",true);
	  //Soft Assert-verification
	  SoftAssert sa = new SoftAssert();
	  String titleOfwebpage = driver.getTitle();
	  sa.assertEquals(titleOfwebpage,"StealMyLogin.com Demo" );
	  Reporter.log("verify the title of webpage is verified",true);
	  Reporter.log("--------------------------------",true);
	  //--------------------------------------------
	 // Hard Assert -Verification
	  Reporter.log("verify the username textbox is display",true);
	  boolean statusOfusername = driver.findElement(By.name("username")).isDisplayed();
	  Assert.assertEquals(statusOfusername, true);
	  Reporter.log("verified and displayed the username textbox",true);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	//--------------------------------------------
	  Reporter.log("--------------------------------",true);
	  Reporter.log(" verify the password textbox is display",true);
	  boolean statusOfpassword = driver.findElement(By.name("password")).isDisplayed();
	  Assert.assertEquals(statusOfpassword, true);
	  Reporter.log("verified and password textbox is displayedddd",true);
	  driver.findElement(By.name("password")).sendKeys("manager");
	  Reporter.log("--------------------------------",true);
	 //--------------------------------------------
	  Reporter.log("verify the login button is diplay ",true);
	  boolean statusOflogin = driver.findElement(By.xpath("/html/body/form/input[3]")).isDisplayed();
		 Assert.assertEquals(statusOflogin, true);
	  Reporter.log("verified the login button is displayed",true);
	  driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	  Reporter.log("--------------------------------",true);
  }
 

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
