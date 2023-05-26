package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.SeleniumManager;

public class ActionDemo {
	WebDriver driver;
@Test	
public void run() {
		
		SeleniumManager manager= new SeleniumManager();
		driver=manager.launchBrowser("chrome");
		//driver.get("https://leafground.com/drag.xhtml");
		driver.get("https://leafground.com/alert.xhtml");
		
		Actions action= new Actions(driver);
		
//		WebElement drag= driver.findElement(By.id("form:drag_content"));
//		WebElement drop= driver.findElement(By.id("form:drop_content"));
//		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement showbutton= driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		action.click(showbutton).build().perform();
		//action.clickAndHold(showbutton).build().perform();
		//action.contextClick(showbutton).build().perform();
		//action.moveToElement(showbutton).build().perform();	
		//action.moveToElement(showbutton).click().build().perform();
		//action.doubleClick(showbutton).build().perform();
		//action.moveToElement(showbutton).contextClick().build().perform();
		//action.moveByOffset(70, 600).build().perform();
		}
}
