Feature: Place the order for products
@PlaceOrder
Scenario Outline: Search experience for product in both Home and Offers page
Given user is on Greenkart landingpage
When user searched with shortname <Name> and extracted actual name of product
And Added "3" items to the selected product to cart
Then user proceeds to checkout  and validate the <Name> items in checkoutpage
And verify user has the ability to enter promo code and place the order

Examples:
|Name|
|tom|
|beet|