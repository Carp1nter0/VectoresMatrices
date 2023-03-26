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
import java.util.Scanner;

public class ContarDigitos {

    public static void main(String[] args) {

        // Tamaño del vector
        int N = 10;

        // Crear el vector
        int[] vector = new int[N];

        // Llenar el vector con valores ingresados por el usuario
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número entero: ");
            vector[i] = leer.nextInt();
        }

        // Contar los números de 1, 2, 3, 4 y 5 dígitos
        int[] conteo = new int[6];
        for (int i = 0; i < N; i++) {
            int digitos = contarDigitos(vector[i]);
            if (digitos >= 1 && digitos <= 5) {
                conteo[digitos]++;
            }
        }

        // Mostrar los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hay " + conteo[i] + " números de " + i + " dígito(s).");
        }

        // Cerrar el scanner
        leer.close();
    }

    // Función para contar los dígitos de un número entero
    public static int contarDigitos(int num) {
        if (num < 0) {
            num = -num;
        }
        if (num == 0) {
            return 1;
        }
        int digitos = 0;
        while (num > 0) {
            digitos++;
            num /= 10;
        }
        return digitos;
    }
}
