# MasterMind - Solución mvp.pm.ClienteServidor

Jaime Hernández Ortiz - jaime.hernandezortiz@gmail.com

# Indice
 - [Funcionalidad gráficos](#Funcionalidad-gráficos)
 - [Vista de Lógica/Diseño](#Vista-de-LógicaDiseño)
    * [Arquitectura](#Arquitectura)
    * [Paquete mastermind](#Paquete-mastermind)
    * [Paquete mastermind.views](#Paquete-mastermindviews)
    * [Paquete mastermind.controllers](#Paquete-mastermindcontrollers)
    * [Paquete mastermind.models](#Paquete-mastermindmodels)
    * [Paquete mastermind.utils](#Paquete-mastermindutils)
 - [Calidad del Software](#Calidad-del-Software)
    * [Diseño](#Diseño)
 - [Vista de Desarrollo/Implementación](#Vista-de-DesarrolloImplementación)
 - [Vista de Despliegue/Física](#Vista-de-DespliegueFísica)
 - [Vista de Procesos](#Vista-de-Procesos)

# Funcionalidad gráficos
 - [Wiki](https://en.wikipedia.org/wiki/Mastermind_(board_game))
    - Funcionalidad: Gráficos
    - Interfaz: Texto
    - Distribución: StandAlone
    - Persistencia: No
 
    ![MasterMind](https://github.com/zuldare/masterCloudURJC-1-calidad-softwar/mvp.pm.ClienteServidor/docs/images/300px-mastermind.jpg?raw=true)
 
# Vista de Lógica/Diseño
Modelo/Vista/Presentador con presentador del modelo

* Patrón Command, para el menú

* Patrón Composite, para multi-controladores

* Patrón Memento, para la funcionalidad undo/redo

## Arquitectura
![architecture](/docs/images/MasterMindArquitecture.png?raw=true)

## Paquete mastermind
NOT FINISHED, THIS VERSION IS FROM COMPOSITE
![mastermind](/docs/images/PackageMasterMind.png?raw=true)

## Paquete mastermind.views 
NOT FINISHED, THIS VERSION IS FROM COMPOSITE
![mastermind.views](/docs/images/PackageMasterMindViews.png?raw=true)

## Paquete mastermind.controllers
NOT FINISHED, THIS VERSION IS FROM COMPOSITE
![mastermind.controllers](/docs/images/PackageMasterMindControllers.png?raw=true)

## Paquete mastermind.models
NOT FINISHED, THIS VERSION IS FROM COMPOSITE
![mastermind.models](/docs/images/PackageMasterMindModels.png?raw=true)

## Paquete mastermind.utils
NOT FINISHED, THIS VERSION IS FROM COMPOSITE
![mastermind.utils](/docs/images/PackageMasterMindUtils.png?raw=true)

# Calidad del Software

## Diseño

- **Principio de Sustitución de Liskov**: las vistas preguntan por el tipo de controlador polimórfico
  
# Vista de Desarrollo/Implementación
![development](/docs/images/MasterMindDevelopment.png?raw=true)
![development](/docs/images/MasterMindDevelopmentClient.png?raw=true)
![development](/docs/images/MasterMindDevelopmentServer.png?raw=true)

# Vista de Despliegue/Física
![deployment](/docs/images/MasterMindDeployment.png?raw=true)

## Vista de Procesos

-   No hay concurrencia

Last updated 2020-10-18