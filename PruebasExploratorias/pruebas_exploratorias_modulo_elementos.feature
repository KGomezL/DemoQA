#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar del módulo
  "Elements" las funcionalidades "Check Box" y "Text Box"
  Escenario: Validar que en la lista Elements aparezca el item Text Box
    Dado Yo como usuario ingrese al modulo "Elements"
    Cuando Seleccione "Text Box"
    Entonces Despliegue el formulario

  Escenario: Diligenciar todos los campos del formulario "Text Box"
    Dado Yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio cada uno de los campos
    Entonces Se visualizará el resumen de la información diligenciada

  Escenario: Diligenciar solo el campo "Full Name" del formulario
    Dado Yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio solo el campo "Full Name"
    Entonces Se visualizará el resumen con el nombre

  Escenario: Diligenciar solo el campo "E mail" del formulario
    Dado yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio solo el campo "E mail"
    Entonces Se visualizará el resumen del E mail

  Escenario: Enviar el formulario sin diligenciar
    Dado yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Envío el formulario sin diligenciar
    Entonces No se visualizará ningun cambio

  Escenario: Validar que en la lista Elements aparezca el item Check Box
    Dado Yo como usuario ingrese al modulo "Elements"
    Cuando Seleccione "Check Box"
    Entonces Visualice Home

  Escenario: validar que funcione el evento Toggle Home
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando Seleccione Toggle Home
    Entonces Se desplegara las carpetas que contiene Home

  Escenario: Validar que funciones el check box de Home
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando Seleccione el check box de Home
    Entonces Visualice el siguiente mensaje "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"

  Escenario: validar que se deseleccionen las carpetas al interior de "Documents"
    Dado Yo como usuario tenga seleccionado el check box de Home
    Y  desplegado el Toggle Home
    Cuando Deselecciono Documents
    Y Selecciono el Toggle de Documents
    Entonces Documents y las carpetas en su interior se deseleccionan

  Escenario: Validar que funcione el evento "Expand All"
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando selecciono el evento "Expand All"
    Entonces Visualizare toda las carpetas que se encuentran al interior de "Home"

  Escenario: Validar que funcione el evento "Collapse All"
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Y se haya seleccionado el evento "Expand All"
    Cuando Seleccione el evento "Collapse All"
    Entonces Visualizare que todas las carpetas desaparecen excepto "Home"

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

Característica: Como usuario deseo verificar la funcionalidad de los botones de acción en la tabla contenida en
  Web Tables del módulo Elements
  Escenario: Verificación del botón de acción editar
    Dado que el usuario desee editar un registro de la tabla
    Cuando seleccione el botón de editar de determinado registro
    Entonces se le mostrará el formulario con los campos que podrá editar

  Escenario: Verificación del botón de acción eliminar
    Dado que el usuario desee eliminar un registro de la tabla
    Cuando seleccione el botón de eliminar de determinado registro
    Entonces se eliminará el registro de la tabla y ya no se podrá visualizar en esta

  Escenario: Verificación del botón Agregar
    Dado que el usuario desee agregar un registro a la tabla
    Cuando seleccione el botón de agregar
    Entonces se le mostrará un formulario para que diligencie los campos del registro a agregar

  Escenario: Búsqueda de registros
    Dado que el usuario quiera consultar un registro
    Cuando escriba una letra, número o caracter en la caja
    Entonces se le mostrará el o los registros que contengan lo escrito en la caja de búsqueda

  Escenario: Validar existencia de registros en la tabla
    Dado que el usuario quiera validar si un registro existe en la tabla
    Cuando escriba una letra, número o caracter en la caja
    Entonces mostrará un mensaje indicando que no se encontraron filas.

Característica: Como usuario deseo verificar la funcionalidad de los botones "Haz clic en mi" de acuerdo a su referencia
  Escenario: Visualización de alerta
    Dado que el usuario quiera ver la alerta
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará una ventana con un mensaje de la acción ejecutada y para continuar deberá dar click en el botón aceptar

  Escenario: Visualización de alerta después de 5 segundos
    Dado que el usuario quiera ver la alerta después de 5 segundos
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará una ventana después de 5s con un mensaje de la acción ejecutada y para continuar deberá dar click en el botón aceptar

  Escenario: Confirmación de alerta al aceptar
    Dado que el usuario quiera ver la confirmación al seleccionar el botón
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un cuadro donde debe seleccionar aceptar para confirmar la acción y que esta se vea al lado del enunciado del botón

  Escenario: Confirmación de alerta al cancelar
    Dado que el usuario quiera ver la confirmación al seleccionar el botón
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un cuadro donde debe seleccionar cancelar para ver esta elección al lado del enunciado del botón

  Escenario: Confirmación de aviso al aceptar
    Dado que el usuario quiera validar la aparición de un cuadro de aviso
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un aviso donde puede ingresar su nombre el cual se verá reflejado al lado del enunciado si selecciona el botón aceptar.

  Escenario: Confirmación de aviso al cancelar
    Dado que el usuario quiera validar la aparición de un cuadro de aviso
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un aviso donde puede ingresar su nombre el cual no se verá reflejado al lado del enunciado si selecciona el botón cancelar.

