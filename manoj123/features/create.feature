Feature: pancard

  Scenario: Apply new pancard
    Given Open browser and navigate to required url
    Then click on the  applynew pancard
    And enter details of candidate
    Then click on the submit button
 Scenario: Apply duplicate pancard
  Given Open browser and navigate to  required url
  Then click on apply duplicate pancard
  And enter details of candidate
  When click on the submit button
  