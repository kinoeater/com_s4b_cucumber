Feature: strat a call, end a call via dialpad
    As a User, I want to start a call and end a call.
    
    
  
  Scenario: User makes a call via dial pad, then ends the call
  	Given Client is launched
    And User enters UC username 
    And User enters UC_password
    When User presses UCLogin
    Then User can see Skype Login Page
    And User enters skype username
    And User enters skype password
    When User presses SKYPELogin
    And User presses NO for save credentials 
    Then User gets into main page
    And User switches to Calls TAB
    And User Starts a call via dialpad
    And User ends the call via endcall button
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client
    
    
    Scenario: User sends an IM to a user.
  	Given Client is launched
    And User enters UC username 
    And User enters UC_password
    When User presses UCLogin
    Then User can see Skype Login Page
    And User enters skype username
    And User enters skype password
    When User presses SKYPELogin
    And User presses NO for save credentials 
    Then User gets into main page
    And User finds a User in the contacts
    And User sends IM to a User
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client