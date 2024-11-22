/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que lea un entero y que determine e imprima si es impar o par 
[Sugerencia: use el operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo 
de 2 deja un residuo de 0 cuando se divide entre 2].
*/

/**
 *
 * @author rober
 */
public class Ej2_25_ParOImpar {
    
    static Scanner input = new Scanner (System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido.";
    static final String INVALID_NUMBER_ZERO = "Ingrese un valor diferente a cero.";
    
    public static void main(String[] args) {
        
        int numero = pideNumero("Ingrese un numero entero: ");
        
        //  Llamado al metodo que muestra el resultado
        muestraResultado(esPar(numero), numero);
        
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
                if(numeroIngresado !=0){
                    numeroValido = true;    //  Si no hay un error, es un numero valido
                } else {
                    System.out.println(INVALID_NUMBER_ZERO);
                }                
            } catch (InputMismatchException e) {
                // En caso de error de tipo de dato, se muestra el mensaje
                System.out.println(INVALID_INPUT_MESSAGE);
                input.nextLine();   //  Limpia el buffer
            }
        }
        return numeroIngresado; //  Retorna el numero ingresado
    };
    
    /**
     * Metodo que determina si un numero es par
     * 
     * @param numero El numero ingresado por el usuario
     * @return true si el numero es par
     */
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
    
    /**
     * Metodo que muestra el resultado del ejercicio
     * @param esPar El valor retornado por el metodo 'esPar'
     * @param numero El numero ingresado por el usuario
     */
    public static void muestraResultado(boolean esPar, int numero){
        if(esPar){
            System.out.println(numero + " es numero PAR.");
        } else {
            System.out.println(numero + " es numero IMPAR");
        }
    }
    
}
