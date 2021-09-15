#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correcto funcionamiento

  @practiceForm
  Esquema del escenario: Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando lleno el formulario
      | Nombre   | Apellido   | Email   | Genero   | Telefono   | Fecha   | Subjects   | CurrentAdd   | State   | City   |
      | <Nombre> | <Apellido> | <Email> | <Genero> | <Telefono> | <Fecha> | <Subjects> | <CurrentAdd> | <State> | <City> |

    Entonces Confirmo si se registra el formulario

    Ejemplos:
      | La Tarjeta | Seleccionado  | Nombre | Apellido | Email              | Genero | Telefono   | Fecha            | Subjects  | CurrentAdd | State | City  |
      | Forms      | Practice Form | Pedro  | Prueba   | pedro@prueba.com   | Male   | 3013589633 | 01 December,2021 | Maths     | Calle 7    | NCR   | Delhi |
      | Forms      | Practice Form | Pedro  | Prueba   | segunda@prueba.com | Female | 3013589633 | 02 July,2021     | Chemistry | Calle 7    | NCR   | Delhi |


