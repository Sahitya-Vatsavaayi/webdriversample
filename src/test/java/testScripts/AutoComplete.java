package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoComplete {
  @Test
  public void autocompleteDropdown() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/autocomplete/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("as");
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("#ui-id-13")).click();
  }
}
