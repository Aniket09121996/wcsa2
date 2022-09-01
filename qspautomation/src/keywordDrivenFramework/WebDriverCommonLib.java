package keywordDrivenFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest {
	public void getAllOptionsOfDropdown(WebElement webelement) {
		Select sel = new Select(webelement);   
      List<WebElement> allop = sel.getOptions();
      for (WebElement we : allop) {
    	  String option = we.getText();
		System.out.println(option);
	}
	}
public void rightClick(WebElement target) {
	Actions act = new Actions(driver);
     act.contextClick(target).perform();
}
public void doubleClick(WebElement target) {
	Actions act = new Actions(driver);
     act.doubleClick(target).perform();
}
public void mouseHover(WebElement target) {
	Actions act = new Actions(driver);
    act.moveToElement(target).perform();
}
public void copyText() throws AWTException {
	Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_C);
     robot.keyRelease(KeyEvent.VK_C);
     robot.keyRelease(KeyEvent.VK_CONTROL);
}
public void pasteText() throws AWTException {
	Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
}
    public void takeScreenshot(String foldername,String Screenshotname) throws IOException {
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dest = new File("./"+foldername+"/"+Screenshotname+".jpg");
    	Files.copy(src, dest);
    }
    public static void scrollUp(int x,int y) {
    	 JavascriptExecutor jse=(JavascriptExecutor) driver;
    	 jse.executeScript("window.scrollBy("+x, y+");");
    }
}
