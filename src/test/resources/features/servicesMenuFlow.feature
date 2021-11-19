@Smoke
Feature: Services navigation bar flow

  @Navigation @PositiveTesting
  Scenario: Service Navigation bar
    Given the user get the url
    And the user click the "Trading Account" in dropdown of "Services" bar
    And the user should be directed to the URL "https://www.ii.co.uk/ii-accounts/trading-account"
    Then the user should see these links
      | Benefits of our trading account      |
      | Fees and charges                     |
      | An investment platform you can trust |
      | Choosing investments                 |

   @NegativeTestingNavigation
  Scenario: Service Navigation bar
    Given the user get the url
    And the user click the "Trading Account" in dropdown of "Services" bar
    And the user should be directed to the URL "https://www.ii.co.uk/ii-accounts/trading-account"
    Then the user should see these links
      | Benefits of our trading account      |
      | Fees and charges                     |
      | An investment platform you can trust |


