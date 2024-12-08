/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ej3_13_EmpleadoPrueba {

    //  Scanner object that will read the info inputed by the user.
    static Scanner input = new Scanner(System.in);
    
    //  Constant variables defining warning messages to the user
    private static final String INVALID_INPUT_DATA = "Ingrese un dato valido por favor.";
    private static final String INVALID_INPUT_SALARY = "Ingrese un salario mensual valido.";

    public static void main(String[] args) {

        Ej3_13_Empleado empleado1 = new Ej3_13_Empleado();
        empleado1.setNombres(pideNombres("Digite el Nombre del empleado: "));
        empleado1.setApellidos(pideApellidos("Digite el Apellido del empleado: "));
        empleado1.setSalarioMensual(pideSalarioMensual("Ingrese el Salario Mensual del Empleado: "));
        
        //  Call to the method that displays the employee information
        muestraDatos(empleado1.getNombres(), empleado1.getApellidos(), empleado1.getSalarioMensual());

        Ej3_13_Empleado empleado2 = new Ej3_13_Empleado();
        empleado2.setNombres(pideNombres("Digite el Nombre del empleado: "));
        empleado2.setApellidos(pideApellidos("Digite el Apellido del empleado: "));
        empleado2.setSalarioMensual(pideSalarioMensual("Ingrese el Salario Mensual del Empleado: "));
        
        //  Call to the method that displays the employee information
        muestraDatos(empleado2.getNombres(), empleado2.getApellidos(), empleado2.getSalarioMensual());

    }

    //  Method requesting the employee name
    public static String pideNombres(String mensaje) {
        String nombreIngresado = "-";
        boolean nombreValido = false;
        while (!nombreValido) {
            try {
                System.out.println(mensaje);
                nombreIngresado = input.nextLine();
                nombreValido = true;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return nombreIngresado;
    }

    //  Method requesting the employee last name
    public static String pideApellidos(String mensaje) {
        String apellidoIngresado = "-";
        boolean apellidoValido = false;
        while (!apellidoValido) {
            try {
                System.out.println(mensaje);
                apellidoIngresado = input.nextLine();
                apellidoValido = true;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return apellidoIngresado;
    }

    //  Method requesting the employee monthly salary
    public static double pideSalarioMensual(String mensaje) {
        double salarioMensualIngresado = Double.MIN_VALUE;
        boolean salarioValido = false;
        while (!salarioValido) {
            try {
                System.out.println(mensaje);
                salarioMensualIngresado = input.nextDouble();
                input.nextLine();
                if (salarioMensualIngresado < 0) {
                    salarioValido = false;
                    System.out.println(INVALID_INPUT_SALARY);
                } else {
                    salarioValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return salarioMensualIngresado;
    }

    //  Method that displays all employee information
    public static void muestraDatos(String nombres, String apellidos, double salarioMensual) {
        System.out.println("**DATOS DEL EMPLEADO**");
        System.out.printf("Nombre Empleado\t: %s %s%n", nombres, apellidos);
        System.out.printf("Salario Mensual\t: $ %.2f%n", salarioMensual);
        System.out.printf("Salario Anual\t: $ %.2f%n", (salarioMensual * 12));
        System.out.printf("Salario Incrementado\t: $ %.2f%n", (salarioMensual * 12) * 1.10);
        System.out.println("-----");
    }   

}
