Feature: Login Functionality

  @loginPageVerification
  Scenario Outline: Invalid user name and password
    Given user navigates to login screen
    When user enters "<userName>" and "<password>"
    And click on login button
    Then user gets error message "Login Failed, please try again."
    Examples:
    |userName|password|
    |invalidUserName|invalidPassword|