@Homepage
Feature: Verify Home Page fields and button

  @Regformtile
  Scenario: Verify the Page title as Book Your Flights
    When I Open Customer Registration page
    Then Verify that page title is "Book Your Flights"
    Then Verify that form title is same as expected
    Then Enter "JOHN" in first name
    Then Enter "DOE" in last name
    Then Enter "John.doe@gmail.com" in email field
    Then Enter "John*@**12" in password field
    Then Enter "603, Little LaTrobe Street" in street name
    Then Enter "New Heaven" in city name
    Then Check total displayed states in drop-downs are "51" 
    Then Enter "New York" in state name
    Then Enter "3006A" ZIP code
    Then Click on register button
    Then I click on Go To Flights Search button
    #Then I close the browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
