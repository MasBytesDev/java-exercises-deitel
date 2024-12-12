/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase de prueba para la clase {@link Ej3_14_Fecha}. Esta clase permite
 * interactuar con el usuario para ingresar y validar fechas, además de
 * mostrar el resultado en formato "dd/MM/yyyy".
 * 
 * Contiene métodos para pedir valores de día, mes y año al usuario con
 * validaciones correspondientes.
 * 
 * @author rober
 */
public class Ej3_14_FechaPrueba {

    /**
     * Escáner para recibir entradas desde la consola.
     */
    static Scanner input = new Scanner(System.in);
    
     /**
     * Mensaje de error para entradas inválidas en general.
     */
    static final String INVALID_INPUT_DATA = "Ingresa un dato valido por favor.";

    /**
     * Mensaje de error para entradas inválidas del día.
     */
    static final String INVALID_INPUT_DAY = "Ingresa un valor valido para DIA.";

    /**
     * Mensaje de error para entradas inválidas del mes.
     */
    static final String INVALID_INPUT_MONTH = "Ingresa un valor valido para MES.";

    /**
     * Mensaje de error para entradas inválidas del año.
     */
    static final String INVALID_INPUT_YEAR = "Ingresa un valor valido para ANHO.";
    
     /**
     * Método para pedir un valor al usuario dentro de un rango definido. 
     * Se valida que la entrada sea numérica y que esté dentro del rango permitido.
     * 
     * @param mensaje Mensaje que se muestra al usuario para solicitar el valor.
     * @param min Valor mínimo permitido.
     * @param max Valor máximo permitido.
     * @param errorMensaje Mensaje que se muestra si el valor está fuera del rango.
     * @return El valor ingresado por el usuario, validado dentro del rango.
     */
    static int pideValor(String mensaje, int min, int max, String errorMensaje) {
        int valorIngresado = -1;
        boolean valorValido = false;
        while (!valorValido) {
            try {
                System.out.println(mensaje);
                valorIngresado = input.nextInt();
                if (valorIngresado >= min && valorIngresado <= max) {
                    valorValido = true;
                } else {
                    System.out.println(errorMensaje);
                }
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine(); // Limpiar el buffer
            }
        }
        return valorIngresado;
    }
    
     /**
     * Método principal de la clase. Solicita al usuario que ingrese una fecha 
     * válida (día, mes y año), valida la fecha y luego muestra el resultado.
     * 
     * Utiliza la clase {@link Ej3_14_Fecha} para establecer y representar la fecha.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Ej3_14_Fecha fecha1 = new Ej3_14_Fecha();

        int dia = pideValor("Ingrese el valor del dia de nacimiento: ", 1, 31, INVALID_INPUT_DAY);
        int mes = pideValor("Ingrese el valor del mes de nacimiento: ", 1, 12, INVALID_INPUT_MONTH);
        int anho = pideValor("Ingrese el valor del anho de nacimiento: ", 1900, 2024, INVALID_INPUT_YEAR);

        // Validar la fecha completa antes de establecerla
        if (!fecha1.esFechaValida(dia, mes, anho)) {
            System.out.println("La fecha ingresada no es valida.");
        } else {
            fecha1.setDia(dia);
            fecha1.setMes(mes);
            fecha1.setAnho(anho);
            System.out.println("Fecha 1: " + fecha1.toString());
        }
    }

}
