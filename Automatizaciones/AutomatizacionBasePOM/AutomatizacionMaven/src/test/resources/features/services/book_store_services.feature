#language: es

Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion

  @bookStoreServices
  Esquema del escenario: Deseo probar el servicio de registro
    Dado que quiero consumir el servicio de registro
    Cuando consumo el servicio
      | userName   | password   |
      | <userName> | <password> |
    Entonces valido que en la respuesta el usuario exista
      | code   | message   | statusCode   |
      | <code> | <message> | <statusCode> |
    Ejemplos:
      | userName | password | code | message      | statusCode |
      | Pablo    | Pa12345* | 1204 | User exists! | 406        |
      | Pablo    | Pa12345* | 1204 | User exists! | 405        |