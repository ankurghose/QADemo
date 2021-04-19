
@Empty @Smoke
Feature: Empty Form
  


  Scenario: All Empty form get red boxes
    Given I am on the form Page
    And I scroll down to submit button
    When I click submit
    And I get all red box
    Then I validate the mandatory fields are in red 


  