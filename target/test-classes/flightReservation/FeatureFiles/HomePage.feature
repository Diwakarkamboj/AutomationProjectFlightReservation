@Homepage
Feature: Verify Home Page fields and button

  @Regformtile
  Scenario: Verify the Page title as Book Your Flights
    When I Open Customer Registration page
    Then Verify that page title is same as expected
    Then I close the browser

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
