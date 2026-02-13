# Proyecto Feria Empresarial (Actividad 2)

Este proyecto implementa un sistema para la gestión de una feria empresarial, permitiendo el registro de empresas, stands, visitantes y comentarios.

## Estructura del Proyecto

### Paquete `modelo`
- **Empresa**: Representa una empresa con nombre, sector y correo.
- **Stand**: Espacio físico asignado a una empresa.
- **Visitante**: Persona que asiste a la feria.
- **Comentario**: Opinión dejada por un visitante en un stand.

### Paquete `logica`
- **FeriaEmpresarial**: Controlador principal que gestiona las listas de stands y visitantes, y coordina las operaciones.

### Clase Principal
- **Main.java**: Clase de prueba para verificar el funcionamiento del sistema.

## Cómo Ejecutar

1.  Asegúrate de tener instalado el JDK de Java.
2.  Navega a la carpeta raíz del proyecto.
3.  Compila el código:
    ```bash
    javac -d bin -sourcepath src src/Main.java
    ```
4.  Ejecuta el programa:
    ```bash
    java -cp bin Main
    ```

## Autor
Juan Sebastian Novoa
