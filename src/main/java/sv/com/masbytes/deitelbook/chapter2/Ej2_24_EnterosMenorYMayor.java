/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros mayor y menor en el grupo. 
 */
/**
 *
 * @author rober
 */
public class Ej2_24_EnterosMenorYMayor {

    //  Objeto del tipo Scanner que leera la informacion ingresada por el usuario
    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido.";

    public static void main(String[] args) {

        int primerNumero = pideNumero("Ingrese el primer numero entero: ");
        int segundoNumero = pideNumero("Ingrese el segundo numero entero: ");
        int tercerNumero = pideNumero("Ingrese el tercer numero entero: ");
        int cuartoNumero = pideNumero("Ingrese el cuarto numero entero: ");
        int quintoNumero = pideNumero("Ingres el quinto numero entero: ");

        //  Llamado a los metodos que determinan al numero mayor y menor de los
        //  numeros ingresados.
        int numeroMayor = esMayor(primerNumero, segundoNumero, tercerNumero, cuartoNumero, quintoNumero);
        int numeroMenor = esMenor(primerNumero, segundoNumero, tercerNumero, cuartoNumero, quintoNumero);
        
        //  Llamado al metodo que muestra los resultados
        muestraResultados(numeroMayor, numeroMenor);
        
        input.close();

    }

    /**
     * Solicita un numero entero al usuario.
     *
     * @param mensaje Mensaje que se le muestra al usuario para ingresar un numero.
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
                System.out.println(INVALID_INPUT_MESSAGE);
                input.nextLine();   //  Limpia el buffer
            }
        }
        return numeroIngresado; //  Retorna el numero ingresado
    }

    /**
     * Metodo que determina el numero mayor de todos los numeros ingresado
     *
     * @param primerNumero El primero de los numeros ingresados
     * @param segundoNumero El segundo de los numeros ingresados
     * @param tercerNumero El tercero de los numeros ingresados
     * @param cuartoNumero El cuarto de los numeros ingresados
     * @param quintoNumero El quinto de los numeros ingresados
     * @return El numero mayor de todos los ingresados
     */
    public static int esMayor(int primerNumero, int segundoNumero, int tercerNumero, int cuartoNumero, int quintoNumero) {
        return Math.max(primerNumero, Math.max(segundoNumero, Math.max(tercerNumero, Math.max(cuartoNumero, quintoNumero))));
    }

    /**
     * Metodo que determina el numero menor de todos los numeros ingresado
     *
     * @param primerNumero El primero de los numeros ingresados
     * @param segundoNumero El segundo de los numeros ingresados
     * @param tercerNumero El tercero de los numeros ingresados
     * @param cuartoNumero El cuarto de los numeros ingresados
     * @param quintoNumero El quinto de los numeros ingresados
     * @return El numero menor de todos los ingresados
     */
    public static int esMenor(int primerNumero, int segundoNumero, int tercerNumero, int cuartoNumero, int quintoNumero) {
        return Math.min(primerNumero, Math.min(segundoNumero, Math.min(tercerNumero, Math.min(cuartoNumero, quintoNumero))));
    }

    /**
     * Metodo que muestra el numero mayor y menor de todos los numeros ingresados
     *
     * @param numeroMayor El numero mayor de todos los ingresados
     * @param numeroMenor El numero menor de todos los ingresados
     */
    public static void muestraResultados(int numeroMayor, int numeroMenor) {
        System.out.println("Numero Mayor\t: " + numeroMayor);
        System.out.println("Numero Menor\t: " + numeroMenor);
    }

}
