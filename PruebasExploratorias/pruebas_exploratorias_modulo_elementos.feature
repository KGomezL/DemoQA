#language: es
# encoding: iso-8859-1


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