/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
    /* Se hace una tabla para identificar el patron que tienen en su posicion
       los numeros a sumar para asi poder separarlos y llevar a cabo su suma 
       sin que se sumen los demas valores
    */
    public static void main(String[] args) {
        int suma = 0;
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                if (f == c) {
                    suma = suma + arreglo[f][c];
                }
            }
        }
        System.out.printf("Suma de los valores de las posiciones: 10"
                + ", 2, 4 es de:\n%d\n", suma);
    }
}
