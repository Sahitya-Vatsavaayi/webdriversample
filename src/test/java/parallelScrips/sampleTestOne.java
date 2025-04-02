package parallelScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTestOne {
	WebDriver driver;

  @Test
  public void testOne() {
	  long id=Thread.currentThread().getId();
	  System.out.println("Test11 in sampleOne" + id);
  }
  public void testTwo() {
	  long id=Thread.currentThread().getId();
	  System.out.println("Test12 in sampleOne" + id);
	  driver=new ChromeDriver();
}
}
