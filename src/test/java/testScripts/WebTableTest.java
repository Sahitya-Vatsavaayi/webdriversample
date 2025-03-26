package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	/* List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
	 System.out.println("Details of the book");
	 for(WebElement item:items)
	 {
		 System.out.println(item.getText());
	 }*/
	  WebElement Sah= driver.findElement(By.xpath("//td[contains(text(),'2000')]"));
	  System.out.println(Sah.getText());
	 // highlightElement(driver,Sah);
	  
	  
  }

private void highlightElement(WebDriver driver, WebElement sah) {
	// TODO Auto-generated method stub
	
}
}
