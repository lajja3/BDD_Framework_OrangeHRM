
Feature: Orange HRM Login Feature

Scenario Outline: Orange HRM Login Test Scenario

    Given user is already on Login Page
    When title of login page is OrangeHRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    #Then close the browser
    
 Examples:
           | username | password |
           | Admin    | admin123 |
           