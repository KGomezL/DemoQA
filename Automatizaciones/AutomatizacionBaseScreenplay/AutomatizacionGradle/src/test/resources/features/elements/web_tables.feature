#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar la funcionalidad de los botones de acción en la tabla contenida en
  Web Tables del módulo Elements
  Escenario: Verificación del botón de acción editar
    Dado que el usuario desee editar un registro de la tabla
    Cuando seleccione el botón de editar de determinado registro
    Entonces se le mostrará el formulario con los campos que podrá editar

  Escenario: Verificación del botón de acción eliminar
    Dado que el usuario desee eliminar un registro de la tabla
    Cuando seleccione el botón de eliminar de determinado registro
    Entonces se eliminará el registro de la tabla y ya no se podrá visualizar en esta

  Escenario: Verificación del botón Agregar
    Dado que el usuario desee agregar un registro a la tabla
    Cuando seleccione el botón de agregar
    Entonces se le mostrará un formulario para que diligencie los campos del registro a agregar

  Escenario: Búsqueda de registros
    Dado que el usuario quiera consultar un registro
    Cuando escriba una letra, número o caracter en la caja
    Entonces se le mostrará el o los registros que contengan lo escrito en la caja de búsqueda

  Escenario: Validar existencia de registros en la tabla
    Dado que el usuario quiera validar si un registro existe en la tabla
    Cuando escriba una letra, número o caracter en la caja
    Entonces mostrará un mensaje indicando que no se encontraron filas.