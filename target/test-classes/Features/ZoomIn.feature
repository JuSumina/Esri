Feature: Zoom In Functionality

  @ZoomIn @RegressionSuite
  Scenario: Zoom in using Zoom in button
    #Given user opens the browser and launches ArcGIS Map Viewer application
    When user logs into ArcGIS Map Viewer application
    And user clicks on Zoom in button
    Then user is Zoomed in
    #And user closes the browser