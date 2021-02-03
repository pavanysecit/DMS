Feature: Checking all the functionalities of WorkFlow submodule featrues under Administrator module

		Scenario: Adding Reviewers and Approvers to the document type
    Given Admin module, Reviewers & Approvers page
    When Click on reviewers & approvers link, fill the details and click on save button
    Then Selected document type should get associated with reviewers and approvers
	
		Scenario: Checking the validation for adding duplicate reviewer & approver for same document type
    Given Admin module, Workflow creation page and duplicate document type, approver and reviewer details
    When Click on reviewers & approvers link, fill the duplicate workflow details and click on save button
    Then Selected document type should not get associated with reviewers and approvers and should display an error message
	
		Scenario: Adding multiple reviewers and multiple approvers to the document type
    Given Admin module, Reviewers & Approvers and workflow page
    When Click on reviewers & approvers link, select the multiple reviewers & approvers and click on save button
    Then Selected document type should get associated with multiple reviewers and multiple approvers
	
		Scenario: Setting up auto approve option for document type
    Given Admin module, workflow page and auto approve checkbox
    When Click on reviewers & approvers link, select the auto approve option and click on save button
    Then Selected document type should get associated with auto review and auto approve option
	
		Scenario: Editing the Reviewers & Approvers details successfully
    Given Admin module, edit reviewers & approvers page
    When Click on edit link, select the document type, change reviewers & approvers details and click on save button
    Then Reviewers & Approvers details should get changed successfully
	
		Scenario: Checking the reviewers and approvers list
    Given Admin module, workflow page and link to click on reviewer & approvers
    When Navigate to workflow pages and click on reviewer & approvers link
    Then System should display the reviewers list on click of reviewer icon
		And System should display the approvers list on click of approver icon
	
		Scenario: Adding Reviewers and Approvers to the document type and removing
    Given Admin module, Reviewers & Approvers page and Remove link
    When Click on Add Reviewers & Add Approvers link and click on Remove link for individual users
    Then Added approvers and reviewers should get removed
	
		Scenario: Checking the functionality of Cancel button
    Given Admin module, Reviewers & Approvers page and Cancel button
    When Select document type, reviewers and approvers and click on Cancel button
    Then Selected details should be cleared on click of Cancel button
	
		Scenario: Searching the documents by the status
    Given Admin module, Work status report page, status drop down and view button
    When Select Status and click on View button
    Then All the document which has selected status in search criteria should get displayed
	
		Scenario: Searching the documents by the document type
    Given Admin module, Work status report page, document type drop down and view button
    When Select document type and click on View button
    Then All the document which has selected document type in search criteria should get displayed
	
		Scenario: Searching the documents by Initiated by option
    Given Admin module, Work status report page, initiated by drop down and view button
    When Select Initiated By and click on View button
    Then All the document which are initiated by the selected person in the drop down should get displayed
	
		Scenario: Searching the documents by start date and due date
    Given Admin module, Work status report page, start date, due date and view button
    When Select the start date & due date and click on View button
    Then All the document which have same start date and due date should get displayed
	
		Scenario: Check the functionality of the Cancel button
    Given Admin module, Work status report page and cancel button
    When Select the status,document type, initiated by, start date & due date and click on Cancel button
    Then All the details selected in search criteria should get cleared on click on Cancel button
	
		Scenario: Navigating to different pages in the search result page
    Given Admin module, next and last buttons in search result pages page
    When Navigate to search result page and click on Next & Last buttons
    Then System should navigate to different search result pages when click on next button
	
		Scenario: Checking the functionality of Track status, reviewer and approvers links
    Given Admin module, view button, approver, reviewer and track status link
    When Navigate to search result page and click on approver, reviewer and track status link
    Then System should display reviewers list on click of Reviewers icon
		And System should display the approvers list on click of approvers icon
		And System should display the track status page on click of Track status icon