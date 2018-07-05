Feature: Facebook login feature
As a user i need to open facebook page and do the validation

Scenario: Validate First Name field
Given User need to be on Facebook login page
When user enters user first name
Then User checks user first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When user enters first name
#And user enters surname
#Then user checks user first name is present
#But user Mobile field should be blank