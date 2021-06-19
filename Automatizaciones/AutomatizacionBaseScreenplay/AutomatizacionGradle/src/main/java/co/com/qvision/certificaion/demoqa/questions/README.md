#Questions: 
En este paquete se crean clases donde se responde a una
pregunta sobre el estado de la aplicación o el resultado de una operación
realizada anteriormente en una funcionalidad. Con el fin de poder validar el
resultado obtenido con el resultado esperado de la prueba.

Esta clase implementa de la interface Question<ANSWER> y se debe
sobrescribir el método answeredBy(actor) en la cual se debe escribir la lógica
que permita obtener el estado o el resultado de un tipo específico que se ha
de comparar con el valor esperado.

Tener en cuenta que hay muchos Matchers que ofrece Serenity BDD para
realizar estas validaciones, como, por ejemplo:

    • isVisible()
    • isNotVisible()
    • isCurrentlyVisible()
    • isNotCurrentlyVisible()
    • isEnabled()
    • isNotEnabled()
    • isCurrentlyEnabled()
    • isNotCurrentlyEnabled()
    • isPresent()
    • isNotPresent()
    • isSelected()
    • isNotSelected()
    • containsText()
    • containsOnlyText()
    • containsSelectOption()
    • hasValue()
