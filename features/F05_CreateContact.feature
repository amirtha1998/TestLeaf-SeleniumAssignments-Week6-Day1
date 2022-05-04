Feature: Create Contact Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC05_Create Contact lead with mandatory information
And Enter the username as <username>
And Enter the password as <password>
And Click on Login button
And Click on CRM link
And Click on Contacts
And Click on Create Contact
And Enter FirstName <firstname>
And Enter LastName as <lastname>
And Enter department name <departmentname>
And Enter the <description>
And Enter email <email>
When Click on Create Button
Then Created Contact successfully
Then driver close

Examples:
|username|password|firstname|lastname|departmentname|description|email|
|'DemosalesManager'|'crmsfa'|'Amirthavalli'|'S'|'Testing'|'Selenium Mar 19 Batch'|'amirtha@gmail.com'|
|'DemoCSR'|'crmsfa'|'Amirtha'|'S'|'Automation Testing'|'Selenium Mar 19 Batch'|'amirtha98@gmail.com'|