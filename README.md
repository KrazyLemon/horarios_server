# Api para la plataforma de generacion de horarios

## Descripcion
Api para la plataforma de generacion de horarios del Tecnologico de Estudios Superiores de Cuautitlan Izcalli

## Instalacion
Para instalar la api es necesario tener instalado JDK 23.0.1 una vez instalado se debe de clonar el repositorio y ejecutarlo desde un IDE

Tambien se puede ejecutar el siguiente comando para generar un archivo jar y ejecutarlo
```bash
  ./gradlew build
```

Si no tiene aun creada la base de datos puede copiar las colecciones desde la siguiente ruta
```bash
    src/main/resources/horarios.grupos.json
    src/main/resources/horarios.materias.json
    src/main/resources/horarios.docentes.json
    src/main/resources/horarios.salones.json
```
e importala en su base de datos mongodb 

## Uso
Para hacer uso de la api se debe de utilizar el programa de horarios_client que se encuentra en el siguiente repositorio
![img.png](img.png)


## Rutas
/materias
  - GET: Obtiene todas las materias
  - POST: Crea una nueva materia
  - PUT: Actualiza una materia
  - DELETE: Elimina una materia

/docentes
  - GET: Obtiene todos los docentes
  - POST: Crea un nuevo docente
  - PUT: Actualiza un docente
  - DELETE: Elimina un docente

/grupos
  - GET: Obtiene todos los grupos
  - POST: Crea un nuevo grupo
  - PUT: Actualiza un grupo
  - DELETE: Elimina un grupo

/salones
- GET: Obtiene todos los salones 
- POST: Crea un nuevo salon
- PUT: Actualiza un salon 
- DELETE: Elimina un salon

## Tecnologias
- Java
- Spring Boot
- Gradle

## Autor
    Angel Eduardo Velazquez Morales 

