Feature: End to End UI Test
         DEMO PET STORE: https://www.demoblaze.com/index.html

  
Scenario: the end user can add products to art and purchase
					Given the end user is on home page
					When the end user navidates to laptops
					Then the laptops page is displayed
					When the end user clicks on first laptop sony
					Then the sony laptop page is displayed
					When the end user clicks on Add to Cart button
					And  the end user accepst the pop up
					Then the laptop is added to cart
					When the end user clicks on home page icon
					Then the home page is displayed again
					When the end user navidates to laptops2
					Then the laptops page is displayed2
					When the end user clicks on second laptop dell
					Then the dell laptop page is displayed
					When the end user clicks on Add to Cart button2
					And  the end user accepst the pop up2
					Then the laptop is added to cart2
					When the end user clicks on Cart link
					Then the shopping cart page is displayed
					When the end user clicks on Delete link for second laptop dell
					Then the dell laptop is deleted
					When the end user clicks on Place Order
					And fill in the form
					And clicks on Purchase
					Then capture amount and purchase id
					And assert the amount
					When the end user clicks on OK
					Then the home page is displayed again2
					