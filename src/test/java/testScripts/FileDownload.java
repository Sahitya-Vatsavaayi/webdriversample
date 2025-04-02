package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDownload {
  @Test
  public void filedownloads() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/downloads/");
	  Actions act=new Actions(driver);
	  Thread.sleep(5000);
	  act.scrollByAmount(100, 900).perform();
	  driver.findElement(By.xpath("//a[text()='4.30.0']")).click();
  }
}
