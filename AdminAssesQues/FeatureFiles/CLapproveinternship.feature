Feature: Approve the internship programs in maplogik
Scenario: To approve the internship of applied candidates
Given The user is on the company page login
When the user enters username to generate OTP
And enters the OTP given and click login
Then the user should be navigated to maplogik dashboard page and clicks internship
When the user select a particular internship to view the candidates applied
Then select the right candidate fit for the internship 
And approve the internship of the selected candidate


Scenario: To approve the internship and view the details 
And the user clicks approve internship and check the interns applied


