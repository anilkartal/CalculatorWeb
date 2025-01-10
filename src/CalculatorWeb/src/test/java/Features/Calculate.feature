  Feature:  Calculate Test Case


Scenario: Calculator Login
  Given User at home page
  When Load user and Password

Scenario: Open Calculator
  Given open Calculator Button
    Scenario Outline: Calculator
      Given Calculate
      When ResultCheckTrue <int>
      When ResultCheck <int>
      Examples:
        | int  |
        | 1 |
        | 200 |