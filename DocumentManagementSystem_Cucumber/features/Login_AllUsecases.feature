Feature: Checking the functionalities of the Login module
 
  	Scenario: Check the functionality of login module with valid username and password
    Given Login page, username and password
    When Enter the login details and click on login button
    Then User should login successfully after entering the valid credentials
 
   	Scenario: Check the functionality of login module with invalid valid username and invalid password
    Given Login page, invalid username and invalid password
    When Enter the invalid login details and click on login button
    Then User should not be able to login and should get error message for entering invalid login details
	
		Scenario: Check the functionality of login module with empty username and empty password
    Given Login page, empty username and empty password
    When Dont enter the username and password and click on login button
    Then System should display the error message for not entering the username and password
	
		Scenario: Check the functionality of forgot password
    Given Login page, and forgot password link
    When Click on forgot password link
    Then System should send the temporary password as email to mentioned email id
	
		Scenario: Check the validations for entering Invalid or empty emailid for sending the verification email
    Given Login page, forgot password link and send verification email button
    When Click on forgot password link and enter invalid & empty email id
    Then System should throw an error message for entering invalid and empty email id