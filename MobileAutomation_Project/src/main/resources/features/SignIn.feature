Feature:Login feature
  Scenario:"User Log In with valid Data"
    Given "User open app "
    Given "Allow their location and open home screen"
    Given "User open myAccount screen and click on Sign In button"
    When "User fill email as  and Password as and click on Sign in button"
    Then "Log in Message"
