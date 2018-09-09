Feature: User Logs in and switches between the tabs
    As a User, I want to switch between the tabs
    
    
  
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
    And User switches to Instant Messages TAB
    And User switches to Calls TAB
    And User switches to See_Me Controller TAB
    And User switches to webEx_TAB 
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client