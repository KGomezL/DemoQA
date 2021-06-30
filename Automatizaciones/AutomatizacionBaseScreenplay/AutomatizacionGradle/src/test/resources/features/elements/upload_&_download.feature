#language: es

Característica:Se describen los escenarios de prueba enfocados en el sub modulo Upload & Download de la seccion Elements de la pagina demoqa
  @uploadDown
  Escenario: Yo como usuario deseo descargar un elemento
    Dado que el usuario ingresa al modulo Upload Download y ubica el boton de Download
    Cuando el usuario accede al item de Download
    Entonces valido que al acceder al item Download se de la correcta descarga de un archivo

  Escenario: Yo como usuario deseo subir un elemento
    Dado que el usuario ingresa al modulo Upload & Download y ubica el boton Seleccionar un archivo
    Cuando el usuario accede al item Seleccionar un archivo
    Entonces valido que se despliegue una ventana nueva con acceso a los diferentes directorios del equipo que se permita la seleccion de un archivo y se cargue correctamente adicional que me permita ver el nombre del archivo seleccionado y la ruta en la que se encontro
