@version:1.6
Feature: 
  Regression

Scenario: Adding Trades 
Given I set up the enviroment
 And I add the following trades to both environments
    | name | status    |
    | Blah | sdfasdfasdf |
    | asdfads | sdfasdfasdf |
    | asdfasd | sdfa |
 Then all trades are successfully entered   


Scenario: Performing Actions on trades
   When I perform the following actions 
    |Trade|action|
    |asdfas|asdfas|
    |asdfas|asdfasd|
    |asdfasd|asdfasdf|
     Then all actions are successfully completed


  Scenario Outline: Account status matches
   When I trigger an end of day report on 1
   And I trigger an end of day report on 2
   Then account <account> has the same position on both environments
  Examples:
	| account | 
	| 123a | 
	| 1234a |
	| 12345a|
    
