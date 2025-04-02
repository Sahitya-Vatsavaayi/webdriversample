package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandles {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/browser-windows");
	  String parentwin = driver.getWindowHandle();
	  Thread.sleep(3000);
	  actions.scrollByAmount(100, 1200).perform();
	  System.out.println("parent win  " + parentwin);
	  driver.findElement(By.id("tabButton")).click();
	  System.out.println("page title  "+driver.getTitle());
	  
	  Set<String> wins=driver.getWindowHandles();
	  System.out.println("No of windows " + wins.size());
	  for(String child : wins)
	  {
		  System.out.println("Wind Handles " + child);
		  if(!child.equalsIgnoreCase(parentwin))
		  {
			  driver.switchTo().window(child);
			  Thread.sleep(5000);
			  String h1Tagtext =driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("Text in tab window" + h1Tagtext);
			  
		  }
	  }
	  
	  
	  
	  
  }
}
