package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorTest {
  @Test
  public void RelativeLocator() {
	  WebDriver driver = new ChromeDriver();
	//  driver.get("https://automationbookstore.dev/");
	//  String str= driver.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getDomAttribute("id");
	 // System.out.println(str);
	  driver.manage().window().maximize();
	  //checkboxes
	 /* driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	  boolean checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected();
	  if(checkbox2)
	  {
		  driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
	  } */
	  //radiobuttons
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.findElement(By.cssSelector("#male")).click();
	  driver.findElement(By.cssSelector("#monday")).click();
	  driver.findElement(By.cssSelector("#tuesday")).click();
	   
  }


}
