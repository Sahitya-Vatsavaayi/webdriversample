package testScripts2;

import org.testng.annotations.Test;

public class testSampleThree {
	 @Test(groups= "featureOne")
	  public void testOne() {
		  System.out.println("Test31 in samplethree");
	  }
	  @Test(groups= "featureTwo")
	  public void testTwo() {
		  System.out.println("Test32 in samplethree");
	  }
	  @Test(groups= "featureThree")
	  public void testThree() {
		  System.out.println("Test33 in samplethree");
	  }
}
