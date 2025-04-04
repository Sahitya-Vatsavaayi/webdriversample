package parallelScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTestOne {
	WebDriver driver;

  @Test
  public void testOne() {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Test11 in sampleOne" + id);
  }
  @Test
	 
  public void testTwo() {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Test12 in sampleOne" + id);
	  driver=new ChromeDriver();
}
  @Test
	 
  public void testThree() {
	  driver=new ChromeDriver();
	  long id=Thread.currentThread().getId();
	  System.out.println("Test13 in sampleOne" + id);
  }
}
