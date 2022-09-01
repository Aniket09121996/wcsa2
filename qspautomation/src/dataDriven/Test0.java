package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keywordDrivenFramework.IAutoconstant;



public class Test0 implements IAutoconstant {

	public static void main(String[] args) throws IOException {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./data/config.properties");
	p.load(fis);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(p.getProperty("url"));
	driver.findElement(By.name("username")).sendKeys(p.getProperty("username"));
	driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
