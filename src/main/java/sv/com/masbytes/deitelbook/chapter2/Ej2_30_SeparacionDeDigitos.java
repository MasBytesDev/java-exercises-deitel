/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número 
en sus dígitos individuales y los imprima, cada uno separado de los demás por tres espacios. Por ejemplo, si 
el usuario escribe el número 42339, el programa debe imprimir:

4   2   3   3   9

Suponga que el usuario escribe el número correcto de dígitos. ¿Qué ocurre cuando escribe un número con más de 
cinco dígitos? ¿Qué ocurre cuando escribe un número con menos de cinco dígitos? [Sugerencia:es posible hacer 
este ejercicio con las técnicas que aprendió en este capítulo. Necesitará utilizar las operaciones de división 
y residuo para “seleccionar” cada dígito].
 */
/**
 *
 * @author rober
 */
public class Ej2_30_SeparacionDeDigitos {

    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido por favor.";
    static final String INVALID_NUMBER_MESSAGE = "Ingrese un numero de 5 digitos por favor.";

    public static void main(String[] args) {

        int numero = pideNumero("Ingrese un numero de 5 digitos por favor.");
        
        //  Llamado al metodo que separa el numero en sus digitos individuales
        separaDigitos(numero);
        
        input.close();

    }

    /**
     * Solicita un numero de 5 digitos al usuario
     *
     * @param mensaje Solicitud de un numero al usuario
     * @return El numero ingresado
     */
    public static int pideNumero(String mensaje) {
        int numeroIngresado = Integer.MIN_VALUE;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                System.out.println(mensaje);
                numeroIngresado = input.nextInt();
                if (numeroIngresado > 9999 && numeroIngresado <= 99999) {
                    numeroValido = true;
                } else {
                    System.out.println(INVALID_NUMBER_MESSAGE);
                }
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_MESSAGE);
                input.nextLine();
            }
        }
        return numeroIngresado;
    }

    /**
     * Separa en sus digitos individuales el numero ingresado
     * 
     * @param numero El numero ingresado por el usuario 
     */
    public static void separaDigitos(int numero) {
        // Extrae cada dígito usando división y módulo
        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito3 = (numero % 1000) / 100;
        int digito4 = (numero % 100) / 10;
        int digito5 = numero % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", digito1, digito2, digito3, digito4, digito5);
    }

}
