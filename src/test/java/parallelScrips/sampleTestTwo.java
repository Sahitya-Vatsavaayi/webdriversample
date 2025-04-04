package parallelScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTestTwo {
	WebDriver driver;

	  @Test
	  public void testOne() {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test21 in sampleOne" + id);
	  }
	  @Test
		 
	  public void testTwo() {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test22 in sampleOne" + id);
		 
	}
	  @Test
		 
	  public void testThree() {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test23 in sampleOne" + id);
	  }
}
