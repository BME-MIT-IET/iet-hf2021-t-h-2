Manuális tesztelés
=======
Feladatom volt a program helyes működésének vizsgálatát segítő manuális tesztek tervezése, megírása. A program fő funkcionalitása a csv fájlból rdf fájl készítése, így a tesztek készítése során erre került a legnagyobb hangsúly.

A tesztesetek a `manual_testcases` mappában találhatók `.csv` kiterjesztésben. Tartalmaznak egy rövid leírást, a tesztelés megkezdéséhez szükséges előfeltételeket, a tesztelés utáni utófeltételeket, a triggert, ami a tesztelő által végrehajtandó feladatot tartalmazza, valamint a teszt végehajtása utáni állapotot. A végrehajtás utáni állapot többféle lehet. Megkülönböztetünk normál, és alternatív lefutásokat. A normál lefutás legtöbbször az elvárt működést jelenti, alternatív lefutás pedig akkor történhet, ha a tesztelt funkció működésében hiba található.

A tesztek végrehajtása során is találtunk különböző alternatív lefutásokat (például a bemeneti fájlok módosításával), így a tesztesetek több ciklus során frissültek. Az első alternatív lefutás, amivel kiegészült az eredeti tesztterv az volt, amikor észrevettük, hogy a header nélküli CSV fájlok során nem teljesül az elvárt működés. A tesztesetek a program jelenlegi funkcionalitását fedik le, amennyiben ez bővülne, úgy újabb teszteseteket lenne szükséges felvenni.

A tesztesetekről rövid összefoglaló olvasható a `manual testcases\readme.md` dokumentumban.
