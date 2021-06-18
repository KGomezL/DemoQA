#language: es
# encoding: iso-8859-1

  #Buttons
Característica: Como usuario deseo verificar los botones del elemento buttogit config ..globalns

  Escenario: Verificar funcion de boton "click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando :   selecciono el boton "click me"
    Entonces : me debería mostrar un mensaje "You have done a dynamic click"

  Escenario: Verificar funcion de boton "Right click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando : selecciono el boton "Rigth click me"
    Entonces : me debería mostrar un mensaje "You have done a right click"


  Escenario: Verificar funcion de boton "Double click me"

    Dado que como usuario me encuentro en el modulo de elementos en el item buttons
    Cuando : selecciono el boton "Double click me"
    Entonces : me debería mostrar un mensaje "You have done a double click"


      #parte 1 links
Característica: Como usuario deseo probar los links de el elemento "Links"

  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Home"
    Entonces Me (lleva) direccionaría a la pagina inicial "demoqa.com"


  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "HomeFQTwx"
    Entonces Me (lleva) direccionaría a la pagina inicial "demoqa.com"

      #parte 2 links

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Created"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 201 and status text Created"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "No Content"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 204 and status text No Content"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Moved"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 301 and status text Moved Permanently"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Bad Request"
    Entonces Me debería mostrar un mensaje  que diga "Link has responded with staus 400 and status text Bad Request"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Unauthorized"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 401 and status text Unauthorized"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Forbidden"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 403 and status text Forbidden"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Not Found"
    Entonces Me debería mostrar un mensaje que diga "Link has responded with staus 404 and status text Not Found"

  Escenario:Como usuario de elements deseo verificar la funcionalidad de los botones del item Dynamics properties
    Dado que como usuario del item Dynamics properties
    Entonces verifico el cambio de estado automatica de los 3 botones