package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Windows%2010/OneDrive/Desktop/htmlFiles/multiselectdropdown.html");
		driver.manage().window().maximize();
		WebElement mulSelectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(mulSelectdd);
		for(int i=4;i<=8;i++) {
			sel.selectByIndex(i);
			Thread.sleep(4000);
		}

	}

}
