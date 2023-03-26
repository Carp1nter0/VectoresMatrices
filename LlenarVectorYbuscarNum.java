/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class LlenarVectorYbuscarNum {
    public static void main(String[] args) {
        
        int dimension = 100;
        
        int [] vector = new int[dimension];
        
         Random rand = new Random();
        for (int i = 0; i < dimension; i++) {
            vector[i] = rand.nextInt(100);
        }
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número a buscar en el vector: ");
        int num = scanner.nextInt();
        
       boolean encontrado = false;
        int indice = -1;
        for (int i = 0; i < dimension; i++) {
            if (vector[i] == num) {
                if (encontrado) {
                    System.out.println("El número " + num + " se encuentra repetido en los índices " + indice + " y " + i);
                } else {
                    System.out.println("El número " + num + " se encuentra en el índice " + i);
                }
                encontrado = true;
                indice = i;
            }
        }

        // Si no se encontró el número
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
        
    }
    
    
}
