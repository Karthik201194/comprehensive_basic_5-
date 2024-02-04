Feature: User Login

  Scenario Outline: Login to the application with different credentials
    Given User is on the login page at "https://www.saucedemo.com/"
    When User enters "<username>" and "<password>" and clicks Submit
    Then User should see the "<result>" page title when he logs in using correct credentials
    And User should see the "<result>" page where error message is shouwn if he logs in using invalid credentials

    Examples: 
      | username          | password     | result                                        |
      |  locked_out_user  | secret_sauce | Expected Title for Successful Login           |
      | Karthik           | Karthik      | Expected Error Message for Unsuccessful Login |
