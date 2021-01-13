Feature: Register As A User


Scenario: Successfull Account Registration
	Given User lands on account registration page
	When User fill in form with valid credentials
	And User clicks register
	Then User gets logged in to user's account 