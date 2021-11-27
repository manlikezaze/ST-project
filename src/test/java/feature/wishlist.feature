Feature: Add to wishlist feature.

  Background:
    Given the homepage is opened.

    Scenario:
      Given an item is clicked.
      And the "Add to wishlist" link is clicked.
      Then a "You must be logged in to manage your wishlist." message should be shown.

    Scenario:
      Given an item is clicked.
      And the user is signed in.
      And the "Add to wishlist" link is clicked.
      Then a "Added to your wishlist." message should be shown.