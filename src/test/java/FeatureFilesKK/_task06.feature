Feature: Login Function
  As a user I want to be able to login
  with my valid username and password


  Scenario: Login with valid username and password
    Given Navigate to  Web Site
    And   Enter Sing in
    And   Enter a valid email address and password.
    And   Click on Sign in Button
    And   Enter Dresses Button
    And   Add First Product to Cart
    And   Add First to Cart
    And   Continue shopping
    And   Add Second Product to Cart
    And   Add Second to Cart
    And   Continue shopping
    And   Add third Product to Cart
    And   Add third to Cart
    And   Continue shopping

    When  Click on Cart Button

    Then User Should Verify That There Are a Total Of Three Items In The Shopping Cart

