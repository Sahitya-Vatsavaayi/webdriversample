package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTest {
	String expItem= "nexus 6";
  @Test
  public void DemoBlaze() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/");
	  Thread.sleep(5000);
	 List <WebElement>  prodlist= driver.findElements(By.cssSelector("h4.card-title"));
	for(WebElement item:prodlist)
	{
		System.out.println(item);
		if(item.getText().equalsIgnoreCase(expItem))
		{
			item.click();
			break;
		}
	}
	
  }
}
