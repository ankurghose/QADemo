@DataTable  @Functional @Login
Feature: Login With Data Tables
  

  
  @TS1
  Scenario:  Login
    Given I am on RCN Login Page
    And I enter username and password
    |username|password|
    |TestUser1|password1|
    |TestUSer2|password2|
    |TestUser3|password3|
    When I click enter
    Then I should recieve an error message
   
   @TS2
   Scenario:  Login
    Given I am on RCN Login Page
    And I enter username and password
    |username|password|
    |TestUser2|password2|
    When I click enter
    Then I should recieve an error message
    
     @TS3
   Scenario:  Login
    Given I am on RCN Login Page
    And I enter username and password
    |username|password|
    |TestUser3|password3|
    When I click enter
    Then I should recieve an error message