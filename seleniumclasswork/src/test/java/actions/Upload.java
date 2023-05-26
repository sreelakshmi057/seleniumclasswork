package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumManager;

public class Upload {
	WebDriver driver;
	@Test	
	public void run() throws InterruptedException, AWTException {
			
			SeleniumManager manager= new SeleniumManager();
			driver=manager.launchBrowser("gecko");	
			driver.get("http://my.monsterindia.com/create_account.html");	
			Thread.sleep(2000);
			
			WebElement uploadBtn = driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span"));
			uploadBtn.click();
		
			Robot robot = new Robot(); 
			
			 String path = "C:\\Users\\HP\\Desktop\\Note.docx";
			 
		       StringSelection stringSelection = new StringSelection(path);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection); 
		       
		       robot.keyPress(KeyEvent.VK_CONTROL);
		       robot.keyPress(KeyEvent.VK_V);
		       robot.keyRelease(KeyEvent.VK_V);
		       robot.keyRelease(KeyEvent.VK_CONTROL);
		       
		       robot.keyPress(KeyEvent.VK_ENTER);

		       robot.keyRelease(KeyEvent.VK_ENTER);
		      
}
}