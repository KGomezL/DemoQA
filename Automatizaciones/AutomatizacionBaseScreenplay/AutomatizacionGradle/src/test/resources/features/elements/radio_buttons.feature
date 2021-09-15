#language: es
#enconding: iso-8859-1

Característica: Como usuario deseo verificar la funcionalidad del item Radio Button del modulo Elements
  @radioButton
  Escenario: Validar que en la lista de Elements aparezca  el item Radio Button
    Dado que el usuario acceda al modulo Elements
    Cuando seleccione el item Radio Button
    Entonces se le mostrara el contenido de esa seccion
  @radioButton
  Escenario: Elija que si le gusto el sitio
    Dado que el usuario haya leido la pregunta Te gusta el sitio y decida entre las opciones de respuesta
    Cuando marque la opcion afirmativa "Si"
    Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Si"
  @radioButton
  Escenario: Elija que le impresiona el sitio
    Dado que el usuario haya leido la pregunta Te gusta el sitio y decida entre las opciones de respuesta
    Cuando marque la opcion "Impresionante"
    Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Impresionante"
  @radioButton
  Escenario: Quiera marcar que no le gusto el sitio
    Dado que el usuario haya leido la pregunta Te gusta el sitio y decida entre las opciones de respuesta
    Cuando se ubique en la opcion negativa "No"
    Entonces podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion