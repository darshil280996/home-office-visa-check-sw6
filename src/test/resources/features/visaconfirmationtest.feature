@regression
Feature: Visa confirmation Test
  As a user I want to test visa confirmation

  @author_darshil @sanity @smoke
  Scenario: User should check the visa required or not
    Given I am on home page
    When I accept the cookies
    And  I click on hide button
    And I click on start button
    And I select nationality "Australia"
    And  I click on  next step button
    And  I select reason for visit "Tourism or visiting family and friends"
    And  I click on continue button
    Then  verify result 'You will not need a visa to come to the UK'

  @author_darshil @smoke
  Scenario: verify result You need a visa to work in health and care
    Given I am on home page
    When I click on start button
    And  I Select a Nationality 'Chile'
    And  I click on continue button
    And  Select reason Work, academic visit or business
    And  I click on continue button
    When  Select intendent to stay for longer than 6 months
    And  I click on continue button
    And Select have planning to work for Health and care professional
    And  I click on continue button
    Then verify result of'You need a visa to work in health and care'

  @author_darshil
  Scenario: Verify you’ll need a visa to join your family or partner in the UK
    Given I am on home page
    When I click on start button
    And Select a Nationality 'Colombia'
    And  I click on continue button
    And Select reason Join partner or family for a long stay
    And  I click on continue button
    Then To get verify result 'You may need a visa'