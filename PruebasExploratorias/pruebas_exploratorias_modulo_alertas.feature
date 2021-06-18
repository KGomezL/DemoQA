#language: es
# encoding: iso-8859-1

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

