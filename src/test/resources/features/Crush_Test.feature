#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Login to S4B Web RTC with correct credentials 
    As a User, I want to log into S4B Web RTC, not saving and not saving the credentials,
    I should get into main page and see the contacts screen tab on the left hand side, switch between the tabs.
    
  Background: 
    Given Client is launched
    And User enters UC username 
    And User enters UC_password
    When User presses UCLogin
    Then User can see Skype Login Page
    And User enters skype username
    And User enters skype password
    When User presses SKYPELogin

  
  Scenario: User logs in with correct credentials and does not save the credentials
    And User presses NO for save credentials 
    Then User gets into main page
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client


Scenario: User logs in with correct credentials and saves the credentials
    And User presses YES for save credentials
    Then User gets into main page
    And User switches to Settings TAB
    And User presses logout button 
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client
    
     
 
    
 Scenario: User switches between the tabs.
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



 Scenario: User sends an IM to one of the Users.
    And User presses NO for save credentials 
    Then User gets into main page
    And User finds a User in the contacts
    And User sends IM to a User
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client
    
    Scenario: User makes a call via dial pad, then ends the call
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
    
    
    
    



