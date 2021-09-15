#language: es

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
    Cuando el usuario accede al item "Click Here for Valid Link" para validar el link
    Entonces valido que el navegador sea re dirigido a la pagina principal https://demoqa.com/


  Escenario: Yo como usuario deseo validar que un link no es valido
    Dado que el usuario ingresa al modulo Broken Links -Image
    Cuando el usuario accede al item "Click Here for Broken Link"
    Entonces valido que el navegador no muestre ninguna pagina valida y se visualice un mensaje de error



