#language: es
# encoding: iso-8859-1


Característica: Se describen los escenarios de prueba enfocados en el sub modulo Nested Frames de la seccion Alerts de la pagina https://demoqa.com/


  Escenario: Yo como usuario deseo validar la existencia y apariencia de un marcos anidados
    Dado que el usuario ingresa al modulo Nested Frames y ubica un marco dentro de otro marco, delimitados.
    Entonces valido que existan 2 marcos, uno dentro de otro, y que cada uno este delimitado y separado entre si.

  Escenario: Yo como usuario deseo validar la existencia y apariencia de un  marco exterior "parent frame"
    Dado que el usuario ingresa al modulo Nested Frames y ubica el marco exterior " parent frame"
    Entonces valido que exista un marco  exterior "parent frame "

  Escenario: Yo como usuario deseo validar la existencia y apariencia de un  marcos interior "child frame"
    Dado que el usuario ingresa al modulo Nested Frames y ubica el marco interior " parent frame"
    Entonces valido que exista un marco interior "child frame "