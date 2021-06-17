#language: es
# encoding: iso-8859-1

Característica: Se describen los escenarios de prueba enfocados a la pagina principal

  Escenario: yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que los modulos esten presentes
    |Modulos|
    |Form|
    |Elemnts|
    |Widgets|
    |Interactions|

  Esquema del escenario:yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que los <Modulos> esten presentes
    Ejemplos:
      |Modulos|
      |Form|
      |Elemnts|
      |Widgets|
      |Interactions|

  Escenario: yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que el modulo Form este presente

  Escenario: yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que el modulo Widgets este presente

  Escenario: yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que el modulo Interactions este presente

  Escenario: yo como usuario deseo validar que aparezcan todos los modulos
    #Dado: organizar mis datos de prueba
    Dado que el usuario ingresa a la pagina DemoQa
    #Cuando: la accion de la prueba
    #Entonces: el resultado
    Entonces valido que el modulo Book Store Aplication este presente


