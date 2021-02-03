Feature: Checking all the functionalities of User Management and Access Management submodules featrues under Administrator module

		Scenario: Creating user successfully
    Given Admin module, user management section and user creation page
    When Click on User management link, fill the user details and click on save button
    Then User should get created successfully and confirmation messages should be displayed
	
		Scenario: Checking the validation for inserting duplicate email id
    Given Admin module, user management section, user creation page and duplicate email id
    When Click on User management link, fill the user details with existing email id and click on save button
    Then User should not get created successfully and error messages should be displayed
	
		Scenario: Checking the validation for mandatory fields
    Given Admin module, user management section, user creation page and mandatory field validation
    When Click on User management link and click on save button
    Then System should display validation message for individula fields
	
		Scenario: Editing the user details successfully
    Given Admin module, edit user details page
    When Click on edit link, change user details and click on save button
    Then User details should get changed successfully
	
		Scenario: Editing the user details and marking it as InActive
    Given admin module, edit user details page and Inactive button
    When Click on edit link, mark the user inactive and click on save button
    Then User should be marked as Inactive and should not be listed in the users list
	
		Scenario: Navigating to different pages in the user details screen
    Given Admin module, next and last buttons in User page
    When Navigate to user pages and click on Next & Last buttons
    Then System should navigate to different user pages when click on next button
	
		Scenario: Searching the user details by group, user name and role
    Given Admin module, search text box and search button in user page
    When Navigate to user page, enter the user name, group name & role and click on search button
    Then System should check the entered user name, group name & role and display the search results
	
	
	
		Scenario: Providing access to the user successfully
    Given Admin module, access management section and access creation page
    When Navigate to access creation page, select the user, provide the required access and click on save button
    Then User should see the required screen based on the access provided
	
		Scenario: Checking the validation for mandatory fields
    Given Admin module, access management section, access creation page and mandatory field validation
    When Click on Add button under access management page and click on save button
    Then System should display validation message for not entering the mandatory fields
	
		Scenario: Editing the access details successfully
    Given Admin module, edit access details page
    When Click on edit link, change access details and click on save button
    Then Access details should get changed successfully 
	
		Scenario: Navigating to different pages in the access details screen
    Given Admin module, next and last buttons in access page
    When Navigate to access pages and click on Next & Last buttons
    Then System should navigate to different access pages when click on next button
	
		Scenario: Searching the access details by group, user name and role
    Given Admin module, search text box and search button in access page
    When Navigate to access page, enter the user name and click on search button
    Then System should check the entered user name and display the search results