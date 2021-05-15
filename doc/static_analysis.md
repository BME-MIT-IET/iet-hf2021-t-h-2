# Statikus analízis
## SonarCloud

SonarCloud keretrendszerrel végeztem statikus kódanalízist a kód minőségének emelése érdekében. A megoldásban természetesen a programot megvalósító fő osztályra koncentráltam, hogy annak működése még hibamentesebb legyen. Az analízis eszköz hozzáadása után az alábbi hibákkal találkoztam:
    
    - 13 code smell a következő típusokkal: -logger használata System.out helyett
                                            -konkrét exception használata általános helyett
                                            -függvény fejlécek rendezése
                                            -váltózónevek konkretizálása
                                            -null pointer exception javítása
    - 1 Security Hotspot

A fent említett hibák nagy százalékát sikeresen kijavítottam. Az exception kezelési hibáknál főként a try-catch blokk hiánya jelentette a problémát. Mint látható, volt egy security hotspot is a kódban ami miatt nem felelt meg a quality gate elvárásainak. A hibát egy exception `printStackTrace()` függvénye okozta. Ezt jobban megvizsgálva kiderült számomra, hogy a függvény akaratlanul is érzékeny információkat jeleníthet meg a felhasználó számára.
