Feature: Verify login feature pulse website

	Scenario: Verify login with valid username and valid password
		Given user should be in login page
		When user enter valid username and valid password 
		And click on signin button
		Then user should be logged in 
		And close the browser
		
		
		Scenario: Verify Signin with valid username and invalid password
        Given user should be in login page
        When user enter valid username and invalid password
        And click on signin button
        Then user should not be logged in
        And close the browser