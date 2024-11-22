/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, promedio, producto, menor 
y mayor de esos números. [Nota: el cálculo del promedio en este ejercicio debe dar como resultado una 
representación entera del promedio. Por lo tanto, si la suma de los valores es 7, el promedio debe ser 2, 
no 2.3333...]
*/

/**
 *
 * @author rober
 */
public class Ej2_17_AritmeticaMayorYMenor {
    
    //  Creacion de objeto del tipo Scanner para leer los datos ingresados por el usuario.
    static Scanner input = new Scanner (System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido.";
    
    public static void main(String[] args) {
        
        int primerNumero = pideNumero("Ingrese el primer numero entero: ");
        int segundoNumero = pideNumero("Ingrese el segundo numero entero: ");
        int tercerNumero = pideNumero("Ingrese el tercer numero entero: ");
        
        //  Llamado a los metodos que determinan el numero mayor y menor
        int numeroMayor = esMayor(primerNumero, segundoNumero, tercerNumero);
        int numeroMenor = esMenor(primerNumero, segundoNumero, tercerNumero);
        
        //  Llamado al metodo que muestra todos los resultados
        muestraResultados(primerNumero, segundoNumero, tercerNumero, numeroMayor, numeroMenor);
        
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
                System.out.println(INVALID_INPUT_MESSAGE);
                input.nextLine();   //  Limpia el buffer
            }
        }
        return numeroIngresado; //  Retorna el numero ingresado
    }
    
    /**
     * Determina el numero mayor de los numeros ingresados.
     * 
     * @param primerNumero El primero de los numeros ingresados
     * @param segundoNumero El segundo de los numeros ingresados
     * @param tercerNumero El tercero de los numeros ingresados
     * @return El numero mayor de los numeros ingresados
     */
    public static int esMayor(int primerNumero, int segundoNumero, int tercerNumero){
        return Math.max(primerNumero, Math.max(segundoNumero, tercerNumero));
    }
    
    /**
     * Determina el numero menor de los numeros ingreados
     * 
     * @param primerNumero El primero de los numeros ingresados
     * @param segundoNumero El segundo de los numeros ingresados
     * @param tercerNumero El tercero de los numeros ingresados
     * @return El numero menor de los numeros ingresados
     */
    public static int esMenor(int primerNumero, int segundoNumero, int tercerNumero){
        return Math.min(primerNumero, Math.min(segundoNumero, tercerNumero));
    }
    
    /**
     * Muestra los resultados de la suma, promedio, producto, 
     * número mayor y número menor de los tres números.
     * 
     * @param primerNumero El primer número ingresado
     * @param segundoNumero El segundo número ingresado
     * @param tercerNumero El tercer número ingresado
     * @param numeroMayor El número mayor de los tres
     * @param numeroMenor El número menor de los tres
     */
    public static void muestraResultados(int primerNumero, int segundoNumero, int tercerNumero, int numeroMayor, int numeroMenor){
        System.out.println("***RESULTADOS***");
        System.out.println("---");
        System.out.printf("Suma\t\t: %d%n", primerNumero + segundoNumero + tercerNumero);
        System.out.printf("Promedio\t: %d%n", (primerNumero + segundoNumero + tercerNumero) / 3);
        System.out.printf("Producto\t: %d%n", primerNumero * segundoNumero * tercerNumero);
        System.out.println("Numero Mayor\t: " + numeroMayor);
        System.out.println("Numero Menor\t: " + numeroMenor);
        System.out.println("---");
    }
    
}
