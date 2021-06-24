#language: es

Característica: Como usuario deseo verificar del módulo
  Elements las funcionalidad Check Box
  Escenario: Validar que en la lista Elements aparezca el item Check Box
    Dado Yo como usuario ingrese al modulo Elements
    Cuando Seleccione Check Box
    Entonces Visualice Home

  Escenario: validar que funcione el evento Toggle Home
    Dado Yo como usuario este en la funcionalidad Check Box
    Cuando Seleccione Toggle Home
    Entonces Se desplegara las carpetas que contiene Home

  Escenario: Validar que funciones el check box de Home
    Dado Yo como usuario este en la funcionalidad Check Box
    Cuando Seleccione el check box de Home
    Entonces Visualice el siguiente mensaje You have selected home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile

  Escenario: validar que se deseleccionen las carpetas al interior de Documents
    Dado Yo como usuario tenga seleccionado el check box de Home
    Y  desplegado el Toggle Home
    Cuando Deselecciono Documents
    Y Selecciono el Toggle de Documents
    Entonces Documents
    Y las carpetas en su interior se deseleccionan

  Escenario: Validar que funcione el evento Expand All
    Dado Yo como usuario este en la funcionalidad Check Box
    Cuando selecciono el evento Expand All
    Entonces Visualizare toda las carpetas que se encuentran al interior de Home

  Escenario: Validar que funcione el evento Collapse All
    Dado Yo como usuario este en la funcionalidad Check Box
    Y se haya seleccionado el evento Expand All
    Cuando Seleccione el evento Collapse All
    Entonces Visualizare que todas las carpetas desaparecen excepto Home