# Runners:  

En este paquete se crean clases para ejecutar los features a través
de tags y el glue code (los métodos que se encuentran en las clases
StepDefinitions).

Las clases runners se deben escribir en PascalCase y deben llamarse igual
que el feature, donde se encuentran los escenarios que va a ejecutar. El
runner está compuesto por:

    o Features: se indica la ruta del feature que va a ser ejecutado.
    
    o Glue: se indica la ruta del StepDefinitions que contiene los
    métodos asociados a los escenarios de prueba del feature.
    
    o Snippets: se indica que los métodos asociados a los escenarios
    de pruebas del feature en el StepDefinitions, van a ser construidos
    con un estilo de escritura de tipo “Camelcase”.
   
    o Tags: Se indican escenarios específicos que van a ser ejecutados
    mediante tags que son colocados al inicio de la construcción del
    escenario y son mencionados en esta opción de parametrización.
    Esto debe colocarse en el runner si es estrictamente necesario
    probar un escenario específico de lo contrario no debe de
    colocarse.
