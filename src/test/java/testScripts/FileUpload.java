package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
  @Test
  public void fileuploadtest() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	 WebElement addfile = driver.findElement(By.xpath("//input[@type='file']"));
	  String strpath = System.getProperty("user.dir")+ "//screenshots//"+ "1743068516478.png";
	  addfile.sendKeys(strpath);
	  driver.findElement(By.xpath("//span[text()='Start upload']")).click();
	  
  }
}
