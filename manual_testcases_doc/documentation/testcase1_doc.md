TestCase1
---------

### Name: Build

-   **Definition:** The user wants to create a local build
-   **Prerequisite:** The user navigated to the project library and has
    Ant installed
-   **Postcondition:** -
-   **Trigger:** The user executes the *ant clean dist* command
-   **Normal execution:** The build is executed, the needed
    subdirectories are created
-   **Alternative execution:** If Ant is not installed, the system
    cannot interpret the command If the build.xml file is missing, the
    build will fail

#### First case:

Running the command `ant clean dist` without Ant installed. \#\#\#\#\#
Result: 'ant' is not recognized as an internal or external command,
operable program or batch file. The build fails. \#\#\#\#\# Solution:
Ant needs to be installed on the computer. \#\#\#\# Second case: Running
the command `ant clean dist` with Ant installed, but no build.xml file
in the project. \#\#\#\#\# Result: Buildfile: build.xml does not exist!
Build failed The build fails. \#\#\#\#\# Solution: build.xml needs to be
implemented in the project. \#\#\#\# Third case: Running the command
`ant clean dist` with Ant being installed and the build.xml file
implemented in the project.

    init: 
        [mkdir] Created dir: C:\users\Nina\Documents\GitHub\iet-hf2021-t-h-2\build 
    compile: 
        [javac] C:\Users\Nina\Documents\GitHub\iet-hf2021-t-h-2\build.xml:40: warning: 'includeantruntime' was not set, 
            defaulting to build.sysclasspath=last; set to false for repeatable builds
        [javac] Compiling 1 source file to C:\users\Nina\Documents\GitHub\iet-hf2021-t-h-2\build 
        [javac] warning: [options] bootstrap class path not set in conjunction with -source 7 
        [javac] warning: [options] source value 7 is obsolete and will be removed in a future release 
        [javac] warning: [options] target value 7 is obsolete and will be removed in a future release 
        [javac] warning: [options] To suppress warnings about obsolete options, use -xlint:-options. [javac] 4 warnings 
    distfiles: 
        [mkdir] Created dir: C:\users\Nina\Documents\GitHub\iet-hf2021-t-h-2\dist\lib 
        [copy] Copying 16 files to C:\users\Nina\Documents\GitHub\iet-hf2021-t-h-2\dist\lib 
    dist: 
        [jar] Building jar: C:\users\Nina\Documents\GitHub\iet-hf2021-t-h-2\dist\lib\csv2rdf.jar 
    BUILD SUCCESSFUL Total time: 1 second 

Build is successful, the dir directory has been created.
