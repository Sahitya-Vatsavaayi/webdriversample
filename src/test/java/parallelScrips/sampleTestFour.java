package parallelScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTestFour {
	WebDriver driver;

	  @Test
	  public void testOne() {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test41 in sampleOne" + id);
	  }
	  @Test
		
	  public void testTwo() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test42 in sampleOne" + id);
		  driver=new ChromeDriver();
	}
	  @Test(invocationCount=6, threadPoolSize=3, timeOut=10000)
		
	  public void testThree() {
		  
		  long id=Thread.currentThread().getId();
		  System.out.println("Test43 in sampleOne" + id);
	  }
}
