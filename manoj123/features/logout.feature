Feature: OrangeHRM

  Scenario: Add  Employee
    Given open browser and navigate to required url
    When enter user name and password and click on login
    Then home page should be displayed
    When click on PIM ,click on employee and enter employee details
    When click on welcome
    And close browser
