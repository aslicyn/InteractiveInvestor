@Smoke
Feature: Investments navigation bar flow

  @News @PositiveTesting
  Scenario: Investments Navigation bar
    Given the user get the url
    And the user click the "" in dropdown of "News" bar
    And the user should be directed to the URL "https://www.ii.co.uk/stock-market-news"
    And the user scroll down the page till "Meet the experts" and click "See All"
    Then the user should see the 24 experts
      | Andrew Hore      |
      | Andrew Pitts     |
      | Ben Hobson       |
      | Douglas Chadwick |
      | Dzmitry Lipski   |
      | Edmond Jackson   |
      | Graeme Evans     |
      | John Burford     |
      | Kyle Caldwell    |
      | Lee Wild         |
      | Moira O'Neill    |
      | Rebecca O'Connor |
      | Richard Beddard  |
      | Richard Hunter   |
      | Tom Bailey       |
      | Rodney Hobson    |
      | Jeff Prestridge  |
      | Myron Jobson     |
      | Ian Cowie        |
      | Dinah Wolf       |
      | Alex Sebastian   |
      | Nina Kelly       |
      | Alistair Strang  |
      | Keith Bowman     |

  @NegativeTestingNews
  Scenario: Investments Navigation bar
    Given the user get the url
    And the user click the "" in dropdown of "News" bar
    And the user should be directed to the URL "https://www.ii.co.uk/stock-market-news"
    And the user scroll down the page till "Meet the experts" and click "See All"
    Then the user should see the 24 experts
      | Andrew Hore      |
      | Andrew Pitts     |
      | Ben Hobson       |
      | Douglas Chadwick |
      | Dzmitry Lipski   |
      | Edmond Jackson   |
      | Graeme Evans     |
      | John Burford     |
      | Kyle Caldwell    |
      | Lee Wild         |
      | Moira O'Neill    |
      | Rebecca O'Connor |
      | Richard Beddard  |
      | Richard Hunter   |
      | Tom Bailey       |
      | Rodney Hobson    |
      | Jeff Prestridge  |
      | Myron Jobson     |
      | Ian Cowie        |
      | Dinah Wolf       |
      | Alex Sebastian   |
      | Nina Kelly       |
      | Alistair Strang  |









