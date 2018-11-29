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
@tag
Feature: As a user navigate to user registration page

@tag1
Scenario: As a user navigate to the signin page
Given User is on the autopractice home page
And User clicks on the signin link
Then it takes the user to the registration page

@tag2
Scenario: As a user provide the email address and register
Given User is on the registration page
And User enters the email address
And user clicks on the create button
Then it takes the user to the detailed registration page    

@tag3
Scenario: As a user i need provide details and register
Given user is on the detailed registration page
And User selects the salutation
And User enters the first name
And User enters the last name
Then details are filled
  