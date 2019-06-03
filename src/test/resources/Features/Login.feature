Feature: User is able to use the features of the website.
  Scenario: User wants to register in the demo.nop commerce successfully
    Given User is on the homepage and has the valid credentials
    When user fills in the registration form by selecting gender as “Female”
    And user enters First name "Payal"
    And user enters Last name “Patel”
    And user selects “15” as date of birth from drop down menu
    And user selects “October” as month of birth from drop down menu
    And user selects “1983” as year of birth from drop down menu
    And user enters autogenerated unique email address “payal.....@gmail.com
    And user enters company name “Patel’s Corner”
    And user deselects Newsletter checkbox
    And user enters password as “test123”
    And user enters password confirm as “test123”
    And user clicks on register link
    Then user should be registered and see welcome message
