Feature: Login Page Validation

  @Login
  Scenario: Customer Account Login
    When I login with the website
    Then I should see dashboard
    When I click on YourAccount
    Then I should see location dropdown
    When I click on Create Account
    Then enter details in required fields



