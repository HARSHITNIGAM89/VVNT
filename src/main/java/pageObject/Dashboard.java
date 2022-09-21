package pageObject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;

/*import java.util.logging.LogManager;
import java.util.logging.Logger;*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard extends baseClass{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    JavascriptExecutor js = (JavascriptExecutor) driver;

    private static final Logger logger = LogManager.getLogger(Dashboard.class);


    public void adminButtonClick() throws Throwable{
       Thread.sleep(2000);
       WebElement adminButton = driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
       logger.info("User click on admin button");
       adminButton.click();
    }

    public void clickAdd() throws Throwable{
        Thread.sleep(2000);
        WebElement addButton = driver.findElement(By.xpath("(//*[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]"));
        logger.info("User click on add button");
        addButton.click();
    }
    public void role() throws Throwable{
        Thread.sleep(2000);
        WebElement roleDropdown = driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[1]"));
        roleDropdown.click();
        WebElement adminText = driver.findElement(By.xpath("//*[contains(text(),'Admin')]"));
        adminText.click();
    }
    public void EmployeeName(String name) throws Throwable{
        Thread.sleep(2000);
        WebElement EmployeeName = driver.findElement(By.xpath("(//*[@class='oxd-autocomplete-text-input--before'])[1]/following::input"));
        EmployeeName.sendKeys(name);
        Thread.sleep(3000);
        WebElement employeeNameSuggestion = driver.findElement(By.xpath("//*[contains(text(),'Peter Mac Anderson')]"));
        employeeNameSuggestion.click();
       // EmployeeName.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
    }
    public void username(String username) throws Throwable{
        Thread.sleep(2000);
        WebElement usernameField = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
        usernameField.sendKeys(username);
      //  logger.info("username input");
    }
    public void password(String password) throws Throwable{
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.xpath("(//*[@type='password'])[1]"));
        passwordField.sendKeys(password);
    }
    public void confirm(String confirm) throws Throwable{
        Thread.sleep(2000);
        WebElement confirmPassword = driver.findElement(By.xpath("(//*[@type='password'])[2]"));
        confirmPassword.sendKeys(confirm);
    }
    public void status() throws Throwable{
        Thread.sleep(2000);
        WebElement statusDropdown = driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[2]"));
        statusDropdown.click();
        WebElement EnabledText = driver.findElement(By.xpath("//*[contains(text(),'Enabled')]"));
        EnabledText.click();
    }

    public void submit() throws Throwable{
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("(//*[@type='submit'])"));
        submit.click();
    }

    public void saveBottomButton() throws Throwable{
        Thread.sleep(10000);
        WebElement submit = driver.findElement(By.xpath("((//*[@type='submit']))[2]"));
        js.executeScript("arguments[0].scrollIntoView();", submit);
        submit.click();
    }

    public void verify() throws Throwable{
        Thread.sleep(10000);
        WebElement verifyElement = driver.findElement(By.xpath("(//*[contains(text(),'firewater')])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", verifyElement);
        String expected = verifyElement.getText();
        String actual = ("firewater");
        try {
            org.testng.Assert.assertEquals(actual, expected);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void applyLeave() throws Throwable{
        Thread.sleep(2000);
        WebElement applyLeaveLink = driver.findElement(By.xpath("//*[contains(text(),'Apply')]"));
        applyLeaveLink.click();
    }

    public void logout() throws Throwable{
        WebElement logoutMenu = driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']"));
        logoutMenu.click();
        WebElement logoutLink = driver.findElement(By.xpath("//*[contains(text(),'Logout')][1]"));
        logoutLink.click();
    }
    public void recruitmentButtonMethod() throws Throwable{
        Thread.sleep(5000);
        WebElement recruitmentButtonElement = driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]"));
        recruitmentButtonElement.click();
    }
    public void candidateNameMethod() throws Throwable{
        WebElement FirstName = driver.findElement(By.xpath("//*[@name='firstName']"));
        FirstName.sendKeys("TestFirstName");
        WebElement LastName = driver.findElement(By.xpath("//*[@name='lastName']"));
        LastName.sendKeys("TestLastName");
    }
    public void emailIDMethod() throws Throwable{
        WebElement emailID = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
        emailID.sendKeys("Testemail@gmail.com");
    }

    public void leaveType() throws Throwable{
        Thread.sleep(3000);
        WebElement leaveTypeDropdown = driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']"));
        leaveTypeDropdown.click();
        WebElement leaveType = driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]"));
        leaveType.click();
    }

    public void PIMButtonMethod() throws Throwable{
        WebElement PIMButtonElement = driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
        PIMButtonElement.click();
    }

    public void LeaveButtonMethod() throws Throwable{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")));
        WebElement LeaveButtonElement = driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]"));
        LeaveButtonElement.click();
    }

    public void toAndFromDate() throws Throwable{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")));
        WebElement fromDate = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
        fromDate.sendKeys("2022-01-04");
        Thread.sleep(3000);
        //WebElement toDate = driver.findElement(By.xpath("(//*[@class='oxd-date-input'])[2]"));
        //toDate.sendKeys("2022-01-04");
        //Thread.sleep(3000);
    }

    public void bottomApply() throws Throwable{
        WebElement bottomApplyButton = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        js.executeScript("arguments[0].scrollIntoView();", bottomApplyButton);
        bottomApplyButton.click();
        Thread.sleep(3000);
    }

    public void jobTab() throws Throwable{
        Thread.sleep(3000);
        WebElement jobTabDropdown = driver.findElement(By.xpath("(//*[@class='orangehrm-tabs-wrapper'])[6]/a"));
        jobTabDropdown.click();
        Thread.sleep(3000);
        WebElement jobTabElement = driver.findElement(By.xpath("(//*[@class='oxd-select-text-input'])[5]"));
        jobTabElement.click();
        Thread.sleep(3000);
        WebElement jobType = driver.findElement(By.xpath("//*[contains(text(),'Freelance')][1]"));
        jobType.click();
    }

    public void leavesVerify() throws Throwable {
        Thread.sleep(3000);
        WebElement leavesList = driver.findElement(By.xpath("//*[contains(text(),'Leave List')]"));
        leavesList.click();
        Thread.sleep(3000);
        WebElement leaveTypeVerify = driver.findElement(By.xpath("(//*[contains(text(),'CAN')])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", leaveTypeVerify);
        String value = leaveTypeVerify.getText();
        String actual = "CAN - Personal";
        String expected = value;
        try {
            org.testng.Assert.assertEquals(actual, expected);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void employeeListNavigate() throws Throwable{
        WebElement employeeList = driver.findElement(By.xpath("//*[contains(text(),'Employee List')][1]"));
        employeeList.click();
    }
    public void PIMVerify() throws Throwable {
        Thread.sleep(5000);
        WebElement PIM = driver.findElement(By.xpath("//*[contains(text(),'QA Lead')][1]"));
        js.executeScript("arguments[0].scrollIntoView();", PIM);
        String value = PIM.getText();
        value.contains("QA Lead");
        String actual = "QA Lead";
        String expected = value;
        try {
            org.testng.Assert.assertEquals(actual, expected);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public void recruitmentValidate() throws Throwable {
        Thread.sleep(5000);
        WebElement candidateValidate = driver.findElement(By.xpath("//*[contains(text(),'TestFirstName  TestLastName')][1]"));
        js.executeScript("arguments[0].scrollIntoView();", candidateValidate);
        String value = candidateValidate.getText();
        String actual = "TestFirstName TestLastName";
        String expected = value;
        try {
            org.testng.Assert.assertEquals(actual, expected);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }




}
