package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {
  @Test
  public void seleniumSearch() {
	  ChromeOptions options =new ChromeOptions();
	  //options.setBrowserVersion("120");
	  WebDriver driver = new ChromeDriver(options);
  driver.get("https://the-internet.herokuapp.com/login");
	 // WebElement username = driver.findElement(By.id("username"));
    /* WebElement username = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
	  username.sendKeys("tomsmith");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("SuperSecretPassword!");
	//  WebElement loginbutton = driver.findElement(By.className("radius"));
	 //  loginbutton.click();
	  // driver.findElement(By.tagName("button")).click();
	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	/* System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 driver.navigate().back();
	 driver.findElement(By.linkText("Elemental Selenium")).click();
	 driver.findElement(By.partialLinkText("Elemental")).click();
	 //driver.quit();*/
	  //driver.get("https://accounts.lambdatest.com/register");
	//  driver.findElement(By.xpath("//form[@class='form reg-custom']//input[@id='email']")).sendKeys("sahi@gmail.com");
  driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
  driver.findElement(By.cssSelector("input[name=password]")).sendKeys("SuperSecretPassword!");
  driver.findElement(By.cssSelector(".radius")).click();
  driver.getTitle();	  
  driver.quit();
  }
  
}
