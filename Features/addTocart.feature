Feature: addTocart
Scenario: Verify that user is able to add
the products in the cart

Given open any browser
When user enters the url in browser
And user searches for a product 
And user clicks on add to cart 
Then user can see the product in the cart