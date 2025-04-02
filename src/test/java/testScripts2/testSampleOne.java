package testScripts2;

import org.testng.annotations.Test;

public class testSampleOne {
  @Test(groups= "featureOne")
  public void testOne() {
	  System.out.println("Test11 in sampleone");
  }
  @Test(groups= "featureTwo")
  public void testTwo() {
	  System.out.println("Test12 in sampleone");
  }
  @Test(groups= "featureThree")
  public void testThree() {
	  System.out.println("Test13 in sampleone");
  }
}
