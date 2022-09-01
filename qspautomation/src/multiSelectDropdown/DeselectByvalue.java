package multiSelectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByvalue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Windows%2010/OneDrive/Desktop/htmlFiles/multiselectdropdown.html");
		WebElement sel = driver.findElement(By.id("menu"));
		Select mulseldd = new Select(sel);
		mulseldd.selectByValue("v7");
		Thread.sleep(4000);
		mulseldd.deselectByValue("v7");
		
		

	}

}
