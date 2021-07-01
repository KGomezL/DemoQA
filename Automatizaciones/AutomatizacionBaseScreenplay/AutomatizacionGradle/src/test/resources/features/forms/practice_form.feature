#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correcto funcionamiento

  @practiceForm
  Esquema del escenario: Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando lleno el formulario
    |Nombre|Apellido |Email|Genero|Telefono|
    |<Nombre>|<Apellido>|<Email>|<Genero>|<Telefono>|

    Entonces Confirmo si se registra el formulario

    Ejemplos:
      | La Tarjeta | Seleccionado  |Nombre|Apellido |Email|Genero|Telefono|
      | Forms      | Practice Form |Pedro|Prueba |pedro@prueba.com|Male|3013589633|
      | Forms      | Practice Form |Pedro|Prueba |pedro@prueba1.com|Female|3013589633|
      | Forms      | Practice Form |Pedro|Prueba3 |pedro@prueba.com|Male|3013589633|

