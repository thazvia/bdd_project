Feature: Techfios login functionality validation 

@Scenario1 @smoke
Scenario:  User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	
@Scenario2	
Scenario: User should be able to login with invalid username credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	
@Scenario3	@smoke
Scenario: User should be able to login with invalid password credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc1234" 
	And User clicks on Signin button 
	Then User should land on Dashboard page