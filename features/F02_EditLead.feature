Feature: Edit Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC02_Edit lead with mandatory information
And Enter the username as <username>
And Enter the password as <password>
And Click on Login button
And Click on CRM link
And Click on Leads
And Click on Find Lead
And Enter the Firstname <firstname>
And Click on Find Leads button
And Click on first resulting lead
And Click Edit button
And Change the <companyname>
When Click on Update Button
Then Lead is Edited
Then driver close

Examples:
|username|password|firstname|companyname|
|'DemosalesManager'|'crmsfa'|'Amirthavalli'|'Cognizant'|
|'DemoCSR'|'crmsfa'|'Amirtha'|'CTS'|