TestCase2
---------

### Name: Help screen

-   **Definition:** The user needs help
-   **Prerequisite:** The user navigated to the project library and the
    build has already been created
-   **Postcondition:** -
-   **Trigger:** The user executes the *java -jar dist/lib/csv2rdf.jar
    help convert* command
-   **Normal execution:** The help screen appears in the command line
-   **Alternative execution:** If Java is not installed, the system
    cannot interpret the command

#### First case:

Running the command `java -jar dist/lib/csv2rdf.jar help convert`
without Java installed. \#\#\#\#\# Result: Nothing happens,
unfortunately no ERROR message about Java not being installed.
\#\#\#\#\# Solution: Java needs to be installed on the computer.
\#\#\#\# Second case: Running the command
`java -jar dist/lib/csv2rdf.jar help convert` with Java installed.
\#\#\#\#\# Result:

    NAME 
        csv2rdf convert - Runs the conversion. 
    SYNOPSIS 
        csv2rdf convert [ {-e I --escape} <escape> ] [ --no-header ] 
            [ {-q I --quote} <quote> ] [ {-s I --separator} <separator> C-
            <templateFile> <csvFile> <outputFile>... 
    OPTIONS 
        -e <escape>, --escape <escape> 
            Escape character used in the csv file or '\' by default. 
        --no-header 
            If csv file does not contain a header row 
        -q <quote>, --quote <quote> 
            Quote character used in the csv file or '"' by default. 
        -s <separator>, --separator <separator> 
            Seperator character used in the csv file or ',' by default.
        --
            This option can be used to separate command-line options 
            from the list of argument, (useful when arguments might 
            be mistaken for command-line options 
            
        <templateFile> <csvFile> <outputFile> 
            File arguments. The extension of template file and output 
            file determines the RDF format that will be used for them 
            (.ttl = Turtle, .nt = N-Triples, .rdf = RDF/XML)
          

The execution of the command was successful, the help screen appears in
the command line.
