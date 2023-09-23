@TestEnd
Feature: Verify workindia app functionality

Background:
Given Workindia app is launched



@Test4
Scenario Outline: Edit profile and Change Language
When User click on profile button
And User select My profile option 
Then User click on edit button
Then User enter email address "<email>"
And User click on done button
Then User click on update profile
When User click on profile 
And User select change language option
Then User select language

Examples:
|email|
|abhi7878@gmail.com|
@Test5
Scenario: user click on tips
Then user click on tip button
Then user click on like button