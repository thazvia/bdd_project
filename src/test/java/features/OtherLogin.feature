@otherLoginFeature @smoke
Feature: Other Techfios login functionality validation

@OtherScenario1
Scenario Outline:  User should be able to login valid credentials 
	Given User is on the Techfios login page  
	When User enters password as "abc123"
	When User enters username as "demo@techfios.com"   
	And User clicks on Signin button  
	Then User should land on Dashboard page

Examples:
	|username|password|
	|demo@techfios.com|abc123|
#	|demo@techfios.com|abc124|
#	|demo2@techfios.com|abc123|
#	|demo2@techfios.com|abc124|