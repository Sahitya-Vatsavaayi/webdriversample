package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns {
  @Test
  public void dropdwn() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Select dp = new Select(driver.findElement(By.id("country")));
	  dp.selectByValue("india");
	  dp.selectByIndex(5);
	  dp.selectByVisibleText("China");
	  
	  Select muldp= new Select(driver.findElement(By.id("colors")));
	  if(muldp.isMultiple())
	  {
		  muldp.selectByIndex(1);
		  muldp.selectByValue("red");
		  muldp.selectByVisibleText("Green");
		  List<WebElement> items = muldp.getAllSelectedOptions();
		  System.out.println(items.size());
		  muldp.deselectByValue("green");
	  }
  }
}
