/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e imprima el resultado. 
[Sugerencia: use el operador residuo].
*/

/**
 *
 * @author rober
 */
public class Ej2_26_Multiplos {
    
    //  Objeto scanner que leera los datos ingresados por el usuario
    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_MESSAGE = "Por favor ingrese un numero entero válido.";
    static final String ERROR_ZERO_INPUT = "Ingrese un valor diferente de cero.";
    
    public static void main(String[] args) {
        
        int primerNumero = pideNumero("Ingrese el primer numero entero: ");
        int segundoNumero = pideNumero("Ingrese el segundo numero entero: ");
        
        //  Llamado al metodo que muestra los resultados
        muestraResultado(esMultiplo(primerNumero, segundoNumero), primerNumero, segundoNumero);
        
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
                    System.out.println(ERROR_ZERO_INPUT);
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
     * Metodo que verifica si el primer numero ingresado es multiplo
     * del segundo numero ingresado.
     * 
     * @param primerNumero Primer numero ingresado por el usuario
     * @param segundoNumero Segundo numero ingresado por el usuario
     * @return true si el primer numero es multiplo del segundo
     */
    public static boolean esMultiplo(int primerNumero, int segundoNumero){
        if(segundoNumero !=0){
            return primerNumero % segundoNumero == 0;
        } else {
            System.out.println(ERROR_ZERO_INPUT);
            return false;
        }        
    }
    
    /**
     * Metodo que muestra el resultado de la verificacion si el primer
     * numero ingresado es multiplo del segundo numero.
     * 
     * @param esMultiplo Valor retornado por el metodo 'esMultiplo'
     * @param primerNumero Primer numero ingresado por el usuario
     * @param segundoNumero Segundo numero ingresado por el usuario
     */
    public static void muestraResultado(boolean esMultiplo, int primerNumero, int segundoNumero){
        if(esMultiplo){
            System.out.println(primerNumero + " es multiplo de " + segundoNumero);
        } else {
            System.out.println(primerNumero + " NO es multiplo de " + segundoNumero);
        }
    }
    
}
