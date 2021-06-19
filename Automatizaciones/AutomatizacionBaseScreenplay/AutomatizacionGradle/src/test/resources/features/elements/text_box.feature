#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar del módulo
  "Elements" las funcionalidad "Text Box"
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


