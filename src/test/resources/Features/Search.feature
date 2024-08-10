Feature: Search Page Validation

  @Search
  Scenario: Testing Search
    When I login with the website
    Then I should see dashboard
    When I enter text to Search and click on Search button
    Then I should see Results
    When I enter invalid text to Search and click on Search button
    Then I should not see Results
    When I enter text to Search and click on Search button
    Then I should see Results

  @Search
  Scenario: Testing Search Pagination
    When I login with the website
    Then I should see dashboard
    When I enter text to Search and click on Search button
    Then I should see Results
    When I click on Next
    Then I should see Results on Second Page