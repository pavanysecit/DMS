Feature: Checking all the functionalities of ManageVault submodule features under Administrator module

		Scenario: Creating the country details successfully
    Given admin module, country creation page
    When Click on add country link, fill the details and click on save button
    Then Country should get created successfuylly and should be visible in the country list
	
		Scenario: Checking the validation for creating duplicate country
    Given admin module, country creation page and duplicate country details
    When Click on add country link, fill the existing country details and click on save button
    Then Country should not get created successfuylly and should display error message
	
		Scenario: Editing the country details successfully
    Given admin module, edit country page
    When Click on edit link, change country details and click on save button
    Then Country details should get changed successfully
	
		Scenario: Editing the country and marking it as InActive
    Given admin module, edit country page and Inactive button
    When Click on edit link, mark the country inactive and click on save button
    Then Country should be marked as Inactive and should not be listed in the country list
	
		Scenario: Navigating to different pages
    Given admin module, next and last buttons
    When Navigate to country pages and click on Next & Last buttons
    Then System should navigate to different pages when click on next button
	
		Scenario: Searching the country details by name and code
    Given admin module, search text box and search button
    When Navigate to country page, enter the country name & code and click on search button
    Then System should check the entered country name & code and display the search results
	
		Scenario: Creating the location details successfully
    Given admin module, location creation page
    When Click on add location link, fill the details and click on save button
    Then Location should get created successfuylly and should be visible in the location list
	
		Scenario: Checking the validation for creating duplicate location
    Given admin module, location creation page and duplicate location details
    When Click on add location link, fill the existing location details and click on save button
    Then Location should not get created successfuylly and should display error message
	
		Scenario: Editing the location details successfully
    Given admin module, edit location page
    When Click on edit link, change location details and click on save button
    Then location details should get changed successfully
	
		Scenario: Editing the location and marking it as InActive
    Given admin module, edit location page and Inactive button
    When Click on edit link, mark the location inactive and click on save button
    Then Location should be marked as Inactive and should not be listed in the location list
	
		Scenario: Navigating to different location pages 
    Given admin module, next and last buttons in location page
    When Navigate to location pages and click on Next & Last buttons
    Then System should navigate to different location pages when click on next button
	
		Scenario: Searching the location details by location and country
    Given admin module, search text box and search button in location page
    When Navigate to location page, enter the country name & location name and click on search button
    Then System should check the entered country name & location name and display the search results
	
		Scenario: Creating the company details successfully
    Given admin module, company creation page
    When Click on add company link, fill the details and click on save button
    Then company should get created successfuylly and should be visible in the company list
	
		Scenario: Checking the validation for creating duplicate company
    Given admin module, company creation page and duplicate company details
    When Click on add company link, fill the existing company details and click on save button
    Then Company should not get created successfuylly and should display error message
		
		Scenario: Editing the company details successfully
    Given admin module, edit company page
    When Click on edit link, change company details and click on save button
    Then company details should get changed successfully
	
		Scenario: Editing the company and marking it as InActive
    Given admin module, edit company page and Inactive button
    When Click on edit link, mark the company inactive and click on save button
    Then Company should be marked as Inactive and should not be listed in the company list
	
		Scenario: Navigating to different company pages 
    Given admin module, next and last buttons in company page
    When Navigate to company pages and click on Next & Last buttons
    Then System should navigate to different company pages when click on next button
	
		Scenario: Searching the company details by location, company name and code
    Given admin module, search text box and search button in company page
    When Navigate to company page, enter the location name, company name & code and click on search button
    Then System should check the entered location name, company name & code and display the search results
	
		Scenario: Creating the department details successfully
    Given admin module, department creation page
    When Click on add department link, fill the details and click on save button
    Then Department should get created successfuylly and should be visible in the department list
	
		Scenario: Checking the validation for creating duplicate department
    Given admin module, department creation page and duplicate department details
    When Click on add department link, fill the existing department details and click on save button
    Then Department should not get created successfuylly and should display error message
		
		Scenario: Editing the department details successfully
    Given admin module, edit department page
    When Click on edit link, change department details and click on save button
    Then Department details should get changed successfully
	
		Scenario: Editing the department and marking it as InActive
    Given admin module, edit department page and Inactive button
    When Click on edit link, mark the department inactive and click on save button
    Then Department should be marked as Inactive and should not be listed in the department list
	
		Scenario: Navigating to different department pages 
    Given admin module, next and last buttons in department page
    When Navigate to department pages and click on Next & Last buttons
    Then System should navigate to different department pages when click on next button
	
		Scenario: Searching the department details by department name and code
    Given admin module, search text box and search button in department page
    When Navigate to department page, enter the department name & code and click on search button
    Then System should check the entered department name & code and display the search results
	
		Scenario: Creating the document type successfully
    Given admin module, document type creation page
    When Click on add document type link, fill the details and click on save button
    Then Document type should get created successfuylly and should be visible in the document type list
	
		Scenario: Checking the validation for creating duplicate document type
    Given admin module, document type creation page and duplicate document type details
    When Click on add document type link, fill the existing document type details and click on save button
    Then Document type should not get created successfuylly and should display error message
		
		Scenario: Editing the document type details successfully
    Given admin module, edit document type page
    When Click on edit link, change document type details and click on save button
    Then Document type details should get changed successfully
	
		Scenario: Editing the document type and marking it as InActive
    Given admin module, edit document type page and Inactive button
    When Click on edit link, mark the document type inactive and click on save button
    Then Document type should be marked as Inactive and should not be listed in the document type list
	
		Scenario: Navigating to different document type pages 
    Given admin module, next and last buttons in document type page
    When Navigate to document type pages and click on Next & Last buttons
    Then System should navigate to different document type pages when click on next button
	
		Scenario: Searching the document type details by document type and code
    Given admin module, search text box and search button in document type page
    When Navigate to document type page, enter the document type & code and click on search button
    Then System should check the entered document type & code and display the search results
		
		Scenario: Creating the document category successfully
    Given admin module, document category creation page
    When Click on add document category link, fill the details and click on save button
    Then Document category should get created successfuylly and should be visible in the document category list
	
		Scenario: Checking the validation for creating duplicate document category
    Given admin module, document category creation page and duplicate document category details
    When Click on add document category link, fill the existing document category details and click on save button
    Then Document category should not get created successfuylly and should display error message
		
		Scenario: Editing the document category details successfully
    Given admin module, edit document category page
    When Click on edit link, change document category details and click on save button
    Then Document category details should get changed successfully
	
		Scenario: Editing the document category and marking it as InActive
    Given admin module, edit document category page and Inactive button
    When Click on edit link, mark the document category inactive and click on save button
    Then Document category should be marked as Inactive and should not be listed in the document category list
	
		Scenario: Navigating to different document category pages 
    Given admin module, next and last buttons in document category page
    When Navigate to document category pages and click on Next & Last buttons
    Then System should navigate to different document category pages when click on next button
	
		Scenario: Searching the document category details by document category name & code and document type
    Given admin module, search text box and search button in document category page
    When Navigate to document category page, enter the document category name & code, document type and click on search button
    Then System should check the entered document category name & code, document type and display the search results
	
		Scenario: Creating the group role successfully
    Given admin module, group role creation page and different controls for which access needs to be given
    When Click on add link in group role, fill the details, add the controls to the group and click on save button
    Then Group role should get created successfuylly and should be visible in the group role list
	
		Scenario: Checking the validation for creating duplicate group role
    Given Admin module, group role creation page and duplicate group role details
    When Click on add group role link, fill the existing group role details and click on save button
    Then Group role should not get created successfuylly and should display error message
	
		Scenario: Editing the group role details successfully
    Given Admin module, edit group role page
    When Click on edit link, change group role details and click on save button
    Then Group role details should get changed successfully
	
		Scenario: Navigating to different group role pages 
    Given Admin module, next and last buttons in group role page
    When Navigate to group role pages and click on Next & Last buttons
    Then System should navigate to different group role pages when click on next button
	
		Scenario: Searching the group role details by group role name and comments 
    Given Admin module, search text box and search button in group role page
    When Navigate to group role page, enter the group role name & comments and click on search button
    Then System should check the entered group role name & comment and display the search results
	
		Scenario: Checking the functionality of Down and Up arrow during group role creation
    Given Admin module, group role creation page and down & Up arrows
    When Click on add link in group role, fill the details, select the controls and click on Down and Up arrows
    Then Controls should get added to below list when user select the control and click on Down arrow 
		And Controls should get removed from the below list when user select the controls and click on Up arrow