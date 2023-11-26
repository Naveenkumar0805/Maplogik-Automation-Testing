Feature: checking the status of the Students applied for internships
Scenario: To check the internship status
Given The user is on the maplogik college login page
When the user enters the username and password in college login page
Then the student should be navigated to the homepage and clicks internship status
And clicks general internship to check the intern details
And clicks skill matching internship to check the intern details

