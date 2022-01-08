@DBLoginFeature 
Feature: login to tecfios loginpage with data extracted from database

@DBScenario1 
Scenario: User should be able to login valid credentials and open new account
    Given User is on the Techfios login page 
	When User enters "username" from mysql database  
	When User enters "password" from mysql database 
	And User clicks on Signin button  
	Then User should land on Dashboard page  