Feature: Parsing string to char with CSV2RDF

  Scenario: I want to parse a string to char with CSV2RDF
    Given I have a CSV2RDF type object
    And The input is a Java String with the length of one
    When I try to parse the string
    Then I get the char


  Scenario: I want to parse a string to char with CSV2RDF
    Given I have a CSV2RDF type object
    And The input is a Java String with the length of more than one
    When I try to parse the string
    Then I don't get the char