#Features: 
Se crean los features con los escenarios de pruebas definidos en
lenguaje Gherkin y se hace uso de la herramienta Cucumber.
Para el nombramiento de estas las palabras deben ser en minúsculas y se
debe usar un verbo en infinitivo. Si contiene más de una palabra debe ser
separada por un guion bajo. Ejemplo: 

    registrar_inmueble.feature.

El feature como tal no es una clase, es un archivo de texto con el cual
podemos interpretar una historia de usuario con unos criterios de aceptación,
los cuales se convierten en un conjunto de acciones que se realizan para
verificar una funcionalidad determinada.

Estos escenarios describen un punto de partida, una acción y un resultado
esperado con el apoyo de expresiones regulares para nombrar variables de
entrada que se usarán durante la ejecución de las pruebas.

Los escenarios de prueba deben de estar redactados en tercera persona de
forma declarativa o funcional para que puedan ser comprendidos por los
interesados en el proyecto o negocio. Por lo tanto, deben estar en un lenguaje
de alto nivel donde no se mencione el detalle de la implementación, es decir,
no deben redactarse de forma imperativa, es decir, a un nivel técnico
indicando acciones sobre los elementos, por ejemplo:

    dar clic sobre determinada opción, escribir en un campo específico, seleccionar un
    checkbox etc.

El lenguaje en el que estarán escritos los steps será el que utiliza el cliente
en las historias de usuario y este debe regir el lenguaje descrito en las clases.

La estructura de un archivo feature está dado por lo siguiente:

    o Given (Dado): Indica la precondición del negocio o el contexto inicial del
    sistema. Que se requiere tener realizado para continuar con la prueba y
    hacer las acciones determinadas.
    
    o When (Cuando): Indica las acciones o tareas que se ejecutan con el fin
    de llegar a un resultado verificable.
    
    o Then (Entonces): Indica los pasos que se utilizan para comparar un
    resultado esperado con el resultado obtenido.
    
    o And – But (Y – Pero): Permite unir acciones, es decir, se puede utilizar
    después de un Given (Dado), When (Cuando) o un Then (Entonces). Se
    recomienda que se utilicen cuando sea estrictamente necesario, ya que
    se requiere dar más entendimiento acerca del escenario.
    
    o Background (Antecedentes): Es utilizado para definir una serie de
    acciones que son comunes en cada escenario del feature. Se coloca
    antes de los escenarios definidos y las acciones del background ya no se
    colocarían en los escenarios.
    
    o Examples: Es una tabla separada por (| -> pipes), donde cada columna
    está compuesta por el título o variable que hace referencia al dato que
    tiene asociado. Son definidos después de un escenario, y este debe ser
    construido como “Scenario Outline (Esquema del escenario)”, allí se
    colocan los datos de entrada a utilizar en métodos de la clase
    StepDefinitions que hacen referencia a los escenarios del feature.

El When (Cuando) y Then (Entonces) son obligatorios en la construcción de
los escenarios del feature, ya que, siempre se debe indicar las acciones a ser
ejecutadas por el actor, y luego hacer la validación del resultado de las
acciones realizadas en la ejecución de las pruebas. 