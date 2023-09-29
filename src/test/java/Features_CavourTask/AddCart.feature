Feature: User should be able to add any item to the cart

  Background: with email and password
    Given  Navigate to shopping website
    Then  Click on  sign button to sign in
    And  Enter email and password
    When Click on  sign in button
    Then User should login successfully in Ecommerce page


  Scenario:
    Given User hover over dress and select summer dress
    Then User  should be directed to the product page
    And   The user should be able to hover over any product
    And  When the user clicks on the Add to cart button, the product should be added to the cart.
    Then It must be verified that the product has been successfully added to the cart.