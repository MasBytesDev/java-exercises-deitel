/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Cree una aplicación que calcule su costo diario al conducir su automóvil, de modo que pueda 
estimar cuánto dinero puede ahorrar si comparte los viajes en automóvil, lo cual también tie-
ne otras ventajas, como la reducción de las emisiones de carbono y la reducción de la conges-
tión de tráfico. La aplicación debe recibir como entrada la siguiente información y mostrar el 
costo por día para el usuario por conducir al trabajo:

a) Total de kilómetros conducidos por día.
b) Costo por litro de gasolina.
c) Promedio de kilómetros por litro.
d) Cuotas de estacionamiento por día.
e) Peaje por día
 */
/**
 *
 * @author rober
 */
public class Ej2_35_CalculadoraAhorroPorViaje {
    
    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_MESSAGE = "Ingrese un dato valido por favor.";
    
    public static void main(String[] args) {
        
        double kmsRecorridos = pideValor("Ingrese el kilometraje recorrido al dia: ");
        double costoGlnCombustible = pideValor("Ingrese el costo del galon de combustible: $ ");
        double rendimientoKmPorGln = pideValor("Digite el rendimiento de su auto por galon de combustible: ");
        double costoEstacionamientoDiario = pideValor("Ingrese el costo de estacionamiento diario: $ ");
        double costoPeajeDiario = pideValor("Ingrese el costo de peaje diario: $ ");
        
        double combustibleConsumido = calculaCombustibleConsumido(kmsRecorridos, rendimientoKmPorGln);
        double costoCombustibleConsumido = calculaCostoCombustibleConsumido(combustibleConsumido, costoGlnCombustible);
        
        //  Llamado al metodo que muestra los resultados
        muestraResultados(kmsRecorridos, costoGlnCombustible, rendimientoKmPorGln, costoEstacionamientoDiario, costoPeajeDiario, combustibleConsumido, costoCombustibleConsumido);
        
        input.close();
    }

    /**
     * Metodo que solicita los valores al usuario
     *
     * @param mensaje Solicitud de valor al usuario
     * @return El valor ingresado por el usuario.
     */
    public static double pideValor(String mensaje) {
        double valorIngresado = Double.MIN_VALUE;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.println(mensaje);
                valorIngresado = input.nextDouble();
                if (valorIngresado > 0.0) {
                    datoValido = true;
                } else {
                    System.out.println(INVALID_INPUT_MESSAGE);
                }
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_MESSAGE);
                input.nextLine();
            }
        }
        return valorIngresado;
    }

    /**
     * Metodo que calcula el combustible consumido en un recorrido
     *
     * @param kmsRecorrido Dato ingresado por el usuario
     * @param rendimientoKmPorGln Dato ingresado por el usuario
     * @return El total de combustible consumido en un recorrido
     */
    public static double calculaCombustibleConsumido(double kmsRecorrido, double rendimientoKmPorGln) {
        return kmsRecorrido / rendimientoKmPorGln;
    }

    /**
     * Metodo que calcula el costo del combustible consumido
     *
     * @param combustibleConsumido Valor retornado por el metodo que calcula el combustible consumido
     * @param costoGlnCombustible Dato ingresado por el usuario
     * @return El costo del combustible consumido
     */
    public static double calculaCostoCombustibleConsumido(double combustibleConsumido, double costoGlnCombustible) {
        return combustibleConsumido * costoGlnCombustible;
    }
    
    public static void muestraResultados(double kmsRecorridos, double costoGlnCombustible, double rendimientoKmPorGln, double costoEstacionamientoDiario, double costoPeajeDiario, double combustibleConsumido, double costoCombustibleConsumido) {
        System.out.println("**INFO DE VIAJE**");
        System.out.println("---");
        System.out.println("Km Recorrido\t\t: " + kmsRecorridos + " Kms.");
        System.out.println("$ Gln de Combustible\t: $ " + costoGlnCombustible);
        System.out.println("Rendimiento Por Gln\t: " + rendimientoKmPorGln + " Kms. p/Gln.");
        System.out.println("---");
        System.out.printf("$ Estacionamiento\t: $ %.2f%n", costoEstacionamientoDiario);
        System.out.printf("$ Peaje\t\t\t: $ %.2f%n", costoPeajeDiario);
        System.out.println("---");
        System.out.printf("Combustible Consumido\t: %.2f Gls.%n", combustibleConsumido);
        System.out.printf("$ Combustible Consumido\t: $ %.2f%n", costoCombustibleConsumido);
        System.out.println("---");
        System.out.printf("$ Total del Viaje\t: $ %.2f%n", (costoEstacionamientoDiario + costoPeajeDiario + costoCombustibleConsumido));
        System.out.println("---");
    }
    
}
