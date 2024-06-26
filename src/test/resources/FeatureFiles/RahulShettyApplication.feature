Feature: Validate the Rahul Shetty Application

  Scenario: Verify Logo of the Rahul Shetty Application
    Given User should be at Login page
    Then User should be able to see Logo of the Application

  Scenario: Verify Login functionality of Rahul Shetty Application
    Given User should be at Login page
    When User enters name as "Himanshu"
    And User enters email id as "himanshu2264dalal@gmail.com"
    And User clicks on the checkbox
    And User clicks on Submit button
    Then User should get redirects to Project page
