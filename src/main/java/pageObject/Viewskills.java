package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Viewskills {
    WebDriver driver;
    private By Add = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
    private By skill_name = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
    private By descr = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea");
    private By Save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    private By alltext = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[7]/div/div[2]/div");
    private By Log = By.id("welcome");

    private By logout = By.cssSelector("#welcome-menu > ul > li:nth-child(3) > a");
    private By emailconfig =By.xpath("//*[@id=\"menu_admin_listMailConfiguration\"]");

    public Viewskills(WebDriver driver) {
        this.driver = driver;
    }

    public void setAdd() {
        driver.findElement(Add).click();
    }

    public void setSkill_name(String skill) {
        driver.findElement(skill_name).sendKeys(skill);
    }

    public void setDescrip(String description) {
        driver.findElement(descr).sendKeys(description);
    }

    public void setSave() {
        driver.findElement(Save).click();

    }
    public String getAllText(){
        return driver.findElement(alltext).getText();
    }

    public void setLog() {
        driver.findElement(Log).click();
    }

    public void setLogout() {
        driver.findElement(logout).click();
    }

    public void setconfiguration() {
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu_admin_Configuration\"]"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
    }

    public void setEmailconfig() {
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu_admin_listMailConfiguration\"]"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(emailconfig).click();
    }
}


