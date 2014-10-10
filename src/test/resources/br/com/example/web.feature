Feature: Web

@web
Scenario: Search Bing
	Given I open Bing
	And I enter "Transformers" in search field
	When I click on search button
	Then I should see "Imagens de transformers"