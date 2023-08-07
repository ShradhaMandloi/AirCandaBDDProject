Feature: AirCannda Functionality
Scenario: Verification Of Title 
Given User should be at landing page
Then Title of the page should contains "Homepage"

Scenario: Verify signIn icon
Given User should be at landing page
Then Signin icon should get display 
 

Scenario: Search Flight
Given User should be at landing page
When User enter the name of to city as "Toronto"
And Enter Departure with return date 
And Click on search flight button 




