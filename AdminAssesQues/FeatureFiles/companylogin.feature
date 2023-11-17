Feature: Post the internship programs in maplogik
@ApproveInternshipTag
Scenario: To post the internship details
Given The user is on the company login page
When the user enters the username to generate OTP
And enters the OTP and click login
Then the user should be navigated to maplogik dashboard and clicks internship
And the user clicks post internship and enter the details and click on post


Scenario: To check the availability of interns in a particular department
When The user selects the course and program
And selects the department to check the availability of interns