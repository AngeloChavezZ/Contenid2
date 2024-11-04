# Sistema de Gestión de Contenidos Audiovisuales

## Descripción del Proyecto
Este proyecto es una aplicación desarrollada en Java para gestionar distintos tipos de contenidos audiovisuales, incluyendo películas, series de televisión, documentales, videos de YouTube, y cortometrajes. Cada tipo de contenido tiene atributos y métodos específicos, y el sistema permite gestionar la relación entre ellos de manera orientada a objetos.

### Objetivos y Propósito del Proyecto
- Facilitar la gestión de diferentes tipos de contenido audiovisual en una sola aplicación.
- Proporcionar una estructura extensible y modular que permite añadir nuevos tipos de contenido fácilmente.
- Implementar relaciones de agregación y composición para representar la conexión entre distintos tipos de contenidos (por ejemplo, una serie y sus temporadas, o un documental y sus investigadores).

## Clases y Funcionalidades
- **Pelicula**: Representa una película y permite asociar actores. Métodos principales:
  - `agregarActor(Actor actor)`: Agrega un actor a la película.
  - `mostrarDetalles()`: Muestra los detalles de la película.
  
- **SerieDeTV**: Representa una serie de televisión con múltiples temporadas.
  - `agregarTemporada(Temporada temporada)`: Agrega una temporada a la serie.
  - `mostrarDetalles()`: Muestra los detalles de la serie, incluyendo sus temporadas y episodios.

- **Documental**: Representa un documental y permite asociar investigadores.
  - `agregarInvestigador(Investigador investigador)`: Agrega un investigador al documental.
  - `mostrarDetalles()`: Muestra los detalles del documental y los investigadores asociados.

- **VideoYouTube**: Representa un video de YouTube con un canal y un contador de vistas.
  - `mostrarDetalles()`: Muestra los detalles del video, incluyendo el canal y el número de vistas.

- **Cortometraje**: Representa un cortometraje, con atributos específicos como el director.
  - `mostrarDetalles()`: Muestra los detalles del cortometraje, incluyendo el nombre del director.

## Instrucciones para Clonar y Ejecutar el Proyecto

### Requisitos
- **Java JDK** (versión 8 o superior)
- **Git** (para clonar el repositorio)

### Instalación y Ejecución

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git

  ## Mejoras Adicionales Implementadas

- **Pruebas Unitarias**: Se han implementado pruebas básicas para asegurar el funcionamiento correcto de las clases y sus métodos. Estas pruebas ayudan a verificar que los métodos `mostrarDetalles()`, `agregarActor()`, `agregarTemporada()`, entre otros, funcionen como se espera.

- **Optimización de Código**: El código fue revisado y optimizado para mejorar su eficiencia y legibilidad. 

- **Documentación del Código**: Se añadieron comentarios en el código fuente, explicando el propósito de cada clase, atributo y método. Esto facilita la comprensión y el mantenimiento del proyecto para futuros desarrolladores.

- **Manejo de Excepciones**: Se añadieron bloques de manejo de excepciones en la clase `TestSistema` para capturar y gestionar posibles errores en tiempo de ejecución.


