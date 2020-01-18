Feature: Test Search functionality
 
 Scenario: Login on facebook application.
    Given a user is on the Login page "www.facebook.com"
    Then user gets email textbox
	When user enters username "testing"
	And user enters password "testing"
	And user clicks on login button
	Then user is on home page 
	