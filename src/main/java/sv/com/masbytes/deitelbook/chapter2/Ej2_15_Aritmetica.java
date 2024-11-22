/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

/*
Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números 
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ej2_15_Aritmetica {

    static Scanner input = new Scanner(System.in);
    static final String DATOS_INVALIDOS = "Ingrese datos válidos.";
    static final String DIVISION_CERO = "No es posible dividir entre 0.";
    static final int VALOR_INVALIDO = Integer.MIN_VALUE;

    public static void main(String[] args) {

        int primerNumero = pideNumero("Ingrese el primer numero: ");
        int segundoNumero = pideNumero("Ingrese el segundo numero: ");        

        muestraResultados(primerNumero, segundoNumero);

        input.close();
    }

    /**
     *
     * @param mensaje Solicitud de informacion al usuario.
     * @return El numero ingresado por el usuario.
     */
    public static int pideNumero(String mensaje) {
        int numeroIngresado = VALOR_INVALIDO;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                System.out.print(mensaje);
                numeroIngresado = input.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println(DATOS_INVALIDOS);
                input.nextLine(); // Limpiar entrada inválida
            }
        }
        return numeroIngresado;
    }

    /**
     *
     * @param primerNumero Primer numero ingresado por el usuario.
     * @param segundoNumero Segundo numero ingresado por el usuario.
     * @return El cociente de la division entre el primer y el segundo numero.
     */
    public static Integer divideNumeros(int primerNumero, int segundoNumero) {
        if (segundoNumero == 0) {
            System.out.println(DIVISION_CERO);
            return null; // Retorna null si no es posible dividir
        }
        return primerNumero / segundoNumero;
    }

    /**
     * 
     * @param primerNumero Primer numero ingresado por el usuario.
     * @param segundoNumero Segundo numero ingresado por el usuario.
     */
    public static void muestraResultados(int primerNumero, int segundoNumero) {
        System.out.println("*** RESULTADOS ***");
        System.out.printf("%-12s: %d%n", "Primer numero", primerNumero);
        System.out.printf("%-12s: %d%n", "Segundo numero", segundoNumero);
        System.out.printf("%-12s: %d%n", "Suma", primerNumero + segundoNumero);
        System.out.printf("%-12s: %d%n", "Producto", primerNumero * segundoNumero);
        System.out.printf("%-12s: %d%n", "Diferencia", primerNumero - segundoNumero);
        System.out.printf("%-12s: %s%n", "Cociente", 
            (divideNumeros(primerNumero, segundoNumero) != null) 
            ? divideNumeros(primerNumero, segundoNumero) : "No definido");
    }

}
