Feature: Create a facebook account
As a user I need to open a facebook homepage and do the validation

Scenario: Validate First Name field
Given User need to be on facebook login page
When user enters user "Lalit" first name
Then user checks "Lalit" name is present

Scenario: Validate First Name and Sur Name fields
Given User needs to be on facebook login page
When user enters user "Lalit" first name
And user enters user "Kumar" first name
Then user checks "Lalit" "Kumar" is present 