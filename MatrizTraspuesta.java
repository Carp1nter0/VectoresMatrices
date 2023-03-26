/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices;

/**
 *
 * @author pc
 */
import java.util.Random;

public class MatrizTraspuesta {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        Random rand = new Random();

        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(10); // Números aleatorios del 0 al 9
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular la matriz traspuesta
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

    // Función auxiliar para mostrar la matriz por consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}