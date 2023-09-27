Feature: User Login
  As a registered user
  I want to log in to the website
  So that I can access my account

  Scenario Outline: Valid User Login
    Given Navigate to web site
    And click on sign in
    When I enter "<email>" and "<password>"
    And I click the "Sign In" button
    Then Success  My account

    Examples:
      | email               | password |
      | Fesvegas@gmail.com | Fesvegas@ |