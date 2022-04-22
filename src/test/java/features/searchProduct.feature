Feature: Search and Place the order for Products

@Offerspage
Scenario Outline: Search experience for product in both Home and Offers page
Given user is on Greenkart landingpage
When user searched with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offerspage
And validate productname in offerspage matches with landingpage
Examples:
|Name|
|Tom|
|Beet|
