
Feature: As a user
  I want to register
  So that I can be registered user


#  Background, ran before all scenarios (pre conditions)
  Background:
    Given I am on the home page
    When I click on sign in
    And I click on register


    @P2
    Scenario: Should see error email error message when blank
      Given I have filled all fields
      But not the email field
      When I click on the register button
      Then I should be shown the email error message

    @P3
    Scenario: Should see error re enter email error message when blank
      Given I have filled all fields
      But not the re enter email field
      When I click on the register button
      Then I should be shown the re enter email error message

    @P4
    Scenario: Should see error password error message when blank
      Given I have filled all fields
      But not the password field
      When I click on the register button
      Then I should be shown the password error message

    @P1
    Scenario Outline: Should not accept invalid email addresses
      Given I have filled all fields
      And I have the email "<email>"
      When I click on the register button
      Then I should be shown the email invalid error message
      Examples:
        | email             |
        | invalid           |
        | @gmail.com        |
        | .com              |
        |email @ email.net  |

