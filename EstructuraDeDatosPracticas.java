/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.edd;
import static com.uthh.edd.unidad1.recursion.burbuja.ordenamientoBurbuja;
import static com.uthh.edd.unidad1.recursion.burbuja.ordenamientoBurbujaMejorado;
import com.uthh.edd.unidad1.recursion.recursividad;
import com.uthh.edd.unidad1.recursion.sumaElementosArreglo;
import com.uthh.edd.unidad1.recursion.fibonacci;
import com.uthh.edd.unidad1.recursion.palindromoRecursivo;
import java.util.Arrays;
/**
 *
 * @author Ariadna Yenisey
 */
public class EstructuraDeDatosPracticas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*recursividad r = new recursividad();
        int resultado = r.factorial(5);
        System.out.println("Resultado final: " + resultado);
        
        int[] numeros = {5, 10, 3};
        int suma = sumaElementosArreglo.sumar(numeros, 0);
        System.out.println("La suma es: " + suma);
        
        int resultadoFibonacci = fibonacci.fibonacci(5);

System.out.println("Fibonacci de 5: " + resultadoFibonacci);*/
     //palindromoRecursivo prueba = new palindromoRecursivo();

    //System.out.println("reconocer: " + prueba.esPalindromo("reconocer"));
    //System.out.println("radar: " + prueba.esPalindromo("radar"));
    //System.out.println("vacio: " + prueba.esPalindromo(""));
        
        
    //}
    // --- Prueba 1: Arreglo desordenado con Burbuja Tradicional ---
        int[] desordenado = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("=== PRUEBA 1: Burbuja Tradicional ===");
        System.out.println("Estado inicial: " + Arrays.toString(desordenado));
        
        ordenamientoBurbuja(desordenado);
        
        System.out.println("Estado final:   " + Arrays.toString(desordenado));
        System.out.println();

        // --- Prueba 2: Arreglo parcialmente ordenado con Burbuja Mejorada ---
        int[] parcialmenteOrdenado = {10, 20, 30, 50, 40};
        
        System.out.println("=== PRUEBA 2: Burbuja Mejorada ===");
        System.out.println("Estado inicial: " + Arrays.toString(parcialmenteOrdenado));
        
        ordenamientoBurbujaMejorado(parcialmenteOrdenado);
        
        System.out.println("Estado final:   " + Arrays.toString(parcialmenteOrdenado));
        // --- Prueba 3: Arreglo ordenado ---
        int[] ordenado = {1, 2, 3, 4, 5};
        System.out.println("=== PRUEBA 3: Burbuja Mejorada ===");
        System.out.println("Estado inicial: " + Arrays.toString(ordenado));
        
        ordenamientoBurbujaMejorado(ordenado);
        
        System.out.println("Estado final:   " + Arrays.toString(ordenado));
    }
    
}
