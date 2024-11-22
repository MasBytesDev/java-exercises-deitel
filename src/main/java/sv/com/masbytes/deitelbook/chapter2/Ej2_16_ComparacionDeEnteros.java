/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga 
los números del usuario y muestre el número más grande, seguido de las palabras 
“es más grande”. Si los números son iguales, imprima el mensaje “Estos números 
son iguales”
 */
/**
 *
 * @author rober
 */
public class Ej2_16_ComparacionDeEnteros {

    static Scanner input = new Scanner(System.in);
    static final String DATO_INVALIDO = "Ingrese un dato valido.";

    public static void main(String[] args) {

        int primerNumero = pideNumero("Ingrese el primer numero entero: ");
        int segundoNumero = pideNumero("Ingrese el segundo numero entero: ");

        //  Llamado al metodo que compara los numeros.
        comparaNumeros(primerNumero, segundoNumero);

        input.close();

    }

    /**
     * Solicita un numero entero al usuario.
     *
     * @param mensaje Mensaje que se le muestra al usuario para ingresar un
     * numero.
     * @return El numero ingresado por el usuario.
     */
    public static int pideNumero(String mensaje) {
        int numeroIngresado = Integer.MIN_VALUE;    // Valor por defecto si no es un numero válido.
        boolean numeroValido = false;
        // Ciclo para garantizar que se ingrese un numero valido
        while (!numeroValido) {
            try {
                System.out.println(mensaje);    //  Muestra mensaje
                numeroIngresado = input.nextInt();  //  Lee el numero ingresado
                numeroValido = true;    //  Si no hay un error, es un numero valido
            } catch (InputMismatchException e) {
                // En caso de error de tipo de dato, se muestra el mensaje
                System.out.println(DATO_INVALIDO);
                input.nextLine();   //  Limpia el buffer
            }
        }
        return numeroIngresado; //  Retorna el numero ingresado
    }

    /**
     * Compara dos numeros y muestra el mas grande o indica si son iguales.
     *
     * @param primerNumero El primero de los numeros ingresados por el usuario.
     * @param segundoNumero El segundo de los numeros ingresados por el usuario.
     */
    public static void comparaNumeros(int primerNumero, int segundoNumero) {
        // Mensaje mostrando los numeros que el usuario ingreso.
        System.out.printf("Ud. ha ingresado los numeros %d y %d.%n", primerNumero, segundoNumero);
        // Comprobacion de igualdad
        if (primerNumero == segundoNumero) {
            System.out.println("Estos numeros son iguales.");
            // Si el primer numero es mayor
        } else if (primerNumero > segundoNumero) {
            System.out.printf("%d es mas grande que %d.%n", primerNumero, segundoNumero);
            // Si el segundo numero es mayor
        } else {
            System.out.printf("%d es mas grande que %d%n", segundoNumero, primerNumero);
        }
    }

}
