Feature: test login functionality
  Scenario: to login with valid email and valid password
    Given user open application allow location go to myAccount screen and click on sing in button
    When enter valid email valid password and click on sing in button
    Then go to myAccount page

  Scenario: to login with invalid email and valid password
    Given user open application allow location go to myAccount screen and click on sing in button
    When enter invalid email and valid password and click on sing in button
    Then message invalid email

  Scenario: to login with valid email and invalid password
    Given user open application allow location go to myAccount screen and click on sing in button
    When enter valid email and invalid password and click on sing in button
    Then message invalid password

