Feature: Create a new Account
  As a user, I would like to register on the website
  by going to https://Cleverppc.com/Prestashop4/.
  So when I access the site,
  I can see personalized content and benefit
  from special offers and other benefits

  Scenario:
    Given Navigate to web site
    And click on sign in
    And Enter valid Email
    And Click at Create Button
    And Fill the Form
    Then Click at Register Button
    Then Success  Your account has been created.