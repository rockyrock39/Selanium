Feature: Place Order

@first
  Scenario: Search single item
  	Given User is on Home page
  	When User Search an item "MacBook Air"
  	Then  Item must be listed

  Scenario: Add item to cart
  	Given User Should be on search Result page
  	When User add item to cart
  	Then  Item must be added
 @last 	
   Scenario: Checkout Order
  	Given User do checkout
  	Then  Should nevigate to Checkout page
  	And   user should fill out the form and click buy
  	
  	|name|surname|address|zipcode|city|company|
  	|Rahul|Sarma|gurugram|122101|gurugram|tcs| 
  	