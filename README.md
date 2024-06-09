<a name="readme-top"></a>

<!--
*** ¡Gracias por revisar esta plantilla de README! Si tienes una sugerencia
*** que podría mejorarla, por favor haz un fork del repositorio y crea un pull request
*** o simplemente abre un issue con la etiqueta "enhancement".
*** ¡No olvides darle una estrella al proyecto!
*** ¡Gracias de nuevo! Ahora ve y crea algo ASOMBROSO! :D
-->
<!-- INSIGNIAS DEL PROYECTO -->
<!--
*** Estoy usando enlaces de estilo "referencia" en markdown para mayor legibilidad.
*** Los enlaces de referencia están encerrados entre corchetes [ ] en lugar de paréntesis ( ).
*** Ver la parte inferior de este documento para la declaración de las variables de referencia
*** para contributors-url, forks-url, etc. Esta es una sintaxis opcional y concisa que puedes usar.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
 <p align="center">
    <a>
      <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
    </a>
    <a>
      <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"/>
    </a>
    <a>
      <img src="https://img.shields.io/badge/maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
    </a>
    <a>
      <img src="https://img.shields.io/badge/intellij-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/>
    </a>
</p>
<!-- LOGO DEL PROYECTO -->
<br />
<div align="center">
  <a href="https://github.com/tu_usuario/tu_repositorio">
    <img src="https://github.com/tu_usuario/tu_repositorio/assets/logo.png" alt="Logo" width="80" height="80">
</a>
  <h3 align="center">API CRUD Rápida con Spring Boot</h3>
  <p align="center">
   Un proyecto simple para la gestión de estudiantes utilizando Spring Boot, Maven y Java 17.
    <br />
    <a href="https://github.com/tu_usuario/tu_repositorio"><strong>Explora la documentación »</strong></a>
    <br />
    <br />
    <a href="https://github.com/tu_usuario/tu_repositorio">Ver Demo</a>
    ·
    <a href="https://github.com/tu_usuario/tu_repositorio/issues/new?labels=bug&template=bug-report---.md">Reportar Bug</a>
    ·
    <a href="https://github.com/tu_usuario/tu_repositorio/issues/new?labels=enhancement&template=feature-request---.md">Solicitar Funcionalidad</a>
  </p>
</div>
<!-- TABLA DE CONTENIDOS -->
<details>
  <summary>Tabla de Contenidos</summary>
  <ol>
    <li>
      <a href="#sobre-el-proyecto">Sobre el Proyecto</a>
      <ul>
        <li><a href="#características-del-proyecto">Características del Proyecto</a></li>
        <li><a href="#construido-con">Construido Con</a></li>
      </ul>
    </li>
    <li>
      <a href="#requisitos">Requisitos</a>
    </li>
    <li>
      <a href="#instrucciones-de-compilación-y-ejecución">Instrucciones de Compilación y Ejecución</a>
      <ul>
        <li><a href="#clonar-el-repositorio">Clonar el Repositorio</a></li>
        <li><a href="#compilar-el-programa">Compilar el Programa</a></li>
        <li><a href="#ejecutar-el-programa">Ejecutar el Programa</a></li>
      </ul>
    </li>
    <li><a href="#estructura-del-proyecto">Estructura del Proyecto</a></li>
    <li><a href="#contribuyendo">Contribuyendo</a></li>
    <li><a href="#licencia">Licencia</a></li>
    <li><a href="#contacto">Contacto</a></li>
    <li><a href="#reconocimientos">Reconocimientos</a></li>
  </ol>
</details>
<!-- SOBRE EL PROYECTO -->
## Sobre el Proyecto
Este proyecto es una API CRUD sencilla para la gestión de estudiantes, desarrollada con Spring Boot y Maven, utilizando Java 17. Fue creado para demostrar cómo construir una API RESTful que permita crear, leer, actualizar y eliminar registros de estudiantes.

### Características del Proyecto:
Crear Estudiantes: Añadir nuevos estudiantes a la base de datos.
Leer Estudiantes: Recuperar la lista de estudiantes o un estudiante específico.
Actualizar Estudiantes: Modificar los detalles de un estudiante existente.
Eliminar Estudiantes: Eliminar un estudiante de la base de datos.
## Construido Con:
* Spring Boot - El framework utilizado
* Maven - Manejador de dependencias
* Java 17 - Lenguaje de programación
<p align="right">(<a href="#readme-top">volver al inicio</a>)</p>
<!-- REQUISITOS -->

## Requisitos

Antes de empezar, asegúrate de tener los siguientes requisitos:

* Java 17
* Maven
* IDE (recomendado: IntelliJ IDEA)

<!-- INSTRUCCIONES DE COMPILACIÓN Y EJECUCIÓN -->
## Instrucciones de Compilación y Ejecución

### Clonar el Repositorio
    ```sh
     git clone https://github.com/tu_usuario/tu_repositorio.git
     cd tu_repositorio

### Compilar el Programa
    ```sh

    mvn clean install

### Ejecutar el Programa
    ```sh

    mvn spring-boot:run

<!-- ESTRUCTURA DEL PROYECTO -->
Estructura del Proyecto
El proyecto tiene la siguiente estructura de directorios:
```sh
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── CRUD_Rapido
│   │               ├── controller
│   │               │   └── StudentController.java
│   │               ├── entity
│   │               │   └── Student.java
│   │               ├── repository
│   │               │   └── StudentRepository.java
│   │               └── service
│   │                   └── StudentService.java
│   │               └── CrudRapidoApplication.java
│   ├── resources
│   │   ├── static
│   │   ├── templates
│   │   └── application.properties
├── test
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml

<p align="right">(<a href="#readme-top">volver al inicio</a>)</p>
<!-- LICENCIA -->
Licencia
Distribuido bajo la licencia MIT. Ver LICENSE.txt para más información.

## Reconocimientos
Spring Boot
Maven
IntelliJ IDEA
<p align="right">(<a href="#readme-top">volver al inicio</a>)</p>
