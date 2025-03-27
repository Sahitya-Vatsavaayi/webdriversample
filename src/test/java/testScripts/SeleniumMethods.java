package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethods {
  @Test
  public void Selmethods() throws InterruptedException, IOException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  Thread.sleep(5000);
	  TakesScreenshot screen =(TakesScreenshot)driver;
	  File src = screen.getScreenshotAs(OutputType.FILE);
	  String path = System.getProperty("user.dir")+ "/screenshots/" + System.currentTimeMillis() + ".png";
	  FileUtils.copyFile(src,  new File(path));
	  driver.findElement(By.id("searchBar")).sendKeys("text");
	  Thread.sleep(5000);
	  WebElement closebtn= driver.findElement(By.xpath("//a[@title='Clear text']"));
	  if(closebtn.isDisplayed())
	  {
		  closebtn.click();
	  }
	  
	  
  }
}
