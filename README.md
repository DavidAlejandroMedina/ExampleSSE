# Descripción
Este proyecto es una demostración de la implementación de Server-Sent Events (SSE) utilizando Spring Boot. Los eventos enviados por el servidor permiten una comunicación en tiempo real entre el servidor y los clientes a través de una conexión unidireccional, donde el servidor puede enviar actualizaciones automáticas a los navegadores o clientes conectados sin la necesidad de recibir constantemente solicitudes.

## Tecnologías
- Java (JDK 8 o superior)
- Spring Boot (estructura de backend)
- HTML/JavaScript (frontend)
- Gradle o Maven (gestor de dependencias)

# Lógica del proyecto
## Backend (Spring Boot)
El servidor expone un endpoint `/sse` que utiliza **SseEmitter** para enviar eventos de manera continua a los clientes conectados. Para este caso solo envía una marca de tiempo.

## Frontend (HTML/JavaScript)
El cliente usa la interfaz **EventSource** para conectarse al endpoint `/sse` y recibir los eventos del servidor. Cada evento recibido se muestra en la página web en tiempo real. 

Se maneja cualquier error cerrando la conexión si ocurre un fallo.
