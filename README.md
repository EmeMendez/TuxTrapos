# TuxTrapos
Proyecto de toda utilidad, java, CRUD, y exportación de PDF 


Lista de archivos incluidos:
----------------------------

Archivos con información

* tuxtrapos.sql  
  script base de datos

 * libs  
  mysql-connector-java-5.1.23-bin.jar  
  jcalendar-1.4.jar
 
 * tuxtrapos  
   proyecto java
   


Conexión al servidor de base de datos:
----------------------------
Está configurado de la siguiente manera, por lo que debe ser cambiado, de acuerdo a la configuración de su servidor  
* usuario: java  
* contraseña:1234  
* nombre del servidor:localhost  
* privilegios: todos los privilegios  


Hacer uso de la base de datos
-------------------------------------

* Importar a su sistema gestor de base de datos el script llamado "tuxtrapos.sql" 

-------------------------------------
PARA EL USO DE LA APLICACIÓN
-------------------------------------
1. Abra el poryecto y agregue en librerias  
   * mysql-connector-java-5.1.23-bin.jar  
   * jcalendar-1.4.jar

2. El sistema puede consultar datos del Clientes y modificar sus datos
   * para clientes los ID comienzan desde "1" en adelante

3. El sistema puede consultar y realizar Ventas, los numeros comienzan desde el 7000 en adelante.

4. El sistema puede consultar datos del Ventas y Realizar una venta, los numeros comienzan desde el 7000 en adelante.Para agregar un producto,seleccionelo, haga clik derecho y "añadir articulo".Los mismo con las compras, excepto ID empiezan con 8000

5. El sistema puede consultar contratos de empleados, los ID comienzan desde 1 en adelante

6. Puede ingresar Asistencias, y buscarlas por rut o nombre de empleado, y por fechas, o ambas.
