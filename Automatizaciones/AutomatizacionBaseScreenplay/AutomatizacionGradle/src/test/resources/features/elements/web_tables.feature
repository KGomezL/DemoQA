#language: es

Característica: Como usuario deseo verificar la funcionalidad de los botones de accion en la tabla contenida en
  Web Tables del modulo Elements
    Escenario: Verificacion del boton de accion editar
    Dado que el usuario desee editar un registro de la tabla
    Cuando seleccione el boton de editar de determinado registro
    Entonces se le mostrara el formulario con los campos que podra editar

  Escenario: Verificacion del boton de accion eliminar
    Dado que el usuario desee eliminar un registro de la tabla
    Cuando seleccione el boton de eliminar de determinado registro
    Entonces se eliminara el registro de la tabla y ya no se podra visualizar en esta

  Escenario: Verificacion del boton Agregar
    Dado que el usuario desee agregar un registro a la tabla
    Cuando seleccione el boton de agregar
    Entonces se le mostrara un formulario para que diligencie los campos del registro a agregar

  Escenario: Busqueda de registros
    Dado que el usuario quiera consultar un registro
    Cuando escriba una letra, numero o caracter en la caja
    Entonces se le mostrara el o los registros que contengan lo escrito en la caja de busqueda

  Escenario: Validar existencia de registros en la tabla
    Dado que el usuario quiera validar si un registro existe en la tabla
    Cuando escriba una letra, numero o caracter en la caja
    Entonces mostrara un mensaje indicando que no se encontraron filas.