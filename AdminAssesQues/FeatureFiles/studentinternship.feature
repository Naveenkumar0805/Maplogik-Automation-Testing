Feature: Students applying for internships in maplogik
Scenario: To apply for internship
Given The user is on the maplogik student login page
When the student enters username and password
Then the student should be navigated to the homepage and clicks internship
And apply for a required internship program in general and skill matching internships
