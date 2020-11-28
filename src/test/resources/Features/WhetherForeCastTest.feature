
Feature: Whetherforecast

  @t
  Scenario: Comparing the temprature of API and UI responses
    Given Open the  Browser <Browser> with URL <URL>
    
    
     Examples: 
      | Browser| URL                  |
      |"Chrome"|"https://www.ndtv.com"| 
      