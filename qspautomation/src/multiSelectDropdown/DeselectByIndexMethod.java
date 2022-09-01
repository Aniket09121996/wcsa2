package multiSelectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import keywordDrivenFramework.IAutoconstant;

public class DeselectByIndexMethod implements IAutoconstant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Windows%2010/OneDrive/Desktop/htmlFiles/multiselectdropdown.html");
		    WebElement sel = driver.findElement(By.id("menu"));
		    Select mulseldd = new Select(sel);
      mulseldd.selectByIndex(6);
      Thread.sleep(2000);
      mulseldd.deselectByIndex(6);
      Thread.sleep(2000);
      driver.quit();
	}

}
