@Marto
Feature: Test Mercado Libre search functionality

  Scenario: As a user I enter a search criteria in Mercado Libre
    Given I am on the Mercado Libre search page
    When I enter a search criteria
    And click on the search button
    Then the results match the criteria

