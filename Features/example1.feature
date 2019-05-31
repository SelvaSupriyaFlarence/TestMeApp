Feature: Login Test
-Description(optional):Registered user can be login into TestMeApp using proper credentials
-Pre-Requiiste: Registration module should be completed
Example Mapping:

Bussiness Rules1: Signin line
Acceptance criteria:Register user should be logged in success to TestMeApp
Example:john wish to purchase an item from TestMeApp
Scenario: Login with valid credentials
Given user launch chrome browser And enter TestMeApp URL
When user enter username in username field
When user enter password in password field
When user clicks on OK button
Then verify result