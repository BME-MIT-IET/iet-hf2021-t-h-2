TestCase3
---------

### Name: Conversion

-   **Definition:** The user executes a conversion
-   **Prerequisite:** The user navigated to the project library and is
    in possesion of a .csv (comma-separated values) and .ttl (template)
    file in the proper format
-   **Postcondition:** The RDF output has been generated from the given
    .csv and .ttl files
-   **Trigger:** The user executes the *java -jar dist/lib/csv2rdf.jar
    examples/cars/template.ttl examples/cars/cars.csv cars.ttl* command
-   **Normal execution:** The conversion is executed based on the given
    files
-   **Alternative execution:** If Java is not installed, the conversion
    fails If the files contain any formatting issues, the conversion
    fails In case any of the files are non existent or not found, the
    converion fails

#### First case:

Running the command
`java -jar dist/lib/csv2rdf.jar examples/cars/template.ttl examples/cars/cars.csv cars.ttl`
without Java installed. 
##### Result: 
Nothing happens, unfortunately no ERROR message about Java not being installed.
##### Solution: 
Java needs to be installed on the computer.
#### Second case: 
Running the command `java -jar dist/lib/csv2rdf.jar examples/cars/template.ttl examples/cars/cars.csv cars.ttl` with Java installed, but no header in the .csv file. 
##### Result:

    INFO: CSV to RDF conversion started... 
    Template: examples\cars\template.ttl 
    Input : examples\cars\cars.csv 
    Output : cars.ttl 
    SLF4J: Class path contains multiple SLF4J bindings. 
    SLF4J: Found binding in [jar:file:/C:/Users/Nina/Documents/GitHub/iet-
           hf2021-t-h-2/dist/lib/lib/s1f4j-jdk14-1.6.1.jarl/org/s1f4j/impl/StaticLoggerBinder.class] 
    SLF4J: Found binding in [jar:file:/C:/Users/Nina/Documents/GitHub/iet-
           hf2021-t-h-2/dist/lib/s1f4j-jdk14-1.6.1.jarl/org/s1f4j/impl/StaticLoggerBinder.class] 
    SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation. 
    ERROR: java.lang.IllegalArgumentException: Invalid template variable [S{Make}] 
    java.lang.RuntimeException: java.lang.IllegalArgumentException: Invalid template variable [S{Make}] 
        at com.complexible.common.csv.CSV2RDF.run(CSV2RDF.java:127) 
        at com.complexible.common.csv.CSV2RDF.main(CSV2RDF.java:434) 
    Caused by: java.lang.IllegalArgumentException: Invalid template variable [S{Make}] 
        at com.google.common.base.Preconditions.checkArgument(Preconditions.java:120) 
        at com.complexible.common.csv.CSV2RDF$Template.insertPlaceholders(CSV2RDF.java:171) 
        at com.complexible.common.csv.CSV2RDF$Template.parseTemplate(CSV2RDF.java:210) 
        at com.complexible.common.csv.CSV2RDF$Template.<init>(CSV2RDF.java:159)
        at com.complexible.common.csv.CSV2RDF.run(CSV2RDF.java:110) 
        ... 1 more 

##### Solution: The header needs to be implemented in the file.

#### Third case:

Running the command `java -jar dist/lib/csv2rdf.jar examples/cars/template.ttl examples/cars/cars.csv cars.ttl` with Java installed, but no .csv file in the directory. 
##### Result:

    INFO: CSV to RDF conversion started... 
    Template: examples\cars\template.ttl 
    Input : examples\cars\cars.csv 
    Output : cars.ttl 
    ERROR: java.io.FileNotFoundException: examples\cars\cars.csv 
    (A rendszer nem talalja a megadott fajlt) 
    java.lang.RuntimeException: java.io.FileNotFoundException: examples\cars\cars.csv 
    (A rendszer nem talalja a megadott fajlt) 
        at com.complexible.common.csv.CSV2RDF.run(CSV2RDF.java:127) 
        at com.complexible.common.csv.CSV2RDF.main(CSV2RDF.java:434) 
    Caused by: java.io.FileNotFoundException: examples\cars\cars.csv 
    (A rendszer nem talalja a megadott fajlt) 
        at java.base/java.io.FileInputStream.openO(Native Method) 
        at java.base/java.io.FileInputStream.open(FileInputStream.java:211) 
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153) 
        at com.google.common.io.Files.newReader(Files.java:87) 
        at com.complexible.common.csv.CSV2RDF.run(CSV2RDF.java:101) 
        ... 1 more 

##### Solution: The .csv file needs to be implemented in the project library.

#### Fourth case:

Running the command `java -jar dist/lib/csv2rdf.jar examples/cars/template.ttl examples/cars/cars.csv cars.ttl` and executing the conversion. 
##### Result:

    INFO: CSV to RDF conversion started... 
    Template: examples\cars\template.ttl 
    Input : examples\cars\cars.csv Output : cars.ttl 
    SLF4J: Class path contains multiple SLF4J bindings. 
    SLF4J: Found binding in [jar:file:/C:/Users/Nina/Documents/GitHub/iet-
    hf2021-t-h-2/dist/lib/lib/s1f4j-jdk14-1.6.1.jarl/org/s1f4j/impl/StaticLoggerBinder.class] 
    SLF4J: Found binding in [jar:file:/C:/Users/Nina/Documents/GitHub/iet-
    hf2021-t-h-2/dist/lib/s1f4j-jdk14-1.6.1.jarl/org/s1f4j/impl/StaticLoggerBinder.class] 
    SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation. 
    Converted 4 rows to 76 triples
