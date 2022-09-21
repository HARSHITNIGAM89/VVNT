package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ViewSystemUsers {

    WebDriver driver;
    private By qualification=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i");
    private By skill = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a");

    public ViewSystemUsers(WebDriver driver) {
        this.driver = driver;
    }

    public void setQualification() {
//        WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
//        //Creating object of an Actions class
//        Actions action = new Actions(driver);
//        //Performing the mouse hover action on the target element.
//        action.moveToElement(ele).perform();
       driver.findElement(qualification).click();
    }

    public void setskills() {
//        WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSkills\"]"));
//        //Creating object of an actions class
//        Actions action = new Actions(driver);
//        //Performing the mouse hover action on the target element.
//        action.moveToElement(ele).perform();
        driver.findElement(skill).click();
    }


    }





    //




