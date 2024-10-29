@Homepage
Feature: Verify Home Page fields and button

  @Regformtile
  Scenario: Verify the Page title as Book Your Flights
    When I Open Customer Registration page
    Then Verify that page title is "Book Your Flights"
    Then Verify that form title "Customer Registration"
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
    Then Check that page name is "Registration Confirmation"
    And  I click on Go To Flights Search button
    Then Check that "Flight Search" page is displayed
    And  Check that default trip selected is round trip
    Then Select "One Way" trip type radio button
    And  Select "Two" passenger to book a flight
    Then Select departure as "London" city
    And  Select arrival as "New York" city
    Then Check default service class selected is First class
    And  Select "Economy" as service class for this flight
    Then Click on search flights button
    Then Verify that search flights title is "Select Flights"
    Then Verify that departure flight table shows correct row names
    Then Verify that arrival flight table shows correct row names
    Then Select "Economy" class for "Emirates" flight for departure
    Then Select "Economy" class for "British Airways" flight for arrival
    And  Click on confirm flights button
    Then Verify that page5 title is "Flights Confirmation"
    Then Verify that congratualtions message "Congratulations on booking your flight ticket!" is correct
    Then Verify that flight confirmation text is "Flight Confirmation #"
    Then Verify that flight total tax is "Tax"
    Then Verify that flight total amount text is "Total Price"
    
    
    
    
    

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
