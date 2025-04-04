package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MultipleMethods {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	@BeforeTest
	public void setupExtent()
	{
		extentReports =new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html");
		extentReports.attachReporter(spark);
	}
	@Parameters("browser")
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://danube-webshop.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
  @Test//(alwaysRun=true,dependsOnMethods="storiesSearch")//(priority=3) //(enabled=false)
  public void crimeNovelSearch() {
	  extentReports.createTest("crime thrillers test");
	  driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
	  String strUrl= driver.getCurrentUrl();
	  Assert.assertTrue(strUrl.contains("crime"));
	  
  }
  @Test//(priority=2)
  public void storiesSearch() {
	  extentReports.createTest("novels stories test");
	  driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	  String strUrl1= driver.getCurrentUrl();
	  Assert.assertTrue(strUrl1.contains("novel1"));
  }
    @AfterMethod
    public void closewindow()
    {
    	driver.close();
    }
    @AfterTest
    public void finishExtent()
    {
    	extentReports.flush();
    }
    
   // @Test//(priority=1)
    public void horror() {
  	  driver.findElement(By.xpath("//a[contains(text(),'Horror')]")).click();
  	  String strUrl= driver.getCurrentUrl();
  	  Assert.assertTrue(strUrl.contains("horror"));
    }
  
}
