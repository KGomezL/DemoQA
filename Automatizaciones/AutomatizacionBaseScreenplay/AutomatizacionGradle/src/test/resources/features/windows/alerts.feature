#language: es

Característica: Como usuario deseo verificar la funcionalidad de los botones Haz clic en mi de acuerdo a su referencia

  @alerts
  Esquema del escenario: Visualizacion de alerta
    Dado que el usuario quiera ver la alerta
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
      | Boton   |
      | <Boton> |
    Entonces se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar
    Ejemplos:
      | La Tarjeta              | Seleccionado | Boton            |
      | Alerts, Frame & Windows | Alerts       | alertButton      |
      | Alerts, Frame & Windows | Alerts       | timerAlertButton |

  @alerts
  Esquema del escenario: Confirmacion de alerta al aceptar
    Dado que el usuario quiera ver la confirmacion al seleccionar el boton
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
      | Boton   |
      | <Boton> |
    Entonces se mostrara un cuadro donde debe seleccionar aceptar para continuar y la eleccion la vera al lado del enunciado del boton
    Ejemplos:
      | La Tarjeta              | Seleccionado | Boton         |
      | Alerts, Frame & Windows | Alerts       | confirmButton |

  @alerts
  Esquema del escenario: Confirmacion de alerta al cancelar
    Dado que el usuario quiera ver la confirmacion al seleccionar el boton
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
      | Boton   |
      | <Boton> |
    Entonces se mostrara un cuadro donde debe seleccionar cancelar para continuar y la eleccion la vera al lado del enunciado del boton
    Ejemplos:
      | La Tarjeta              | Seleccionado | Boton         |
      | Alerts, Frame & Windows | Alerts       | confirmButton |

  @alerts
  Esquema del escenario: Confirmacion de aviso al aceptar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
      | Boton   |
      | <Boton> |
    Entonces podra ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar
    Ejemplos:
      | La Tarjeta              | Seleccionado | Boton       |
      | Alerts, Frame & Windows | Alerts       | promtButton |

  @alerts
  Esquema del escenario: Confirmacion de aviso al cancelar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando seleccione el boton Haz click en mi que corresponde a la alerta deseada
      | Boton   |
      | <Boton> |
    Entonces podra ingresar su nombre pero no se vera al lado del enunciado si selecciona el boton cancelar
    Ejemplos:
      | La Tarjeta              | Seleccionado | Boton       |
      | Alerts, Frame & Windows | Alerts       | promtButton |