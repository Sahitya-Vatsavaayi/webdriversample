package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	Properties prop;
	@BeforeMethod
	public void setup() throws IOException {
		prop=new Properties();
		String path = System.getProperty("user.dir") + "//src//test//resources//ConfigFiles//config.properties";
		FileInputStream fin = new FileInputStream(path);
		prop.load(fin);
		String strBrowser =prop.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
  @Test
  public void validLogin() {
	  
	  driver= new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  WebElement sah= driver.findElement(By.name("password"));
	  sah.sendKeys("SuperSecretPassword!");
	 
	  //sah.sendKeys(Keys.ENTER);
	   driver.findElement(By.className("radius")).submit();
	   boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isValidUser);
  }
}
