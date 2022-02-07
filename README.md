# Mp-Backend
Mp-Backend
---
Herramienta utilizada para el desarrollo del backend
```
Visual estudio code
```
Extensiones utilizadas
```
Spring Boot Dashboard
v0.2.0
Linea de comando 
ext install vscode-spring-boot-dashboard
```
```
Spring Boot Extension Pack v0.1.0
Spring Boot Tools v1.31.0
Spring Initializr Java Support v0.8.0
Maven for Java v0.35.0
Getter and Setter Generator v1.0.3
Extension Pack for Java v0.21.0
Debugger for Java v0.38.0

```
---
---
Insatalacion de pack de java el cual incluye el jdk necesario para el arranque del proyecto
```
- _[Coding pack for java](https://code.visualstudio.com/docs/languages/java)_ -
- ir a la seccion de 
- _[Install Visual Studio Code for Java](https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java)_-
selccionar la opcion de windows si asi fuera el caso
```
---
---
para correr el programa cuando se clone ir a carpetas
```
- src
  -main
    -java
      -com
        -mp
          -mp
            
- en la clase MpApplication.java enjecutar el comando F5 para correr el servicio
``` js
package com.mp.mp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpApplication.class, args);
	}

}
```




