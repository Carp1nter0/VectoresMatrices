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
public class fibo {
     public static void main(String[] args) {
           Scanner leiendo = new Scanner(System.in);
        System.out.print("Ingrese el número N para generar la sucesión de Fibonacci: ");
        int n = leiendo.nextInt();
        
        
        

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("La sucesión de Fibonacci es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
     }
    
}
