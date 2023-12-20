@regression
Feature: Country drop down Page Test Cases

  @author_Darshil @smoke @sanity
  Scenario Outline: Verify the following country is available in country dropdown list
    Given I am on home page
    When  I click on start button
    Then  I can see following '<country>' into dropdown

    Examples:
      | country                |
      |Albania                 |
      |Bhutan                  |
      |British protected person|
      |Haiti                   |
      |Kazakhstan              |
      |Mozambique              |
      |Norway                  |
      |Portugal                |
      |Russia                  |
      |Zambia                  |