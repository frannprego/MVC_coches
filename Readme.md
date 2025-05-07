# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

---
## Diagrama de clases:

```mermaid
classDiagram
    class App {
        +main()
    }
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +crearCoche(String, String)
      }
      class View {
          +muestraVelocidad(String, Integer)
          +menu()
          }
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
    App --> View
      
```

---

## Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant App
    participant View
    participant Controller
    participant Model

    App->>+View: menu()
    activate View
    View->>Controller: crearCoche(String, String)
    activate Controller
    Controller->>Model: crearCoche(String, String)
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller-->>View: Coche
    deactivate Controller
    activate View
    View->>-View: System.out.println()
    deactivate View
    deactivate View
```

