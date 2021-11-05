# Oblig_3

Jeg startet med å dele prosjektet til guthub via intellij og sjekket at det var delt og funket som det skulle. Etter lagde jeg workflow fra template på github og oppdaterte prosjektet. 

Jeg lagde et til workflow kalt "tests.yml" som jeg skulle sette opp for å kjøre testene og publisere resultatet. 

Forklaring av Tests.yml:

1. "Checkout repository" - Her brukte jeg actions/checkout@v2 for at workflowet skal få tilgang til repositorie.

2. "Set up JDK 11" - Her satt jeg opp java for workflowet.

3. "Cache maven packages" - Her brukte jeg action/cache@v2 for å laste ned dependencies til koden og gjøre workflow raskere.

4. "Run tests" - Her skal testene kjøres, dette blir gjort med å bruke mvn kommandoen mvn -B test --file pom.xml

5. "Publish Test Report" - Til slutt måtte testene bli publisert etter workflowet er kjørt så vi kan se resultatet under "actions" i github.

Under "actions" ser du alle testene som ble pushet, både de som feilet/ikke fungerende og når jeg fikk det til. Test#20 "test" og test#21 "create readme.md" er de fungerende og endelige testene med workflow fila.
