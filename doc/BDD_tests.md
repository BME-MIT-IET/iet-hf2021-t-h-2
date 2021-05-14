# BDD tests
## Cucumber keretrendszer

A Cucumber keretrendszer segítségével teszteltem az alkalmazás fő komponenseit. A fő funkcionalitás a csv fájlból rdf fájl készítése, melyet a CSV2RDF.java osztály a `run` metódusával valósít meg.

A függvény alapvetően privát metórusokra és függvényekre épít, így ezek működését alacsony arányban teszteltem közvetetten, ám a `run` metódus megfelelő működését alaposan ellenőriztem, így ellenőrzésre kerültek azok a funkciók is, meylekre az említett függvény épít. Így a privát metódusok és osztályok teljesen átlátszóak, bármikor lecserélhetőek, ameddig a fontosabb funkciók viselkedése nem változik.

A Cucumber tesztek  difiníciója a `/test/resources` mappában lévő `*.feature` fájlokban találhatók ember által is könnyen értelmezhető formában. Az itt megfogalmazott tesztek kódbeli deiníciója a `/src/test/java/cucumber/CSV2RDFStepDefinitions.java` fájlban található. A tesztelés best practise-einek megfelelően minden tesztelendő függvénynek külön `*.feature` fájlt hoztam létre, de tesztelendő modulonként csak egy `*StepDefinitions.java` fájlt készítettem el. 