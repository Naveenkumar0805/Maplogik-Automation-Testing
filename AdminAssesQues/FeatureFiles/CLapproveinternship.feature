Feature: Approve the internship programs in maplogik
Scenario: To approve the internship
Given The user is on the company page login
When the user enters username to generate OTP
And enters the OTP given and click login
Then the user should be navigated to maplogik dashboard page and clicks internship
And the user clicks approve internship and check the interns applied
