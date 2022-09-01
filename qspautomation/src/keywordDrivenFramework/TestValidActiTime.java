package keywordDrivenFramework;


import java.io.IOException;
import org.openqa.selenium.By;

public class TestValidActiTime extends BaseTest implements IAutoconstant {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib=new Flib();
		String username = flib.readPropertyFile(PROP_PATH,"username");
		String password = flib.readPropertyFile(PROP_PATH,"password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		bt.closeBrowser();
		
	}

}
