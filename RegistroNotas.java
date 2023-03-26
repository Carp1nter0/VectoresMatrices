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
public class RegistroNotas {
    public static void main(String[] args) {
        
        double[] promedios = new double[10];

        
        Scanner leer = new Scanner(System.in);

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1));

            
            double nota1 = leer.nextDouble() * 0.1;
            double nota2 = leer.nextDouble() * 0.15;
            double nota3 = leer.nextDouble() * 0.25;
            double nota4 = leer.nextDouble() * 0.5;
            double promedio = nota1 + nota2 + nota3 + nota4;

           
            promedios[i] = promedio;
        }
        
    }
}
