#language: es

Característica: Como usuario deseo verificar del modulo Alerts Frame Windows la
  funcionalidad Browser Windows
  Escenario: Validar que en la lista Alerts Frame Windows aparezca el item Browser Windows
    Dado Yo como usuario ingrese al modulo Alerts Frame  Windows
    Cuando Seleccione Browser Windows
    Entonces Visualice New Tab New Window
    Y New Window Message

  Escenario: Validar que funcione el evento New Tab
    Dado Yo como usuario este en Browser Windows
    Cuando Selecciono New Tab
    Entonces Se despliega una nueva pestanha en el Navegador

  Escenario: Validar que funcione el evento New Window
    Dado Yo como usuario este en Browser Windows
    Cuando Selecciono New Window
    Entonces Se despliega una nueva ventana en el Navegador

  Escenario: Validar que funcione el evento New windows with message
    Dado Yo como usuario este en Browser Windows
    Cuando Selecciono New Window Message
    Entonces Se despliega una nueva ventana con el mensaje Knowledge increases by sharing but not by saving Please share this website with your friends and in your organization
