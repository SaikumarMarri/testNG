package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageSearch {
  @Test
  public void JavaSearchTest() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFq"));
		srcBox.sendKeys("Java Tutorial");

  }
}
