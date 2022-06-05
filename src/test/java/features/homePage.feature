@HomePage
Feature: Home Page

  @Test
  Scenario: Check Login Page
    Given User is HomePage
    When you write "telefon" to search box
    When click search button
    When Filter out those with a product rating of "4" stars
    When click "2" page
    When click "Infinix HOT 10 128 GB 4 GB Ram (İthalatçı Garantili)" product
    When click add basket button
    When check the basket button count "1"
    When click the basket button
    When remove product from Basket
    Then you should see "Sepetiniz Boş" message



