# CameraReviews System
---
## Overview: Problema a resolver
Descripción..

La empresa "RandomCameraReviews" necesita un sistema que permita que fotografos profesionales suban "reviews" de Camaras fotograficas, para que cualquier persona desde cualquier parte del mundo pueda buscar los los reviews y comprarlas a travez de su portal.
La empresa cuenta con un equipo de developers especializado en frontEnd que realizara un portal para que los editores suban los "reviews" y los usuarios puedan verlos, y han solicitado que tu como especista en Backend, les proporciones un sistema, incluyendo API que permita  realizar lo siguiente:

* Subir reviews de Camaras fotograficas
* Obtener el contenido de los reviews para mostrarlo en vistas del portal en sus versiones web y mobile.
* Manejo de usuarios para editores (no incluye visitantes que leen los reviews)

Tambien se sabe que la empresa "RandomCameraReviews" planea distribuir mayormente en America del Sur donde esta su mercado mas grande, pero tambien tienen ventas en norte america, Europa, y muy pocas en Asia.
### Alcance(Scope)
Descripción..

#### Casos de uso
Descripcion...
* Como editor quiero subir un review de una camara
* Como editor quiero subir un review de lente para las camaras
* Como editor quiero subir un review de cualquier objeto relacionado con la fotogarfia
* Como lector quiero poder leer los reviews
* Como lector quiero puntear reviews
* Como lector quiero puntear comentar
* Como lector quiero viajar a travéz de categorias
* Como lector quiero buscar reviews especificas
* Como administrador quiero gestionar mis editores

#### Out of Scope (casos de uso No Soportados)
Descripcion...
* Como usuario no registrado quiero subir un review de una camara
* Como usuario no registrado quiero puntear un review
* Como usuario no registrado quiero comentar en un review
* Como administrador quiero obtener estadisticas de los reviews
---
## Arquitectura

### Diagramas
poner diagramas de secuencia, uml, etc

### Modelo de datos
Poner diseño de entidades, Jsons, tablas, diagramas entidad relación, etc..

---
## Limitaciones
Lista de limitaciones conocidas. Puede ser en formato de lista.
Ej.
* Llamadas al API que permite subir un review, no excede los limites de latencia 500ms
* Llamadas al API que permite obtener reviews para lectura deben tener una latencia menor a 100ms
---
## Costo
Descripción/Análisis de costos

Contemplatando 1000 usuarios diarios, que visitan recurrentemente cada hora:

Ejemplo:

"Considerando N usuarios diarios, M llamadas a X servicio/baseDatos/etc"
* 1000 llamadas diarias a serverless functions. $XX.XX
* 1000 read/write units diarias a X Database on-demand. $XX.XX
  Total: $xx.xx (al mes/dia/año)