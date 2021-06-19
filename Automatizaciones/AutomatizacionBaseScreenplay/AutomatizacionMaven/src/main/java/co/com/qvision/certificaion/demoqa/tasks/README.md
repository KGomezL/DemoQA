#Tasks: 
En este paquete se crean clases compuestas por un conjunto de
acciones o interacciones con el fin de documentar lo que hace un Actor en el
sistema.

Estas clases deben ser limpias y legibles de tal forma que solamente se
utilicen interacciones de Screenplay o personalizadas, no se deben realizar
implementaciones lógicas de programación para interactuar con la aplicación
en estas clases.
El nombre de las clases debe ir acorde a la tarea específica que realiza en
su más alto nivel respetando siempre el principio de interfaz fluida.

Es posible la utilización de la interfaz @Step; esta se utiliza para que
determinado método que hace referencia a un paso en la automatización,
pueda ser documentado para que aparezca en el reporte de Serenity. Esta
se coloca encima del método y se le puede adicionar una breve descripción
a esta anotación.

es pueden recibir parámetros utilizando una
notación indexada que comienza con cero: {0} para el primer parámetro, {1}
para el segundo, etc. En el ejemplo anterior podemos observar que recibe un
parámetro, en este caso recibe el nombre del actor. En caso de que se desee
mostrar el valor de una variable que no recibe el método, pero que hace parte
de la clase, se hace colocando ‘#<nombre de la variable>’, como se observa
en el ejemplo recibe el valor de la variable código. 