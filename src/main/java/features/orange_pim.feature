Feature: Orange HRM PIM Add Employee Feature

Scenario Outline: Orange HRM PIM Add Employee Test Scenario

    Given user is already on Login Page
    When title of login page is OrangeHRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user clicks on PIM and Add button
    Then user adds employee "<firstname>" and "<middlename>" and "<lastname>"
    #Then close the browser
    
 Examples:
           | username | password | firstname | middlename | lastname |
           | Admin    | admin123 | Tom       | Peter      | John     |
           | Admin    | admin123 | David     | Dsouza     | Dave     |