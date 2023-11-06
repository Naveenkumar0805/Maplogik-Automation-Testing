Feature: Students taking assesments in maplogik
Scenario: To write assesment
Given The user is on the student login page
When the student enters the username and password
Then the student should be navigated to the homepage and clicks skill enhancement
And the student should select the course and proceed to the payment
When the student clicks start training and start the assesment
Then answer the questions provided and submit the exam
