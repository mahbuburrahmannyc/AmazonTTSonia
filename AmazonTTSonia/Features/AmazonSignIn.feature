Feature: Sign In

Description: As a User i  want to sign in Amazon sign in account so that i can successfully sign in

Scenario: Positive

Given User are in Amazon Home page

When User click Sign in Account
And enter the valid user name
And enter the  valid password
And click on sign in button


Then user successfully sign in
