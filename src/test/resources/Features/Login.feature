Feature: OrangeHRM Application

  @SmokeTest
  Scenario: Validate user able to Login/logout with valid credentials
    Given User visit to an application OrangeHRM
    When User input username, password and click the Login button
    Then User Logout from an application


  @Test @All
  Scenario: Validating user can add employee data within an application and validate the saved information
    Given User visit to an application OrangeHRM
    When User input username, password and click the Login button
    And User click on Admin button
    And User try to add System User
    And User select the Employee name "peter"
    And User select the Status
    And User select role option
    And User provide a Username "firewater"
    And User provide a Password "9031@Saif"
    And User confirm the Password "9031@Saif"
    And User clicks on Save button
    Then Verify User is added "firewater"
    And User Logout from an application

  @Test2 @All
  Scenario: Validate that user can provide a data fo recruiting a candidate and validate the saved information
    Given User visit to an application OrangeHRM
    When User input username, password and click the Login button
    And User click on the Recruitment button
    And User try to add System User
    And User then add candidate name
    And User then provide email id
    And User clicks on Save button
    And User click on the Recruitment button
    Then User search and verify for added candidate
    And User Logout from an application

  @Test3 @All
  Scenario: Verify that user can add PIM (Personal information of Employee) and validate the saved information
    Given User visit to an application OrangeHRM
    When User input username, password and click the Login button
    And User click on PIM module
    And User try to add System User
    And User then add candidate name
    And User clicks on Save button
    And User clicks on Save button in details page
    And User click on PIM module
    Then User search and verify for added employee
    And User Logout from an application

  @Test4 @All
  Scenario: Verify that employee can apply leave through an application and validate the saved information
    Given User visit to an application OrangeHRM
    When User input username, password and click the Login button
    And User click on the leave button
    And User click on the apply button
    And User Select the leave type link
    And User set the start and end date
    And User click on the apply button after filling details
    Then Verify that the applied leaves exist in leave list
    And User Logout from an application