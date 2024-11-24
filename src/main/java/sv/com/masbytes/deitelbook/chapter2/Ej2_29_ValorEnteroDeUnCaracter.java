/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.Scanner;

/*
Escriba una aplicación que muestre los equivalentes enteros de algunas letras en mayúsculas, en minúsculas, 
dígitos y símbolos especiales.

 */
/**
 *
 * @author rober
 */
public class Ej2_29_ValorEnteroDeUnCaracter {

    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_MESSAGE = "Debe de ingresar un unico caracter.";

    public static void main(String[] args) {
        // Solicitar un carácter al usuario
        char caracter = pideCaracter("Ingrese un caracter para obtener su valor entero: ");

        // Obtener y mostrar el valor entero del carácter
        int valorEntero = obtenerValorEnteroDeCaracter(caracter);
        System.out.printf("El valor entero del caracter '%c' es: %d%n", caracter, valorEntero);

        input.close();
    }

    /**
     * Solicita al usuario un único carácter.
     *
     * @param mensaje Mensaje mostrado al usuario.
     * @return El carácter ingresado por el usuario.
     */
    public static char pideCaracter(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String entrada = input.nextLine(); // Leer la entrada del usuario

            // Validar que el usuario ingresó exactamente un carácter
            if (entrada.length() == 1) {
                return entrada.charAt(0); // Retornar el carácter ingresado
            } else {
                System.out.println(INVALID_INPUT_MESSAGE);
            }
        }
    }

    /**
     * Método que obtiene el valor entero de un carácter.
     *
     * @param caracter El carácter ingresado por el usuario.
     * @return El valor entero del carácter.
     */
    public static int obtenerValorEnteroDeCaracter(char caracter) {
        return (int) caracter; // Conversión explícita del carácter a entero
    }

}
