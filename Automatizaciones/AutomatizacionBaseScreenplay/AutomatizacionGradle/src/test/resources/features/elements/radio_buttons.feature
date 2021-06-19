#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar la funcionalidad del ítem Radio Button del módulo Elements
  Escenario: Validar que en la lista de Elements aparezca  el ítem Radio Button
    Dado que el usuario acceda al módulo Elements
    Cuando despliegue la lista de Elements
    Entonces valido que esté presente el ítem Radio Button

  Escenario: Ingreso al ítem Radio Button
    Dado que el usuario ubique el ítem Radio Button en la lista de Elements
    Cuando seleccione el ítem Radio Button
    Entonces se le mostrará el contenido de esa sección

  Escenario: Elija que sí le gusto el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando marque la opción "Si"
    Entonces podrá ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Sí"

  Escenario: Elija que le impresiona el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando marque la opción "Impresionante"
    Entonces podrá ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Impresionante"

  Escenario: Quiera marcar que no le gustó el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando se ubique en la opción No
    Entonces podrá visualizar el símbolo de prohibido indicandole que no puede seleccionar esa opción