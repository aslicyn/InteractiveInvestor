@Smoke
Feature: Pensions Navigation bar flow

  @Pensions @PositiveTesting
  Scenario: Pensions Navigation bar
    Given the user get the url
    And the user click the "Options at Retirement" in dropdown of "Pensions" bar
    And the user should be directed to the URL "https://www.ii.co.uk/ii-accounts/sipp/retirement"
    Then the user should see these links
      | Withdrawing money from your SIPP |
      | FAQs                             |
      | Pay no SIPP fee for 6 months     |
    Then the user should see the buttons
      | Open a SIPP           |
      | Transfer your pension |

  @NegativeTestingPensions
  Scenario: Pensions Navigation bar
    Given the user get the url
    And the user click the "Options at Retirement" in dropdown of "Pensions" bar
    And the user should be directed to the URL "https://www.ii.co.uk/ii-accounts/sipp/retirement"
    Then the user should see these links
      | Withdrawing money from your SIPP |
      | FAQs                             |
    Then the user should see the buttons
      | Open a SIPP           |
      | Transfer your pension |



