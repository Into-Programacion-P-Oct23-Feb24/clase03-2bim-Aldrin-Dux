/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // forma 1
        int[][] arreglo1 = new int[3][4]; //
        System.out.printf("Uso de la opción length: %d\n", arreglo1.length);

        System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]);

        arreglo1[0][2] = 1000;
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                System.out.printf("ingresar valor de la posicion [%d][%d]\n",
                        f, c);
                int numero = entrada.nextInt(); 
                if (numero >= 10 && numero%2 == 0) {
                    arreglo1[f][c] = 0;
                }else{
                    arreglo1[f][c] = numero;
                }
            }
        /*
            Se ingreso un numero para que este con la condicional se vaya mmoviendo
            y asignando valor a las posiciones donde este en ese momento, pero 
            ya que se debe ver que si es par y mayor a 10 se hace una condicional
            donde al ingresar el numero la condicional vea que si cumple con ello
            el valor ingresado se anule y se designe como 0
        */
        }

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("fila[%d] columna[%d] = %d\n",
                        fila, col, arreglo1[fila][col]);
            }
        }

    }

}
