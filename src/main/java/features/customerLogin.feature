Feature: Customer login

  Scenario Outline: Customer login
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/login
    When I click Customer Login button
    When I select <userSelect> in the YourName label
    When I click Login button
    Then I verify Harry Potter is already selected in the YourName label

    When I click DepositTop button
    When I type Amount to be Deposited as <numberDep>
    When I click DepositBottom button
    Then I verify Deposit Successful

    When I click WithdrawTop button
    When I type Amount to be Withdrawn as <numberWithd>
    When I click WithdrawBottom button
    Then I verify Withdraw successful

    When I click Transaction button
    Then I verify all of information of Deposit display at Transaction page
    Then I verify all of information of Withdraw display at Transaction page
    When I click Back button

    When I click Logout button
    When I click Home Button

    Examples:
      | userSelect   | numberDep| numberWithd|
      | Harry Potter | 20       | 15         |