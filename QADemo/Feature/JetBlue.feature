
@JetBlue
Feature: JetBlue

  @OnePerson
  Scenario: Valid Search Flight
    Given I am JetBlue Search Flight site
    And I search from NYC to Boston MA
    When I click Search Flights
    Then I should be taken to Departing Flights 

 
	@Two
	 Scenario: Valid Search Flight with 2 or more
    Given I am JetBlue Search Flight site
    And I search from NYC to Boston MA and add users
    When I click Search Flights
    Then I should be taken to Departing Flights 
	