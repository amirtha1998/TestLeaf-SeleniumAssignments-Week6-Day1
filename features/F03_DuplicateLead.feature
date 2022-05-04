Feature: Duplicate Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC03_Duplicate lead with mandatory information
And Enter the username as <username>
And Enter the password as <password>
And Click on Login button
And Click on CRM link
And Click on Leads
And Click on Find Lead
And Enter the Firstname <firstname>
And Click on Find Leads button
And Click on first resulting lead
And Click on DuplicateLead Button
When Click on Create Button 
Then Lead is Duplicated
Then driver close

Examples:
|username|password|firstname|
|'DemosalesManager'|'crmsfa'|'Amirthavalli'|
|'DemoCSR'|'crmsfa'|'Amirtha'|