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


  #Buttons
Característica: Como usuario deseo verificar los botones del elemento buttogit config ..globalns

  Escenario: Verificar funcion de boton "click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando :   selecciono el boton "click me"
    Entonces : me debería mostrar un mensaje "You have done a dynamic click"

  Escenario: Verificar funcion de boton "Right click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando : selecciono el boton "Rigth click me"
    Entonces : me debería mostrar un mensaje "You have done a right click"


  Escenario: Verificar funcion de boton "Double click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando : selecciono el boton "Double click me"
    Entonces : me debería mostrar un mensaje "You have done a double click"


      #parte 1 links
Característica: Como usuario deseo probar los links de el elemento "Links"

  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Home"
    Entonces Me (lleva) direccionaría a la pagina inicial "demoqa.com"


  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "HomeFQTwx"
    Entonces Me (lleva) direccionaría a la pagina inicial "demoqa.com"

      #parte 2 links

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Created"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 201 and status text Created"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "No Content"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 204 and status text No Content"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Moved"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 301 and status text Moved Permanently"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Bad Request"
    Entonces Me debería mostrar un mensaje  que diga "Link has responded with staus 400 and status text Bad Request"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Unauthorized"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 401 and status text Unauthorized"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Forbidden"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 403 and status text Forbidden"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Not Found"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 404 and status text Not Found"

  Escenario:Como usuario de elements deseo verificar la funcionalidad de los botones del item Dynamics properties
    Dado que como usuario del item Dynamics properties
    Entonces verifico el cambio de estado automatica de los 3 botones

Característica:Se describen los escenarios de prueba enfocados en el sub modulo Broken Links-Image de la seccion Elements de la pagina https://demoqa.com/

  Escenario: Yo como usuario deseo validar que aparezca una imagen valida
    Dado que el usuario ingresa al modulo Broken Links -Image
   # Cuando el usuario observa una imagen valida
    Entonces valido que se observe una imagen valida correctamente cargada

  Escenario: Yo como usuario deseo validar que una imagen no es visualizada correctamente
    Dado que el usuario ingresa al modulo Broken Links -Image
   # Cuando el usuario observa una imagen rota
    Entonces valido que no se observe una imagen correctamente cargada y aparezca el icono broken image en lugar de la imagen


  Escenario: Yo como usuario deseo validar que un link es valido
    Dado que el usuario ingresa al modulo Broken Links -Image
    Cuando el usuario accede al item  "Click Here for Valid Link"
    Entonces valido que el navegador sea re dirigido a la pagina principal https://demoqa.com/


  Escenario: Yo como usuario deseo validar que un link no es valido
    Dado que el usuario ingresa al modulo Broken Links -Image
    Cuando el usuario accede al item "Click Here for Broken Link"
    Entonces valido que el navegador no muestre ninguna pagina valida y se visualice un mensaje de error



Característica:Se describen los escenarios de prueba enfocados en el sub modulo Upload & Download de la seccion Elements de la pagina https://demoqa.com/

  Escenario: Yo como usuario deseo descargar un elemento
    Dado que el usuario ingresa al modulo Upload & Download y ubica el boton de Download
    Cuando el usuario accede al item de Download
    Entonces valido que al acceder al item Download se de la correcta descarga de un archivo.

  Escenario: Yo como usuario deseo subir un elemento
    Dado que el usuario ingresa al modulo Upload & Download y ubica el boton Seleccionar un archivo
    Cuando el usuario accede al item "Seleccionar un archivo"
    Entonces valido que se despliegue una ventana nueva con acceso a los diferentes directorios del equipo, que se permita la seleccion de un archivo y se cargue correctamente, adicional que me permita ver el nombre del archivo seleccionado y la ruta en la que se encontro.