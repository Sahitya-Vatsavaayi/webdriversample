package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOM {
  @Test
  public void DOM() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/shadowdom");
	WebElement host=  driver.findElement(By.xpath("(//my-paragraph)[1]"));
	  SearchContext context= host.getShadowRoot();
	  WebElement txt = context.findElement(By.cssSelector("slot[name='my-text']"));
	  System.out.println(txt.getText());
	  
	WebElement txt2=  driver.findElement(By.xpath("//span[contains(text(),'have some different')]"));
	System.out.println(txt2.getText());
	  
	  
	  
  }
}
