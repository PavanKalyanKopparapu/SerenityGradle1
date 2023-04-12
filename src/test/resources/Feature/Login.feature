Feature: Login to HRM

  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on Home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully

  @InvalidCredentials1
  Scenario: Login with inavlid credentials
    Given  User is on Home page1
    When User enters username "admin"
    And User enters password "admin"
    Then User should not be able to login successfully

  @InvalidCredentials2
  Scenario: Login with invalid Username
    Given User is on Home page2
    When User enters username as2 "admin"
    And User enters password as2 "admin123"

  @InvalidCredentials3
  Scenario: Login with invalid Password
    Given User is on Home page3
    When User enters username as3 "Admin"
    And User enters password as3 "admin@123"

  @InvalidCredentials4
  Scenario: Login without Username and Password
    Given Username is on Home page4
    When User enters username as4 ""
    And User enters password as4 ""
