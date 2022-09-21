package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends baseClass{
   private static final Logger logger = LogManager.getLogger(LoginPage.class);
   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
   public void URL1() throws Throwable{
      baseClass bs = new baseClass();
      bs.URL1();
   }

   public void LoginCredentials() throws Throwable{
      WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
      jsExecutor.executeScript("arguments[0].style.background='yellow'", username);
      username.sendKeys("Admin");
      logger.info("User enter username");
      WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
      jsExecutor.executeScript("arguments[0].style.border='2px solid red'", password);
      password.sendKeys("admin123");
      logger.info("User enter password");
      WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
      jsExecutor.executeScript("arguments[0].style.border='2px solid red'", submit);
      submit.click();
      logger.info("User clicks on login button");

   }



   }

