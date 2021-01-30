# Calculadora de Media y Desviación Estándar

Esta calculadora esta fue realizada en lenguaje Java. Su principal funcionamiento se centra en realizar dos operaciones
basicas de la estadistica que son calcula la media y desviación estandar.

Para conocer mas informacion puede leer el informe realizado.

## Autor
* Diego Alejandro Murcia Cespedes

## Contrucción
* IntelliJ - Editor de código y ambiente de desarrollo
* Maven - Gestor de dependencias
* JUnit - Pruebas unitarias

## Pre-Requisitos
* Tener git instalado
* Tener maven instalado
* Usar la version de Java 7 o Java 8

## Primeros Pasos
Para iniciar se recomienda clonar el repositorio y guardarlo como local en su computadora. Para ello debe ejecutar por
consola:
```
    git clone https://github.com/DiegoMurcia2022/Laboratorio-No.01-AREP.git
```

Luego de clonarlo dirijase desde la consola hasta la ubicacion del archivo y ejecute los siguientes comandos:
```bash
    mvn package
    mvn exec:java -Dexec.mainClass="edu.eci.arep.App"
```
Una vez ejecutados estos comandos se ejecutara el programa y vera los resultados calculados por este.

## Modificaciones
Si desea cambiar los valores con los que el programa realiza los calculos debe ir a la clase `App.java` y allí
modificar el metodo `addValues` con los valores deseados.

***Nota: Recuerde que estos valores deben de ser `Double`.***

## Documentación
Para ver la documentacion del proyecto puede ejecutar por consola los comandos:
```
    mvn javadoc:javadoc
    mvn site
    mvn site:run
```
Luego de esto dirijase a su navegador preferido y digite:
```
    http://localhost:8080/apidocs/index.html
```
Y estara directamente en la documentación del proyecto. O si lo prefiere de otra forma, puede
usar el archivo index.html que se encuentra en la siguiente ruta del proyecto:
```
    Laboratorio-No.01-AREP/docs/index.html
```
donde tambien podra acceder a la documentación del proyecto.