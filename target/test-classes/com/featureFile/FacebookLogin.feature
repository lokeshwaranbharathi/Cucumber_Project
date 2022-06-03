Feature: facebook login functionality
Scenario: login to facebook application
 Given user launch facebook application
 When user enter "abc@gmail.com" in email field
 And user enter "1254kjh" in password field
 And user click login button
 Then user should land into facebook homepage
 

 

