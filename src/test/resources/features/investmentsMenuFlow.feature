@Smoke
Feature: Investments navigation bar flow

  @Investments @PositiveTesting
  Scenario: Investments Navigation bar
    Given the user get the url
    And the user click the "NASDAQ" in dropdown of "Investments" bar
    And the user should be directed to the URL "https://www.ii.co.uk/indices/nasdaq-composite-index"
    And the user should click the "Other Indices"
    Then the user should see the dropdown
      | FTSE 350           |
      | FTSE techMARK 100  |
      | FTSE Small Cap     |
      | FTSE All Share     |
      | FTSE AIM UK 50     |
      | FTSE AIM 100       |
      | FTSE AIM All Share |

  @NegativeTestingInvestments
  Scenario: Investments Navigation bar
    Given the user get the url
    And the user click the "NASDAQ" in dropdown of "Investments" bar
    And the user should be directed to the URL "https://www.ii.co.uk/indices/nasdaq-composite-index"
    And the user should click the "Other Indices"
    Then the user should see the dropdown
      | FTSE 350           |
      | FTSE techMARK 100  |
      | FTSE Small Cap     |
      | FTSE All Share     |
      | FTSE AIM UK 50     |
      | FTSE AIM 100       |




