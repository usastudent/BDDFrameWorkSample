
Feature: Desktops

	@desktopTest
  Scenario: User verify all items are present in Desktops tab
    Given user is on Retail home Page
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page
  