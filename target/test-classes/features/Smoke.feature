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
  User enters correct credentials for UC and skype side, logs in.

  Scenario: Login to S4B Web RTC with correct credentials and not save credentials
    Given S4B client is launched
    And User enter UC_user_name
    And User enter UC_password
    And User presses UC_submit_button
    And User enter skype_user_name
    And User enter skype_password
    When User presses skype_submit_button
    And User presses NO to save the credentials
    Then User gets into S+B main page

  Scenario: Login to S4B Web RTC with incorrect credentials and not save credentials
    Given S4B client is launched
    And User enter UC_user_name
    And User enter incorrect_UC_password
    When User presses UC_submit_button
