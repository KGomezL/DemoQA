#Stepdefinitons: 

Se crean las clases que representan la traducción de los
steps de los features a código ejecutable.

Estas clases deben ser llamadas igual a los features asociados y adicionar la
palabra “StepDefinitions”. 

Ejemplo: 
    
    RegistrarInmuebleAFCStepDefinitions.

En la clase no debe de ir lógica de programación, solo debe de ser llamadas
las clases que realizan las acciones requeridas para la ejecución de las
pruebas.


En el método Given siempre debe estar asociada la acción “wasAbleTo” que
hace referencia a una precondición. Se especifica que el actor pudo realizar
determinada acción.

En el método When siempre debe estar asociada la acción “attemptsTo” que
hace referencia a las tareas o acciones que va a realizar el actor. Las clases
que se utilizan en este método son de las capas Tasks, Intereactions, Utils y
Models.

En el método Then siempre debe estar asociada la acción “should” que hace
referencia a que debería hacer la comparación del resultado de la prueba.
Las clases que se utilizan en este método son de las capas Questions, Utils
y Exceptions. 