package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.SeleniumManager; 
public class JavaScriptExecutor {
	WebDriver driver;
	@Test	
	public void run() {
			
			SeleniumManager manager= new SeleniumManager();
			driver=manager.launchBrowser("edge");
			driver.get("https://the-internet.herokuapp.com/");
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
			System.out.println(js.executeScript("return document.title;").toString());
			System.out.println(js.executeScript("return document.URL;").toString());
			
         WebElement testing= driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]"));
         js.executeScript("window.scrollBy(0,550)");
         js.executeScript("window.scrollBy(0,-550)");
         //js.executeScript("arguments[0].click();",testing );
         
         WebElement elemental= driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]"));
         js.executeScript("arguments[0].scrollIntoView(true);", elemental);
}
}