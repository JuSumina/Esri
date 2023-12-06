Feature: Measure Tool Functionality

  @MeasureTool @RegressionSuite
  Scenario: Measure distance using Measuring tool
    #Given user opens the browser and launches ArcGIS Map Viewer application
    When user logs into ArcGIS Map Viewer application
    And user clicks on Map tools button
    And user clicks on Measurement button
    And user clicks on the map to place their first point
    And user clicks on the map to place their destination point
    And user clicks Enter key on the keyboard
    Then user can see the total distance between the first and the destination point
    #And user closes the browser