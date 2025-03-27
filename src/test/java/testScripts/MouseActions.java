package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
  @Test
  public void mouseAct() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Thread.sleep(5000);
	  Actions act=new Actions(driver);
	  WebElement txtfield = driver.findElement(By.id("field2"));
	  act.scrollToElement(txtfield).perform();
	  Thread.sleep(3000);
	 WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
	 act.moveToElement(btn).perform();
	 Thread.sleep(3000);
	 WebElement item2 = driver.findElement(By.linkText("Laptops"));
	 act.click(item2).perform();
	 Thread.sleep(3000);
	 WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	 act.doubleClick(doubleclick).perform();
	 Thread.sleep(2000);
	 act.contextClick(txtfield).perform();
	
  }
}
