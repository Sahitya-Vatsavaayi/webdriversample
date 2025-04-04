package parallelScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class sampleTestThree {
	WebDriver driver;

	  @Test
	  public void testOne() {
		  driver=new EdgeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test31 in sampleOne" + id);
	  }
	  @Test
		 
	  public void testTwo() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test32 in sampleOne" + id);
		  driver=new ChromeDriver();
	}
	  @Test
		 
	  public void testThree() {
		  driver=new ChromeDriver();
		  long id=Thread.currentThread().getId();
		  System.out.println("Test33 in sampleOne" + id);
	  }
}
