/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursion;
import java.util.Arrays;
/**
 *
 * @author Ariadna Yenisey
 */
public class burbuja {
 public static void ordenamientoBurbuja(int[] arreglo) {
    int n = arreglo.length;
    int pasadas = 0;
    // Bucle externo para las pasadas
    for (int i = 0; i < n - 1; i++) {
        pasadas++;
        // Bucle interno para comparar vecinos
        for (int j = 0; j < n - 1; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                // Intercambio usando la variable temporal
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }
    System.out.println("Pasadas realizadas: " + pasadas);
}
 
public static void ordenamientoBurbujaMejorado(int[] arreglo) {
    int n = arreglo.length;
    int pasadas = 0;
    boolean intercambio;
    
    for (int i = 0; i < n - 1; i++) {
        intercambio = false; // 1. Reiniciamos la bandera
        pasadas++;
        // 2. Recorremos e intercambiamos vecinos
        for (int j = 0; j < n - 1 - i; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
                
                intercambio = true; // 3. Marcamos que sí hubo cambio
            }
            
        }
        
        // 4. Si no hubo intercambios, el arreglo ya está ordenado
        if (!intercambio) {
            break; // 5. Salimos del ciclo antes de tiempo
        }
    }
    System.out.println("Pasadas realizadas: " + pasadas);
}

}
