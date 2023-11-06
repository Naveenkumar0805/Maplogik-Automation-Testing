Feature: Post the internship programs in maplogik
Scenario: To post the internship details
Given The user is on the company login page
When the user enters the username to generate OTP
And enters the OTP and click login
Then the user should be navigated to maplogik dashboard and clicks internship
And the user clicks post internship and enter the details and click on post