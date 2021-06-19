#Exceptions: 
En esta capa se crearán excepciones específicas de dominio
que permitirán tener reportes legibles, debido a que, estas le dan significado
a los fallos del aplicativo que se esté automatizando. 

Normalmente las
excepciones generadas por el framework de pruebas junto con los
componentes que lo conforman son de carácter general y ambigua.

El uso de las excepciones permitirá tener un reporte con errores específicos
y correctamente descritos y ahorro en tiempo de depuración de código.
El estándar de nombramiento de estas clases sugiere que deben ser
dicientes para identificar el tipo de error que se quiere controlar, las palabras
deben ser escritas con forma PascalCase y al final del nombramiento debetener la palabra Exception. Ejemplo:

    NoSeEncuentraTipoDocumentoException.

#Excepciones semánticas: 

estas pueden indicar un mal comportamiento
en la implementación de la prueba automatizada, generalmente son las
excepciones arrojadas por el webDriver. Se debe tener en cuenta que
estas también pueden detectar fallas en el aplicativo, por lo tanto, se debe
realizar un análisis que permita identificar donde estas excepciones
ocurren con frecuencia para controlarlas mediante excepciones de
dominio que hereden de la clase Exeption, estas deben ser utilizadas en
la implementación de las tareas. Son marcadas en el reporte de color
anaranjado.



#Comprometidos (compromised): 
Estas excepciones indican que un
elemento externo que no pertenece al alcance de la prueba afecto el
comportamiento de la misma. Son utilizadas para indicar fallos o
inestabilidad del ambiente en el cual están ejecutándose las pruebas, por
ejemplo: cuando la conexión a la base de datos no está disponible. Son
marcadas en el reporte de color purpura y se deben configurar en el
serenity.conf o en el serenity.properties separadas por comas de la
siguiente manera:

    serenity.compromised.on= java.sql.SQLException, [otra excepción].