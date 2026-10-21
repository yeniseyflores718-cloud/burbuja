# Práctica: Algoritmos de Ordenamiento por Burbuja 🧹✨

Este proyecto contiene la implementación y comparación del algoritmo de ordenamiento por **Burbuja Tradicional** y **Burbuja Mejorada (Optimizado)** en el lenguaje Java.

## Descripción

El objetivo de esta práctica es analizar la eficiencia de ambos algoritmos mediante el conteo de pasadas realizadas sobre arreglos de datos desordenados y parcialmente ordenados.

## Métodos Implementados

1. **Burbuja Tradicional (`ordenamientoBurbuja`):**
   * Recorre el arreglo de manera fija completando $n-1$ pasadas, independientemente de si el arreglo se ordena antes de tiempo.
2. **Burbuja Mejorada (`ordenamientoBurbujaMejorado`):**
   * Utiliza una variable bandera (`intercambio`) y una instrucción `break` para detener el proceso de inmediato si en una pasada no ocurre ningún intercambio de elementos.

## Resultados y Evidencia

En la clase principal (`Main` / `EstructuraDeDatosPracticas`), se aplicaron ambos métodos observando el siguiente comportamiento en consola:

* **Burbuja Tradicional:** Con un arreglo de 7 elementos desordenados, ejecutó las **6 pasadas completas**.
* **Burbuja Mejorada:** Con un arreglo parcialmente ordenado, finalizó en tan solo **2 pasadas** gracias a la detección temprana de ordenamiento.
*  **Burbuja Meorada:** con un arreglo ordenado, finalizó con un a pasada


* **Estructura del Proyecto:** Maven / Ant con paquetes `com.uthh.edd.unidad1.recursion`
