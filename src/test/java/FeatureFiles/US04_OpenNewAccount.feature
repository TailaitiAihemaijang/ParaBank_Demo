Feature: Open New Account

  Background: Login
    Given Navigate To Para Bank
    And Enter Data in Text Box
      | logUserName | karahan  |
      | logUserPass | asdf0987 |
    And Click On The Element
      | logBtn |
    And Verification Is In Progress
      | succesly | Log Out |

  Scenario: Open New Account
    Given Click On The Element
      | openNewAcc |
    And Select On The Menua
      | typeAcc | 1 |
    And Click On The Element
      | openNewAccBtn |
And Verification Is In Progress
  | newAccountSucc | Account Opened! |