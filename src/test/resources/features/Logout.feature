Feature:  As a user, I should be able to logout from the library app.

  @logOut
  Scenario: As a user, I should be able to logout from the library app.
    Given user is on the home page
    When user press logOut button
    Then user see the login page

