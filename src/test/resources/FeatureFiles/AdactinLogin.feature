Feature: To validate login fuctionality

Scenario Outline: To verify user is able to login with incorrect credentials

Given User has to be there in Adactin login page

When User has to fill username "<username>" and password "<password>"field

And User has to click login button

Then verify user is navigating to login attempt page

Examples:
	|username|password|
	|vedha@gmail.com|987456123|
	|raji.p66@gmail.com|789456123|
	|kannan608@yahoo.com|9442432207|