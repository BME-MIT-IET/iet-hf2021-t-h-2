Feature: Using tha main functionality of CSV2RDF class
  Scenario: I want to parse a CSV file to RDF, but there are not enough parameters passed
    Given I have a CSV2RDF type object
    And The object has only two parameters
    When I try to run the main functionality
    Then I get an IllegalArgumentException

  Scenario: I want to parse a CSV file to RDF, but there are too many parameters passed
    Given I have a CSV2RDF type object
    And The object has more than three parameters
    When I try to run the main functionality
    Then I get an IllegalArgumentException

  Scenario: I want to parse a CSV file to RDF, but the CSV file does not exist
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    And The file from the second parameter does not exist
    When I try to run the main functionality
    Then I get an RuntimeException

  Scenario: I want to parse a CSV file to RDF, but there is no template file for it
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    And The file from the first parameter does not exist
    When I try to run the main functionality
    Then I get an RuntimeException

  Scenario: I want to parse a CSV file to RDF, but the CSV file is empty
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    And The file from the second parameter is empty
    When I try to run the main functionality
    Then I get an RuntimeException

  Scenario: I want to parse a CSV file to RDF, and it is successful
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    When I try to run the main functionality
    Then The output file exists

  Scenario: I want to parse a CSV (no header) file to RDF, and it is successful
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    And The CSV file has no header
    When I try to run the main functionality
    Then The output file exists

  Scenario: I want to parse a CSV file to RDF, and output file is not empty
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    When I try to run the main functionality
    Then The output file is not empty

  Scenario: I want to parse a CSV (no header) file to RDF, and output file is not empty
    Given I have a CSV2RDF type object
    And The object has exactly three parameters
    And The CSV file has no header
    When I try to run the main functionality
    Then The output file is not empty