Feature: Search Tool Functionality

  @SearchTool
  Scenario: Search place using Search tool
    #Given user opens the browser and launches ArcGIS Map Viewer application
    When user logs into ArcGIS Map Viewer application
    And user clicks on Search button
    And user enters the name of the place they are searching for
    And user clicks on the name of the place they are searching for
    Then user can see their Search result
    #And user closes the browser