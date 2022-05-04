Feature: Delete Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC04_Delete lead with mandatory information
And Enter the username as <username>
And Enter the password as <password>
And Click on Login button
And Click on CRM link
And Click on Leads
And Click on Find Lead
And Click on Phone
And Enter <phonenumber>
And Click on Find Leads button
And Click on first resulting lead
When Click on Delete Button
Then Lead is Deleted
Then driver close

Examples:
|username|password|phonenumber|
|'DemosalesManager'|'crmsfa'|'99'|
|'DemosalesManager'|'crmsfa'|'99'|