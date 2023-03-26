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
public class SopaDeLetras {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        String[] palabras = new String[5];
        char[][] sopa = new char[20][20];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
            palabras[i] = leer.next();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingresa de nuevo: ");
                palabras[i] = leer.next();
            }
        }
        

    }
}
