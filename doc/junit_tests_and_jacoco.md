# JUnit egységtesztek és kód lefedettség JaCoCo-val

## JUnit egységtesztek

JUnit segítségével készítettem egységteszteket, amelyek az alkalmazás kisebb részeire koncentráltak.

Tesztek leírása:

rowValueProviderTest() : Itt azt vizsgáljuk, hogy a megfelelő sor értéket adja-e vissza a függvény.
toCharTest() : Itt azt vizsgáljuk, hogy a kapott stringet megfelelően konvertálja-e át char típussá a függvény.
toCharExceptionTest() : Itt azt vizsgáljuk, hogy egy nem megfelelő stringre kivételt dob-e a függvény.
UUIDProviderTest() : Itt azt vizsgáljuk, hogy a függvény valóban eltérő UUID-kat ad meg értéknek.
rowNumberProviderTest() : Itt azt vizsgáljuk, hogy a függvény a helyes sornak a számával tér-e vissza.

## JaCoCo kód lefedettség

A kód lefedettség mérését a JaCoCo könyvtár segítségével végeztem.
Ez a projekt Ant build toolt használ, így ennek segítségével a build.xml fájlba definiáltam a report elkészítéséhez szükséges task-okat.
A build.xml futattásával a JaCoCo lefuttatja a teszteket és az erről elkészült reportot /target/site/jacoco/index.html megnyitásával lehet megtekinteni.