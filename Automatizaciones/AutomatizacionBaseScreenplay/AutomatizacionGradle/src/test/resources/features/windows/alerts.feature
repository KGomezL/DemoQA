#language: es

Característica: Como usuario deseo verificar la funcionalidad de los botones Haz clic en mi de acuerdo a su referencia
  Escenario: Visualizacion de alerta
    Dado que el usuario quiera ver la alerta
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
    Entonces se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar

  @tags
  Escenario: Visualizacion de alerta despues de cinco segundos
    Dado que el usuario quiera ver la alerta despues de cinco segundos
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta despues de cinco segundos
    Entonces se mostrara una ventana despues de cinco segundos con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar

  Escenario: Confirmacion de alerta al aceptar
    Dado que el usuario quiera ver la confirmacion al seleccionar el boton
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
    Entonces se mostrara un cuadro donde debe seleccionar aceptar para confirmar la accion y que esta se vea al lado del enunciado del boton

  Escenario: Confirmacion de alerta al cancelar
    Dado que el usuario quiera ver la confirmacion al seleccionar el boton
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
    Entonces se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton

  Escenario: Confirmacion de aviso al aceptar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
    Entonces se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar

  Escenario: Confirmacion de aviso al cancelar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
    Entonces se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar

  Escenario: Como usuario en el modulo Alerts frame & windows deseo comprobar la funcionalidad de los botones Small modal y Large modal
    Dado que como usuario del modulo Alerts frame & windows
    Cuando selecciono cada boton
    Entonces verifico los mensajes en los alerts