Feature:  Login functionality
Background: with email and password
    Given  Navigate to shopping website
    Then  Click on  sign button to sign in
    And  Enter email and password
    When Click on  sign in button
  Then User should login successfully in Ecommerce page


  Scenario: Add a new address
    When Click on site
    Then Click on addresses
    And Add  a new address
    Then  Enter address mandatory information
    |  1200 s courthouse rd |
    |  Arlington |
    |  22204|
    |  571-289-4455 |
    Then  Click on save button

