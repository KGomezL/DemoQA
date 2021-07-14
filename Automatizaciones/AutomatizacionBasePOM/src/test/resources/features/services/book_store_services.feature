#language: es

Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion
  @bookStoreServices
  Escenario: Deseo probar el servicio de registro
    Dado que quiero consumir el servicio de registro
    Cuando consumo el servicio
    Entonces valido que en la respuesta el usuario exista