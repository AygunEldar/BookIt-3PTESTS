Feature: Verify the info from all environment


  Scenario: get the info from UI
    Given user logs in with "sbirdbj@fc2.com" and "asenorval"
    When user navigates to mySelf page
    Then  user gets UI info

  @wip
  Scenario: Get the info from API

    When user logs in BookIT API using "sbirdbj@fc2.com" and "asenorval"


