Feature: Check customer login in www.gcrit.com/build3/login shopping portal
   In order to verify that customer is already registered 
   As a user of gcrit.com shopping portal
   I should be able to get the result that the page source contains the name of customer

   Scenario: login
   Given I open gcrit login
   When I enter email address and password
   Then I should get result that the page source contains the name of customer