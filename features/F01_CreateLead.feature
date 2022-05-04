Feature: Create Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC01_Create new lead with mandatory information
And Enter the username as <username>
And Enter the password as <password>
And Click on Login button
And Click on CRM link
And Click on Leads
And Click on CreateLead
And Enter Company name as <companyname>
And Enter FirstName as <firstname>
And Enter LastName <lastname>
When Click on Create Button
Then Lead is Created
Then driver close

Examples:
|username|password|companyname|firstname|lastname|
|'DemosalesManager'|'crmsfa'|'Testleaf'|'Amirthavalli'|'S'|
|'DemoCSR'|'crmsfa'|'Testleaf'|'Amirtha'|'S'|
