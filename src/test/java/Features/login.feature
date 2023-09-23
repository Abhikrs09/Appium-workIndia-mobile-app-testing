@TestStart
Feature: Verify workindia app functionality

Background: App launching before all scenarios
Given  workindia app is launched


@Test1
Scenario Outline: Register functionality
When User click on continue
Then User click on ok
When user enters name "<name>"
And user enters "<Mobile_Number>" 
Then User click on submit button
Then user choose the city
And user enter "< location>"
Then user click on the submit button
Given user have to select his Gender
Then user have to select his Qualification
Then user have to select his School Medium Was
Then user have to select how fluent his English is
Then user have to select his Fresher/Experience
Then user have to select his age 
Then user have to select his profession intrest
Then user click on the intrest submit button
Then user select his Technical skill
Then user choose his option
Then user click on Submit button
Then user choose his Degree
Then user click on Desired degree
Then user click on submits button
Then user choose his language
Examples:

|name|Mobile_Number|My nearest location|  
|Abhishek|7903907591|AIIMS |

@Test2 
Scenario: Seach job near by locatoin
When User have to click on filter 
When User have to choose Interesed aria for job
Then click on apply





@Test3
Scenario Outline: Sreach Near By Job and save it and Check Favorite Job List
And User have to search near location for job "<location>" 
When Use have to Select Jobs
Then User Have to click on favorite button to save job for later
And User have to go back to select another job
Then User have to select another job
And User have to click on favorite button
When User have go back for cheking Favorite Job List
Then Click on profile 
And Click on my favorite job 
Examples:
|location|
|connaught palace|