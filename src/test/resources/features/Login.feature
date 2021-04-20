Feature: As a user, I should be able to login to the library app.

  @login
  Scenario: User should be able to login as student
    Given student is on login page
    When student logging in with valid credentials
    Then student can see "<books>" page

    @login
  Scenario: User should be able to login as librarian
    Given librarian is on login page
    When librarian logging in with valid credentials
    Then librarian can see "<dashboard>" page