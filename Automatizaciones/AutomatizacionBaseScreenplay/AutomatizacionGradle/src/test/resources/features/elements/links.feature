#language: es

# Items parte Titulo 1 links
Característica: Como usuario deseo probar los links de el elemento Links
  Escenario: Comprobar los links de el enunciado Following links will open new tab
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Home
    Entonces Me lleva direccionaria a la pagina inicial demoqa

  Escenario: Comprobar los links del enunciado Following links will open new tab
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link HomeFQTwx
    Entonces Me lleva direccionaria a la pagina inicial demoqa

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Created
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status dos cientos uno and status text Created

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link No Content
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status dos cientos cuatro and status text No Content

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Moved
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status tres cientos uno and status text Moved Permanently

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Bad Request
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status cuatro cientos and status text Bad Request

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Unauthorized
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status cuatro cientos uno and status text Unauthorized

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Forbidden
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status cuatro cientos tres and status text Forbidden

  Escenario: Comprobar los links de el enunciado Following links will send an api call
    Dado que como usuario me encuentro en la pagina Links
    Cuando selecciono el link Not Found
    Entonces Me deberia mostrar un mensaje que diga Link has responded with status cuatro cientos cuatro and status text Not Found