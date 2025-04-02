package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class JavaScript {
  @Test
  public void JSexecutor() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  String strTitle= (String) js.executeScript("return document.title");
	  System.out.println(strTitle);
	  WebElement inpName =(WebElement) js.executeScript("return document.getElementById('name')");
	  inpName.sendKeys("Test");
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5));//ignoring(NoSuchElementException.class);
	  js.executeScript("window.scrollBy(100,document.body.scrollHeight)");
	  
  }
}
