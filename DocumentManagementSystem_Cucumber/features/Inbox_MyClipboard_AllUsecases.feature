Feature: Checking all the functionalities of My Clipboard module

		Scenario: Adding documents to the favourities list
    Given My Clipboard module, my favourities section and favourities page
    When Click on Inbox link, click on star icon on the document and navigate to the My favourite module 
    Then System should display all the documents which are marked as favourite by current user
	
		Scenario: Removing documents from the favourities list
    Given My Clipboard module, my favourities section, favourities page and star icon
    When Click on Inbox link, navigate to the My favourite module and click on star icon on the document 
    Then System should remove the document from the favourite list after clicking on star icon
	
		Scenario: Navigating to different pages in my favourities screen
    Given My Clipboard module module, next and last buttons in my favourities page
    When Navigate to my favourities pages and click on Next & Last buttons
    Then System should navigate to different favourities pages when user clicks on next and back button
	
		Scenario: Add additional fields on the my favourite grid
    Given My Clipboard module module, file link and additional fields
    When Navigate to my favourities pages, click on file link and select the additional fields
    Then System should add the additional fields on the grid and display the details for those fields
	
		Scenario: Editing the document details from favourite page
    Given My Clipboard module module, edit link on the favourite grid and checkbox to select the document
    When Navigate to favourite page, select the required file on the favourite grid, click on edit link, change the details and click on update button
    Then System should allow user to change the details and changes should get reflected for that document
	
		Scenario: Checking the validation message for not selecting the document and clicking on edit link
    Given My Clipboard module, edit link on the favourite grid 
    When Navigate to favourite page, dont select the file and click on edit link
    Then System should display the validation message for not selecting the document and clicking on edit link on the favourite page
	
		Scenario: Entering the valid email ids and sending an email successfully from favourite page
    Given My Clipboard module module, checkbox to select the document, Mail link on the favourite grid
    When Navigate to favourite page, select the required file, click on mail link, provide the email ids and click on Send button in favourite page
    Then Email should sent to the respective email id successfully from favourite page
		
		Scenario: Check the recently checked-out documents by the current user
    Given My Clipboard module module, recent section, right click, checked-out, check-in button
    When Navigate to Inbox page, right click on any file, do check-out & check-in and navigate to recent section
    Then System should display all the documents which are checked-out recently by current user
	
		Scenario: Add additional fields on the recents grid
    Given My Clipboard module module, file link and additional fields link on the recents grid
    When Navigate to recents page, click on file link and select the additional fields on the recent grid
    Then System should add the additional fields on the recent grid and display the details for those fields
	
		Scenario: Editing the document details from recent page
    Given My Clipboard module module, edit link on the recents grid and checkbox to select the document
    When Navigate to recents page, select the required file, click on edit link, change the details and click on update button
    Then System should allow user to change the details and changes should get replected for that document
	
		Scenario: Checking the validation message for not selecting the document and clicking on edit link
    Given My Clipboard module, edit link on the recents grid 
    When Navigate to recents page, dont select the file and click on edit link
    Then System should display the validation message for not selecting the document and clicking on edit link
	
		Scenario: Entering the valid email ids and sending an email successfully
    Given My Clipboard module module, checkbox to select the document, Mail link on the recents grid
    When Navigate to recents page, select the required file, click on mail link, provide the email ids and click on Send button
    Then Email should sent to the respective email id successfully
	
		Scenario: Uploading the new document successfully
    Given Inbox module, Upload document link and document to upload
    When Navigate to inbox page, click on upload link, select the document from the system and click on Save button
    Then Document should get upload successfully and should be visible in the inbox 
	
		Scenario: Checking the mandatory field validation for document upload
    Given Inbox module, Save button
    When Navigate to inbox page, click on upload link and click on Save button
    Then Validation message should be displayed for not selecting the document to upload 
	
		Scenario: Add additional fields on the Inbox grid
    Given Inbox module, file link and additional fields link on the inbox grid
    When Navigate to Inbox page, click on file link and select the additional fields on the Inbox grid
    Then System should add the additional fields on the Inbox grid and display the details for those fields
	
		Scenario: Navigating to different pages in the Inbox page
    Given Inbox module, next and last buttons in Inbox page
    When Navigate to Inbox pages and click on Next & Last buttons
    Then System should navigate to different Inbox pages when click on next button
	
		Scenario: Checking validation messages for not selecting the document for different scenarios
    Given Inbox module, MoveTo, Edit, Remove and Mail link
    When Navigate to Inbox page and click on MoveTo, Edit, Remove and Mail link
    Then System should force user to select the document and display the validation messages
	
		Scenario: Removing the document successfully
    Given Inbox module, uploaded document and Remove link
    When Navigate to Inbox page, select the document and click on Remove link
    Then Uploaded document should get removed successfully and should not display in the inbox list
	
		Scenario: Editing the document details from Inbox page
    Given Inbox module, checkbox to select the document and edit link on the Inbox grid
    When Navigate to Inbox page, select the required file, click on edit link, change the details and click on update button
    Then System should allow user to change the details from inbox page and changes should get reflected for that document
	
		Scenario: Entering the valid email ids and sending an email successfully
    Given Inbox module, checkbox to select the document, Mail link on the Inbox grid
    When Navigate to Inbox page, select the required file, click on mail link, provide the email ids and click on Send button
    Then Email should sent to the respective email id successfuly
	
		Scenario: Moving the document from inbox to department folder successfully
    Given Inbox module, checkbox to select the document, MoveTo link on the Inbox grid and department folder
    When Navigate to Inbox page, select the required file, click on MoveTo link, right click on required department folder and click on paste link
    Then Document should get moved from Inbox to required department folder
	
		Scenario: View the document details on the browser
    Given Inbox module, Right click and View link
    When Navigate to Inbox page, right click on any document and click on View link
    Then System should display the document content on the browser with read only access when user click on view link on the inbox page
	
		Scenario: Renaming the document title from the inbox page
    Given Inbox module, Right click and Rename link
    When Navigate to Inbox page, right click on any document, click on Rename link, change the document name and click on Rename butotn
    Then Document title should get changed as per the changes done by the user in the inbox page
	
		Scenario: Downloading the document to the system in the inbox page
    Given Inbox module, Right click and Download link
    When Navigate to Inbox page, right click on any document and click on download link
    Then Document should get downloaded into the user system from inbox page
	
		Scenario: Checking the history of the document 
    Given Inbox module, Right click and View history link
    When Navigate to Inbox page, right click on any document and click on View History link
    Then System should display complete history of the document in the inbox page

		Scenario: Deleting the document 
    Given Inbox module, Right click and delete link
    When Navigate to Inbox page, right click on any document and click on Delete link
    Then Document should get deleted and confirmation message should be displayed in the inbox page
	
		Scenario: Checking the functionality of check-out and check-in features 
    Given Inbox module, Right click, check-out and check-in link
    When Navigate to Inbox page, right click on any document, click on check-out link and check-in link
    Then Clicking on check-out link, document should get opened and click of check-in, changes done in the document should get saved in the inbox page
	
		Scenario: Moving the document from inbox to department using right click MoveTo option
    Given Inbox module, MoveTo link on right click and department folder
    When Navigate to Inbox page, right click on any document and click on MoveTo link, right click on required department folder and click on paste link
    Then Document should get moved from Inbox to other department folder using right click MoveTo option