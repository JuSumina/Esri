Feature: Zoom Out Functionality

  @ZoomOut @RegressionSuite
  Scenario: Zoom out using Zoom out button
    #Given user opens the browser and launches ArcGIS Map Viewer application
    When user logs into ArcGIS Map Viewer application
    And user clicks on Zoom out button
    Then user is Zoomed out
    #And user closes the browser