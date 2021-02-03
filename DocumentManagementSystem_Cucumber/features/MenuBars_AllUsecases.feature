Feature: Checking all the Menu Bars controls functionalities

		Scenario: Uploading the documents from upload file option under menu control
    Given Menu controls, Upload file link and document to upload
    When Click on Inbox link, click on File menu control, click on upload file link, select the document to upload and click on Save button
    Then Document should get uploaded in the inbox folder and should be displayed in the inbox
	
		Scenario: Checking the validation messages for uploading same document from upload file menu control
    Given Menu controls, Upload file link, document to upload and validation messages
    When Click on Inbox, Click on File menu control, click on upload file link, select the document to upload and click on Save button
		Then System should display the validation message for uploading same document into the system
	
		Scenario: Checking the validation messages for uploading document without selecting source folder
    Given Menu controls, Upload file link, document to upload and validation messages for not selecting source folder
    When Click on File menu control, click on upload file link, select the document to upload and click on Save button
		Then System should display the validation message while uploading the document without selecting the source folder
	
		Scenario: Checking the validation messages for not providing the mandatory details for file upload
    Given Menu controls, Upload file link and validation messages for not selecting document to upload
    When Click on File menu control, click on upload file link and click on Save button
		Then System should display the validation message for not selecting the document to upload
	
		Scenario: Checking the functionality of Refresh menu control
    Given Menu controls and refresh menu control
    When Click on File menu control and click on Refresh link 
		Then System should refresh the current page and display the Dashboard page as it is the default page
	
		Scenario: Checking the functionality of LogOut menu control
    Given Menu controls and LogOut menu control
    When Click on File menu control and click on LogOut link 
		Then System should logout from current session and should navigate to the login page
	
		Scenario: Viewing the file content in the browser with read-only access from file view menu control
    Given View Menu controls, file view menu control and document to view 
    When Click on Inbox link, Click on View menu control and click on file view link 
		Then System should display the content of selected file in the browser with read-only access
	
		Scenario: Checking the validation messages for not selecting the document and clicking on File view menu control
    Given View Menu controls, file view menu control and validation message 
    When Click on Inbox link, dont select the document checkbox, Click on View menu control and click on file view link 
		Then System should display validation message for not selecting the document checkbox
	
		Scenario: Viewing the file details from file details menu control
    Given View Menu controls, file details menu control and document to view the details
    When Click on Inbox link, select the document checkbox, Click on View menu control and click on file details link 
		Then System should display the file information about the selected document 
	
		Scenario: Checking the validation messages for not selecting the document and clicking on File Details menu control
    Given View Menu controls, File Details menu control and validation message 
    When Click on Inbox link, dont select the document checkbox, Click on View menu control and click on file details link 
		Then System should display validation message for not selecting the document checkbox and clicking on file details link
	
		Scenario: Viewing the file history from View History menu control
    Given View Menu controls, View History menu control and document to view the history
    When Click on Inbox link, select the document checkbox, Click on View menu control and click on view history link 
		Then System should display the history of the selected document 
	
		Scenario: Checking the validation messages for not selecting the document and clicking on View History menu control
    Given View Menu controls, View History menu control and validation message 
    When Click on Inbox link, dont select the document checkbox, Click on View menu control and click on view history link 
		Then System should display validation message for not selecting the document checkbox and clicking on View History link
	
		Scenario: Viewing the FAQ's updated in the website
    Given Help Menu controls and FAQ menu control 
    When Click on Help menu control and click on FAQ link 
		Then System should display the updated FAQ's in the website 
	
		Scenario: Viewing the User Manual updated in the website
    Given Help Menu controls and User Manual menu control 
    When Click on Help menu control and click on user manual link 
		Then System should display the updated user manual in the website 

		Scenario: Checking the functionality File Protector feature
    Given Tools Menu controls, document and file protector link
    When Click on Inbox, select the document, click on Tools menu control, click on file protector link, enter the password and click on Save
		Then Document should be password protected and any action on the document should not happen if the password is not entered 
	
		Scenario: Opening the password protected file
    Given Tools Menu controls, document, file protector link and password 
    When Click on Inbox, select the password protected document, click on edit link, enter the password and click on Submit
		Then Document edit form should get opened after entering the valid password
	
		Scenario: Opening the password protected file with invalid password
    Given Tools menu controls, document, file protector link and invalid password 
    When Click on Inbox, select the password protected document, click on edit link, enter the invalid password and click on Submit
		Then Document edit form should not get opened if user enters the invalid password and should throw an error message
	
		Scenario: Protecting the file with password which is already password protected
    Given Tools menu controls, file protector link, password protected document and validation message
    When Click on Inbox, select the password protected document and click on file protector link under tools menu bar
		Then System should display the validation message if the user tries to protect the file which is already password protected
	
		Scenario: Searching the document by its name and content at global level
    Given Gloabal search option, document name and content
    When Enter the document name or content and click on search icon
		Then Documents list should get displayed if the entered text matches with the document name or its content
	
		Scenario: Searching the document by invalid name at global level
    Given Gloabal search option, invalid document name and search icon
    When Enter the invalid document name and click on search icon
		Then Document should not get displayed on the search list and it should display empty record text