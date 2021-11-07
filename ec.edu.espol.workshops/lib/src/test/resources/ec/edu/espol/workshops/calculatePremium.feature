#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Calcultate the insurance

  @tag1
  Scenario: The customer age is in the correct range
    Given The customer age is 36, its gender is "M" and its marital status is "not married"
    When Calculate the insurance2
    Then Return 2000

  @tag2
  Scenario Outline: The car insurance is 2000 or not?
    Given The customer age is <agecustomer>, its gender is <sexcustomer> and its marital status is <maritalstatus>
    When Calculate the insurance2
    Then Return <number>

    Examples: 
      | agecustomer | sexcustomer   | maritalstatus    | number |
      | 36          |     "M"       | "not married"    | 2000   |
      | 18          |     "F"       | "married"        |  -1    |

	@tag3
  Scenario: The customer is underage
    Given A male person with 20 years old
    When Calculate the insurance
    Then Show -1

  @tag4
  Scenario Outline: The customer is underage or is not underage
    Given A male person with <age> years old
    When Calculate the insurance
    Then Show <result>

    Examples: 
      | age | result  |
      | 20  |   -1    |
      | 21  |   500   |
    
  @tag5    
  Scenario: The customer is very old
    Given the customer age is 81
    When calculate the insurance3
    Then return -1

  @tag6
  Scenario Outline: The customer is very old or is not
    Given the customer age is <age>
    When calculate the insurance3
    Then return <result>

    Examples:
    | age |   result  |
    | 81  |     -1    |
    | 80  |    300    |