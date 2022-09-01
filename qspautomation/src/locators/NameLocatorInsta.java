package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorInsta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com");
 Thread.sleep(4000);
 driver.findElement(By.name("username")).sendKeys("sdffjhf");
 driver.findElement(By.name("password")).sendKeys("jkhfkdh");
 driver.findElement(By.xpath("//div[.='Log In' and @class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ' ]")).click();
 
 
 
	}

}
