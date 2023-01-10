Feature: aLogin
        As an Admin,
        I should be able to enter below details in the loginBox to login on clicking submitButton
        i. email
        ii. Password

  Scenario: Test Case Id: TC_BRNBS-01_aLogin_01
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens URL "https://accounts.google.com/"
    And Close the browser