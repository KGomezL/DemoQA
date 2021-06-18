#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar del módulo
  "Elements" las funcionalidades "Check Box" y "Text Box"
  Escenario: Validar que en la lista Elements aparezca el item Text Box
    Dado Yo como usuario ingrese al modulo "Elements"
    Cuando Seleccione "Text Box"
    Entonces Despliegue el formulario

  Escenario: Diligenciar todos los campos del formulario "Text Box"
    Dado Yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio cada uno de los campos
    Entonces Se visualizará el resumen de la información diligenciada

  Escenario: Diligenciar solo el campo "Full Name" del formulario
    Dado Yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio solo el campo "Full Name"
    Entonces Se visualizará el resumen con el nombre

  Escenario: Diligenciar solo el campo "E mail" del formulario
    Dado yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Diligencio solo el campo "E mail"
    Entonces Se visualizará el resumen del E mail

  Escenario: Enviar el formulario sin diligenciar
    Dado yo como usuario este en el formulario desplegado de "Text Box"
    Cuando Envío el formulario sin diligenciar
    Entonces No se visualizará ningun cambio

  Escenario: Validar que en la lista Elements aparezca el item Check Box
    Dado Yo como usuario ingrese al modulo "Elements"
    Cuando Seleccione "Check Box"
    Entonces Visualice Home

  Escenario: validar que funcione el evento Toggle Home
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando Seleccione Toggle Home
    Entonces Se desplegara las carpetas que contiene Home

  Escenario: Validar que funciones el check box de Home
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando Seleccione el check box de Home
    Entonces Visualice el siguiente mensaje "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"

  Escenario: validar que se deseleccionen las carpetas al interior de "Documents"
    Dado Yo como usuario tenga seleccionado el check box de Home
    Y  desplegado el Toggle Home
    Cuando Deselecciono Documents
    Y Selecciono el Toggle de Documents
    Entonces Documents y las carpetas en su interior se deseleccionan

  Escenario: Validar que funcione el evento "Expand All"
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Cuando selecciono el evento "Expand All"
    Entonces Visualizare toda las carpetas que se encuentran al interior de "Home"

  Escenario: Validar que funcione el evento "Collapse All"
    Dado Yo como usuario esté en la funcionalidad "Check Box"
    Y se haya seleccionado el evento "Expand All"
    Cuando Seleccione el evento "Collapse All"
    Entonces Visualizare que todas las carpetas desaparecen excepto "Home"
