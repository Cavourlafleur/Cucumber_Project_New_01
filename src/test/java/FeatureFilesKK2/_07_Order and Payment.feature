Feature: Login Function
  As a user I want to be able to login
  with my valid username and password
 Scenario:
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

  And  Click on Cart Button

   And   Click on Checkout button
   And   Choose Delivery Address
   And   Agree to Terms of Service
   And   Choose Pay By Bank
   When  Confirm Order
   Then  The Message for Bank Must be verified

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
   And  Click on Cart Button

    And   Click on Checkout button
    And   Choose Delivery Address
    And   Agree to Terms of Service
    When  Choose Pay By  Credit Card
    Then  The Message for Credit Card   Must be verified

  Given Navigate to  Web Site
  And  Click on Cart Button

   And   Click on Checkout button
   And   Choose Delivery Address
   And   Agree to Terms of Service
   When  Choose Pay With Paypal
   Then  The Message for Paypal Must be verified

