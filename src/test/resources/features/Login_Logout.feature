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

  
  Scenario: Login and logout S4B Web RTC with correct credentials and not saving the credentials
    And User presses NO for save credentials 
    Then User gets into main page
    And User switches to Settings TAB
    And User presses logout button
    When User presses popup logout button
    Then User can see UC Login Page
    And User exits the client


#Scenario: Login and logout S4B Web RTC with correct credentials and saving the credentials
    #And User presses YES for save credentials
    #Then User gets into main page
    #And User switches to Settings TAB
    #And User presses logout button 
    #When User presses popup logout button
    #Then User can see UC Login Page
   # And User exits the client