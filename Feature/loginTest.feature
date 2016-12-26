Feature:Login

Scenario:Successful login with Valid credentials
Given user is on home page
When User enters User Id and password and selects landing page
then User should Move to home page

Scenario:Successful LogOut
	When User LogOut from the Application
