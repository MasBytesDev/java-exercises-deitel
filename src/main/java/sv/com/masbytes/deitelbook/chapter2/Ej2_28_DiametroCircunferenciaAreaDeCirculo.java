/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, 
la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π.
Puede utilizar la constante predefinida Math.PI para el valor de π. Esta constante es más precisa que el valor 
3.14159. Use las siguientes fórmulas (r es el radio):
diámetro = 2r
circunferencia = 2πr
área = πr^2
No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo como el va-
lor que se imprimirá en una instrucción System.out.printf. Los valores producidos por los cálculos del área y de 
la circunferencia son números de punto flotante. Dichos valores pueden imprimirse con el especificador de formato 
%f en una instrucción System.out.printf.
*/

/**
 *
 * @author rober
 */
public class Ej2_28_DiametroCircunferenciaAreaDeCirculo {
    
    static Scanner input = new Scanner (System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido por favor.";
    static final String ERROR_ZERO_INPUT = "Ingrese un valor diferente de cero.";
    
    public static void main(String[] args) {
        
        double radio = pideNumero("Ingrese el radio del circulo: ");
        
        //  Llama al metodo que calcula las propiedades del circulo
        calculaPropiedadesDelCirculo(radio);
        
        input.close();
        
    }
    
    /**
     * Solicita un numero entero al usuario.
     *
     * @param mensaje Mensaje que se le muestra al usuario para ingresar un numero.
     * @return El numero ingresado por el usuario.
     */
    public static double pideNumero(String mensaje) {
        double numeroIngresado = Double.MIN_VALUE;    // Valor por defecto si no es un numero válido.
        boolean numeroValido = false;
        // Ciclo para garantizar que se ingrese un numero valido
        while (!numeroValido) {
            try {
                System.out.println(mensaje);    //  Muestra mensaje
                numeroIngresado = input.nextDouble();  //  Lee el numero ingresado
                if(numeroIngresado > 0){
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
     * Metodo que calcula el diametro, circunferencia y area de un circulo
     * 
     * @param radio El radio ingresado por el usuario
     */
    public static void calculaPropiedadesDelCirculo(double radio){
        System.out.println("**PROPIEDADES DEL CIRCULO**");
        System.out.println("Radio\t: " + radio);
        System.out.println("---");
        System.out.printf("Diametro\t: %.2f%n", 2 * radio);
        System.out.printf("Circunferencia\t: %.2f%n", 2 * Math.PI * radio);
        System.out.printf("Area\t\t: %.2f%n", Math.PI * Math.pow(radio, 2));
        System.out.println("---");
    }
    
}
