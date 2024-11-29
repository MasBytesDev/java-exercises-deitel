/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Escriba un programa que reciba cinco números, y que determine e imprima la cantidad de números negativos, 
positivos, y la cantidad de ceros recibidos 
 */

/** 
 * La clase Ej2_32_NegativosPositivosCeros implementa una aplicación que recibe cinco números 
 * ingresados por el usuario y cuenta cuántos de ellos son positivos, negativos o ceros. 
 * También maneja entradas no válidas. 
 * 
 * @author rober 
 */

public class Ej2_32_NegativosPositivosCeros {

    /** 
     * Mensaje que se muestra al usuario cuando se ingresa un dato no válido. 
     */
    private static final String INVALID_INPUT_DATA = "Ingrese un dato valido por favor.";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int contador = 0;

        /** 
         * Ciclo que recibe cinco números del usuario, maneja entradas no válidas, 
         * y cuenta cuántos números son positivos, negativos o ceros. 
         */
        while (contador < 5) {
            System.out.println("Digite un numero entero");
            try {
                int numeroDigitado = input.nextInt();
                if (numeroDigitado > 0) {
                    positivos++;
                } else if (numeroDigitado == 0) {
                    ceros++;
                } else {
                    negativos++;
                }
                contador++;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }

        /** 
         * Muestra el conteo de números positivos, negativos y ceros recibidos. 
         */
        System.out.println("Positivos\t: " + positivos);
        System.out.println("Negativos\t: " + negativos);
        System.out.println("Nums. Cero\t: " + ceros);

    }

}
