
Feature: uniform login page
  I want to use this template for my feature file

   
             Scenario: login page
             Given User is on homepage
             When User enter invalid credentials

             And User click on submit button
             Then validation message appears

    
    #Scenario: login page
    #Given User is on homepage
    #When  User enter valid credentials
    #And   click on submit button
    #Then  User navigates to homepage