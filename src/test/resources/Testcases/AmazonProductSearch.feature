Feature: Amazon Product Search
  As a book worm
  I want to search for books
  On Amazon.com

  @RegressionTests @SmokeTests
  Scenario: Search for Cucumber book written by Matt and Aslak
    Given I am on amazon homepage
    When I search for The Cucumber Book: Behaviour-Driven Development for Testers and Developers (Pragmatic Programmers)
    And I select the first product
    Then I should see the product title is The Cucumber Book: Behaviour-Driven Development for Testers and Developers (Pragmatic Programmers)
    And I should see authors are Matt Wynne and Aslak Hellesoy