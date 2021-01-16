Feature: Login with Valid Credentials

Scenario: Successful login with valid credentials
	Given User has navigated to login page
	When User enters valid email and password
	And User submits the entry
	Then User should successfully login to account