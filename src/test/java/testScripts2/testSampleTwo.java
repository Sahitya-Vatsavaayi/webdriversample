package testScripts2;

import org.testng.annotations.Test;

public class testSampleTwo {
  
	  @Test(groups= "featureOne")
	  public void testOne() {
		  System.out.println("Test21 in sampletwo");
	  }
	  @Test(groups= "featureTwo")
	  public void testTwo() {
		  System.out.println("Test22 in sampletwo");
	  }
	  @Test(groups= "featureThree")
	  public void testThree() {
		  System.out.println("Test23 in sampletwo");
	  }
  }

