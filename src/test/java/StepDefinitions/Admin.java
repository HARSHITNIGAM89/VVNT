package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.utils.OsgiUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.*;



public class Admin extends pageobjectmanager {
    WebDriver driver;


    @Given("User visit to an application OrangeHRM")
    public void ApplicationURL() throws Throwable {
        new LoginPage().URL1();
    }
    @When("User input username, password and click the Login button")
    public void UserCredentials() throws Throwable {
        new LoginPage().LoginCredentials();
    }

    @And("User click on Admin button")
    public void adminClick()throws Throwable {
        new Dashboard().adminButtonClick();
    }
    @And("User try to add System User")
    public void systemUser() throws Throwable {
        new Dashboard().clickAdd();
    }
    @And("User select the Employee name {string}")
    public void employeeName(String arg) throws Throwable{
        new Dashboard().EmployeeName(arg);
    }
    @And("User select the Status")
    public void selectStatus()throws Throwable {
        new Dashboard().status();
    }
    @And("User provide a Username {string}")
    public void username(String arg) throws Throwable{
        new Dashboard().username(arg);
    }
    @And("User provide a Password {string}")
    public void password(String arg) throws Throwable{
        new Dashboard().password(arg);
    }
    @And("User confirm the Password {string}")
    public void confirmPassword(String arg) throws Throwable{
        new Dashboard().confirm(arg);
    }
    @And("User clicks on Save button")
    public void saveButton() throws Throwable {
        new Dashboard().submit();
    }

    @And("User clicks on Save button in details page")
    public void saveButtonBottom() throws Throwable {
        new Dashboard().saveBottomButton();
    }

    @And("User select role option")
    public void roleOption() throws Throwable {
        new Dashboard().role();
    }

    @Then("Verify User is added {string}")
    public void verifyUser(String string) throws Throwable {
        new Dashboard().verify();
    }
    @Then("User Logout from an application")
    public void appLogout()throws Throwable {
        new Dashboard().logout();
    }
    @Then("User click on the Recruitment button")
    public void RecruitmentButton()throws Throwable {
        new Dashboard().recruitmentButtonMethod();
    }
    @Then("User then add candidate name")
    public void candidateName()throws Throwable {
        new Dashboard().candidateNameMethod();
    }
    @Then("User then provide email id")
    public void emailID()throws Throwable {
        new Dashboard().emailIDMethod();
    }

    @And("User click on PIM module")
    public void PIMModule()throws Throwable {
        new Dashboard().PIMButtonMethod();
    }

    @And("User fills all the personal details of the employee and click on save button")
    public void jobModule()throws Throwable {
        new Dashboard().jobTab();
    }

    @And("User click on Employee list in PIM model")
    public void employeeListNavigate()throws Throwable {
        new Dashboard().jobTab();
    }
    @Then("User search and verify for added employee")
    public void addedEmployee()throws Throwable {
        new Dashboard().PIMVerify();
    }

    @Then("User search and verify for added candidate")
    public void candidateValidate()throws Throwable {
        new Dashboard().recruitmentValidate();
    }

    @And("User click on the leave button")
    public void leaveButton()throws Throwable {
        new Dashboard().LeaveButtonMethod();
    }
    @And("User click on the apply button")
    public void applyButton()throws Throwable {
        new Dashboard().applyLeave();
    }
    @And("User Select the leave type link")
    public void leaveType()throws Throwable {
        new Dashboard().leaveType();
    }
    @And("User set the start and end date")
    public void startEndDate()throws Throwable {
        new Dashboard().toAndFromDate();
    }

    @And("User click on the apply button after filling details")
    public void applyBottomButton()throws Throwable {
        new Dashboard().bottomApply();
    }
    @Then("Verify that the applied leaves exist in leave list")
    public void verifyLeaves()throws Throwable {
        new Dashboard().leavesVerify();
    }

}

