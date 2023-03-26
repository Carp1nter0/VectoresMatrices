/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra_ejercicio7 {

    /**
     * @param args the command line arguments
     * Realizar un programa que complete un vector con los N primeros números
     * de la sucesión de Fibonacci.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la secuencia de la sucesion de Fibonacci que desea averiguar");
        int secuencia = leer.nextInt();
        rellenado (secuencia);
        
    }
    public static void rellenado( int secuencia){
        int [] vector = new int [secuencia];
        vector [0]=0;
        vector [1]=1;
        int i;
        for ( i=2; i<secuencia;i++){
            vector [i]= (vector [i-1]+vector[i-2]);
        }
        System.out.println("La secuencia hasta el numero indicado es:");
        for (i=0; i<secuencia;i++){
            System.out.print(vector[i] +" ");
        }
    }
    
}
