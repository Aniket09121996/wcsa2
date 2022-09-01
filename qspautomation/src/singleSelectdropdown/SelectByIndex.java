package singleSelectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Windows%2010/OneDrive/Desktop/htmlFiles/singleselectdropdown.html");
         WebElement ssdropdown = driver.findElement(By.id("menu"));
         Select sel = new Select(ssdropdown);
         sel.selectByIndex(6);
	}

}
