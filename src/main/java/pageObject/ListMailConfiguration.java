package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListMailConfiguration {
    WebDriver driver;
    private By edit= By.xpath("//*[@id=\"editBtn\"]");
    private By clickedit= By.xpath("//*[@id=\"emailConfigurationForm_txtMailAddress\"]");
    private By click=By.xpath("//*[@id=\"emailConfigurationForm_txtMailAddress\"]");

    private By Save=By.id("editBtn");

    public ListMailConfiguration(WebDriver driver){
        this.driver=driver;
    }
    public void setEdit(){
        driver.findElement(edit).click();
    }
    public void setClickedit(){
        driver.findElement(clickedit).clear();
    }

    public void setClick(String email){
        driver.findElement(click).sendKeys(email);

    }
    public void setSave(){
        driver.findElement(Save).click();
    }



    }
