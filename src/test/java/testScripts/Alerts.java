package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Alerts {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  SoftAssert softAssert = new SoftAssert();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	 WebElement alertbtn= driver.findElement(By.id("alertBtn"));
	 alertbtn.click();
	  driver.switchTo().alert().accept(); 
	  driver.findElement(By.id("confirmBtn")).click();
	  driver.switchTo().alert().dismiss();
	  driver.findElement(By.id("promptBtn")).click();
	  driver.switchTo().alert().accept();
	 WebElement promt= driver.findElement(By.xpath("//p[text()='Hello Harry Potter! How are you today?']"));
      System.out.println(promt.getText());
      softAssert.assertEquals(promt.getText(), "Hello Harry Potter! How are you today?");
      softAssert.assertAll();
     
	  
  }
}
