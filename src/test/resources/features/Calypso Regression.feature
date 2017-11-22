@version:1.6
Feature: 
  Regression

Scenario: Adding Trades 
 Given I set up the enviroment
 Given the following trades
  | name | status    |
  | Blah | sdfasdfasdf |
  | asdfads | sdfasdfasdf |
  | asdfasd | sdfa |
 When I submit these trades to both environments
 Then all trades are successfully entered   


Scenario: Performing Actions on trades
  Given the following actions 
  |Trade|action|
  |asdfas|asdfas|
  |asdfas|asdfasd|
  |asdfasd|asdfasdf|
  When I submit these actions to both environments
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
    
