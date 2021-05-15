# Statikus analízis
## SonarCloud

SonarCloud keretrendszerrel végeztem statikus kódanalízist a kód minőségének emelése érdekében. Az analízis eszköz hozzáadása után az alábbi hibákkal találkoztam:
    - 13 code smell a következő típusokkal: -logger használata System.out helyett
                                            -konkrét exception használata általános helyett
                                            -függvény fejlécek rendezése
                                            -váltózónevek konkretizálása
                                            -
