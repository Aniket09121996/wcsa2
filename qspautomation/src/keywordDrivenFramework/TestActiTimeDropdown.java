package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestActiTimeDropdown extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
       bt.openBrowser();
      Flib flib = new Flib();
	String username = flib.readPropertyFile(PROP_PATH,"username");
	String password = flib.readPropertyFile(PROP_PATH,"password");
	//
	//
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	Thread.sleep(4000);
	driver.findElement(By.id("loginbutton")).click();
	driver.findElement(By.partialLinkText("Settings")).click();
	WebElement dropdown1 = driver.findElement(By.name("firstHierarchyLevelCode"));
	WebDriverCommonLib wb = new WebDriverCommonLib();
	wb.getAllOptionsOfDropdown(dropdown1);
	System.out.println("-------------------------------------------------------------");
	WebElement dropdown2 = driver.findElement(By.name("secondHierarchyLevelCode"));
	wb.getAllOptionsOfDropdown(dropdown2);
	
	
	
	
	}

}
