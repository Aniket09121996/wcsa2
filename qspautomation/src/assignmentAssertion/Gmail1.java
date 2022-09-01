package assignmentAssertion;

import org.testng.annotations.Test;

import keywordDrivenFramework.IAutoconstant;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Gmail1 implements IAutoconstant {
	WebDriver driver;
  @Test
  public void verifyThePrimary() throws AWTException, InterruptedException {
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[@class='item active']")).click();
	 boolean sel = driver.findElement(By.xpath("//td[@id='userRightCell_2_1']")).isSelected();
	 Reporter.log(sel+"",true);
	 Assert.assertEquals(sel, true);
	 Reporter.log("verify that the primary section is opened or not",true);
     	  
  }
  @BeforeMethod
  public void setUp() throws InterruptedException {
	  System.setProperty(GECKO_KEY, GECKO_VALUE);
     driver=new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("http://desktop-a6tbu7j/login.do");
   Thread.sleep(5000);
  }

@AfterMethod
  public void tearDown() {
  driver.quit();
  }

}
