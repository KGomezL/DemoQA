#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correcto funcionamiento

  @practiceForm
  Esquema del escenario: Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
#      | La Tarjeta   | Seleccionado   |
#      | <La Tarjeta> | <Seleccionado> |
    Cuando lleno el formulario
    Entonces Confirmo si se registro el formulario con campos vacios

    Ejemplos:
      | La Tarjeta | Seleccionado  |
      | Forms      | Practice Form |
#      | Elements   | Text Box      |
#      | Elements   | Check Box     |
