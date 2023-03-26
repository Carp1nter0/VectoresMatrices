/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CuadradoMagico {
     public static void main(String[] args) {
         int[][] cuadrado = new int[3][3];
        Scanner leer = new Scanner(System.in);

        // Pedimos al usuario que introduzca los valores del cuadrado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el valor de la posición [" + i + "][" + j + "]: ");
                cuadrado[i][j] = leer.nextInt();
            }
        }

        // Comprobamos que los valores introducidos están entre 1 y 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Los valores introducidos deben estar entre 1 y 9.");
                    return;
                }
            }
        }
        
         // Calcular la suma de la primera fila
        int suma = 0;
        for (int j = 0; j < 3; j++) {
            suma += cuadrado[0][j];
        }
        
        // Verificar que las filas sumen lo mismo
        for (int i = 1; i < 3; i++) {
            int sumFila = 0;
            for (int j = 0; j < 3; j++) {
                sumFila += cuadrado[i][j];
            }
            if (sumFila != suma) {
                System.out.println("No es un cuadrado mágico.");
                System.exit(0);
            }
        }
        
         // Verificar que las columnas sumen lo mismo
        for (int j = 0; j < 3; j++) {
            int sumColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumColumna += cuadrado[i][j];
            }
            if (sumColumna != suma) {
                System.out.println("No es un cuadrado mágico.");
                System.exit(0);
            }
        }
        
        // Verificar que las diagonales sumen lo mismo
        if ((cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != suma) || 
            (cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != suma)) {
            System.out.println("No es un cuadrado mágico.");
            System.exit(0);
        }
         // Si llegamos hasta aquí, el cuadrado es mágico
        System.out.println("Es un cuadrado mágico.");

     }
}
