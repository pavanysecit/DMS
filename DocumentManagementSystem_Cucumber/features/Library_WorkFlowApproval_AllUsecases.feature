Feature: Checking all the functionalities of Library and WorkFlow module

		Scenario: Uploading the documents to the Library folder
    Given Library module, department folder, upload link and document to upload
    When Click on Library link, navigate to the department folder, click on upload link and select the document to upload
    Then Document should get uploaded in the respective department folder and should be displayed in the list
	
		Scenario: Checking the mandatory field validation for document to upload
    Given Library module, Upload button and Save button
    When Navigate to Library page, click on upload link and click on Save button
    Then Validation message should be displayed if the user doesn't suploaded the document 
	
		Scenario: Add additional fields on the Library grid
    Given Library module, file link and additional fields link on the Library grid
    When Navigate to Library page, click on file link and select the additional fields on the Library grid
    Then System should add the additional fields on the Library grid and display the details for those fields
	
		Scenario: Checking validation messages for not selecting the document for different scenarios
    Given Library module, MoveTo, Edit, Remove and Mail link
    When Navigate to Library page and click on MoveTo, Edit, Remove and Mail link
    Then System should display the validation messages for not selecting the document checkbox 
	
		Scenario: Deleting the document successfully from library folder
    Given Library module, uploaded document and Remove link
    When Navigate to Library page, select the document and click on Remove link
    Then Uploaded document should get removed successfully and should not display in the Library list
	
		Scenario: Editing the document details from library page
    Given Library module, checkbox to select the document and edit link on the library grid
    When Navigate to Library page, select the required file, click on edit link, change the details and click on update button
    Then System should allow user to change the details from library page and changes should get reflected for that document
	
		Scenario: Entering the valid email ids and sending an email successfully
    Given Library module, checkbox to select the document, Mail link on the library grid
    When Navigate to Library page, select the required file, click on mail link, provide the email ids and click on Send button
    Then Email should sent to the provided email id successfuly
	
		Scenario: Moving the document from one department to other department folder successfully
    Given Library module, checkbox to select the document, MoveTo link on the department grid and department folder
    When Navigate to Library page, select the required file, click on MoveTo link, right click on required department folder and click on paste link
    Then Document should get moved from one department to other department folder
	
		Scenario: Navigating to different pages in the library page
    Given Library module, next and last buttons in library page
    When Navigate to library pages and click on Next & Last buttons
    Then System should navigate to different library pages when click on next button
	
		Scenario: View the document details on the browser
    Given Library module, Right click and View link
    When Navigate to library pages, right click on any document and click on View link
    Then System should display the document content on the browser with read only access
	
		Scenario: Renaming the document title
    Given Library module, Right click and Rename link
    When Navigate to library pages, right click on any document, click on Rename link, change the document name and click on Rename butotn
    Then Document title should get changed as per the changes done by the user
	
		Scenario: Downloading the document to the system
    Given Library module, Right click and Download link
    When Navigate to library pages, right click on any document and click on download link
    Then Document should get downloaded into the user system
	
		Scenario: Checking the history of the document 
    Given Library module, Right click and View history link
    When Navigate to library pages, right click on any document and click on View History link
    Then System should display complete history of the document

		Scenario: Deleting the document 
    Given Library module, Right click and delete link
    When Navigate to library pages, right click on any document and click on Delete link
    Then Document should get deleted and confirmation message should be displayed
	
		Scenario: Checking the functionality of check-out and check-in features 
    Given Library module, Right click, check-out and check-in link
    When Navigate to library pages, right click on any document, click on check-out link and check-in link
    Then Clicking on check-out link, document should get opened and click of check-in, changes done in the document should get saved
	
		Scenario: Moving the document from one department to other department using right click MoveTo option
    Given Library module, MoveTo link on right click and department folder
    When Navigate to Library page, right click and click on MoveTo link, right click on required department folder and click on paste link
    Then Document should get moved from one department to other department folder using right click MoveTo option
	
		Scenario: Check the functionality of Start workflow featur for the document
    Given Library module, Start Workflow link on right click and document
    When Navigate to Library page, right click and click on Start Workflow link
    Then Document should undergo for review and approval process
	
		Scenario: Review the document which is marked for workflow started
    Given My tasks under reviews & approval module, document, Submit review button, status drop down, remarks and submit button
    When Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Reviews, select the status, enter the remarks and click on submit button
    Then Document should get reviewed and should go for further approval process
		And Document should be available in the Approvers my tasks list after review
	
		Scenario: Check the functionality of view file link during document review by reviewer
    Given My tasks under reviews & approval module, document and View File link
    When Navigate to Reviews & Approval module, click on My tasks, right click on document and click on View File link 
    Then Document content should get opened in browser with read only access for reviewer
	
		Scenario: Check the functionality of Track Status link during document review by reviewer
    Given My tasks under reviews & approval module, document and Track Status link
    When Navigate to Reviews & Approval module, click on My tasks, right click on document and click on Track Status link 
    Then System should display track status of the document
	
		Scenario: Checking the mandatory field validation while reviewing the document by reviewer
    Given My tasks under reviews & approval module, document, submit review button and submit button
    When Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Review button and submit button
    Then Mandatory message should be displayed if the user doesn't select the status and click on submit button 
	
		Scenario: Navigating to different pages in the reviewer workflow page
    Given My tasks under reviews & approval module, next and last buttons in reviewer workflow page
    When Navigate to Reviews & Approval module, click on My tasks and click on Next & Last buttons in reviewer workflow page
    Then System should navigate to different pages when reviewer click on next button
	
		Scenario: Approve the document which is reviewed by the reviewer
    Given My tasks under reviews & approval module, document, Submit Approval button, status drop down, remarks and submit button
    When Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Approval, select the status, enter the remarks and click on submit button
    Then Document should get approved by the approver and status should be set as workflow approved
	
		Scenario: Checking the mandatory field validation while approving the document by approver
    Given My tasks under reviews & approval module, document, submit approval button and submit button
    When Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Approval button and submit button
    Then Mandatory message should be displayed if the approver doesn't select the status and click on submit button

		Scenario: Check the functionality of Track Status link during document approve by approver
    Given Approver login, My tasks under reviews & approval module, document and Track Status link
    When Navigate to Reviews & Approval module as Approver, click on My tasks, right click on document and click on Track Status link 
    Then System should display track status of the document	when approver click on track status link
	
		Scenario: Check the functionality of view file link during document approve by approver
    Given Approver login, My tasks under reviews & approval module, document and View File link
    When Login as Approver, Navigate to Reviews & Approval module, click on My tasks, right click on document and click on View File link 
    Then Document content should get opened in browser with read only access for approver
	
		Scenario: Navigating to different pages in the approver workflow page
    Given My tasks under reviews & approval module, next and last buttons in approver workflow page
    When Navigate to Reviews & Approval module, click on My tasks and click on Next & Last buttons in approver workflow page
    Then System should navigate to different pages when approver click on next button
	
		Scenario: Searching the documents by the status in workflow status report
    Given Work status report page under under reviews & approval module, status drop down and view button
    When Select Status from the drop down and click on View button
    Then All the document which has same status selected in search criteria should get displayed
	
		Scenario: Searching the documents by the document type in workflow status report
    Given Work status report page under under reviews & approval module, document type drop down and view button
    When Select document type from the drop down and click on View button in work status report page
    Then All the documents which has same selected document type in search criteria should get displayed
	
		Scenario: Searching the documents by start date and due date in workflow status report
    Given Work status report page under under reviews & approval module, start date, due date and view button
    When Select the start date & due date and click on View button in work status report page
    Then All the documents which have same start date and due date should get displayed in work status report page
	
		Scenario: Check the functionality of the Cancel button in workflow status report
    Given Work status report page under under reviews & approval module and cancel button
    When Select the status,document type, start date & due date and click on Cancel button
    Then All the details selected in search criteria should get cleared on click on Cancel button in work status report page
	
		Scenario: Navigating to different pages in the search workflow status page
    Given Work status report page under under reviews & approval module, next and last buttons in search workflow status page
    When Navigate to search workflow status page and click on Next & Last buttons
    Then System should navigate to different search workflow status pages when click on next button
	
		Scenario: Checking the functionality of Track status, reviewer and approvers links in the search workflow status page
    Given Work status report page under under reviews & approval module, view button, approver, reviewer and track status link
    When Navigate to search workflow status page and click on approver, reviewer and track status link
    Then System should display reviewers list in pop-up on click of Reviewers icon
		And System should display the approvers list in pop-up  on click of approvers icon
		And System should display the track status details in pop-up on click of Track status icon