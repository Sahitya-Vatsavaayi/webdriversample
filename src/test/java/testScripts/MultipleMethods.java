package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleMethods {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://danube-webshop.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
  @Test(alwaysRun=true,dependsOnMethods="storiesSearch")//(priority=3) //(enabled=false)
  public void crimeNovelSearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
	  String strUrl= driver.getCurrentUrl();
	  Assert.assertTrue(strUrl.contains("crime"));
	  
  }
  @Test//(priority=2)
  public void storiesSearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	  String strUrl1= driver.getCurrentUrl();
	  Assert.assertTrue(strUrl1.contains("novel1"));
  }
    @AfterMethod
    public void closewindow()
    {
    	driver.close();
    }
    
   // @Test//(priority=1)
    public void horror() {
  	  driver.findElement(By.xpath("//a[contains(text(),'Horror')]")).click();
  	  String strUrl= driver.getCurrentUrl();
  	  Assert.assertTrue(strUrl.contains("horror"));
    }
  
}
