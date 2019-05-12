Feature: Steps to test cucumber application

Scenario: Testing the login

	Given user opens the browser
	When user is on login page
	Then user enters email and password
	Then user clicks sign in button
	Then close the browser