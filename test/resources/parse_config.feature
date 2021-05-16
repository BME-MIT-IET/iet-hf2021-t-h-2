Feature: Creating config with CSV2RDF
  Scenario: I want to create the config needed for creating RDF from CSV
    Given I have a CSV2RDF type object
    When I want to create the config for parsing
    Then The config object gets created