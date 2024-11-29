/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Cree una calculadora del IMC que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del 
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. 
Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de 
Salud para que el usuario pueda evaluar su IMC:
VALORES DE IMC
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o más

La fórmula para calcular el IMC es
IMC = pesoEnLibras × 703 / alturaEnPulgadas × alturaEnPulgadas

(Adecue el ejercicio al sistema metrico usado en su pais)
*/

/**
 *
 * @author rober
 */
public class Ej2_33_CalculadoraIMC {
    
    static Scanner input = new Scanner (System.in);
    private static final String INVALID_INPUT_DATA = "Ingrese un dato valido por favor.";
    
    public static void main(String[] args) {
        
        double peso = pidePeso("Ingrese su peso en libras (Ej.: 162): ");
        double altura = pideAltura("Ingrese su altura en metros (Ej.: 1.70): ");
        
        //  Llamado al metodo que muestra la tabla de valores del IMC
        muestraValoresIMC();
        
        //  Llamado al metodo que calcula el IMC del usuario
        calculaIMC(peso, altura);
        
        //  Cierre del objeto Scanner
        input.close();
        
    }
    
    /**
     * 
     * @param mensaje Solicitud del peso al usuario
     * @return El peso ingresado
     */
    public static double pidePeso(String mensaje){
        double pesoIngresado = Double.MIN_VALUE;
        boolean pesoValido = false;
        while(!pesoValido){
            try{
                System.out.println(mensaje);
                pesoIngresado = input.nextDouble();
                if(pesoIngresado > 0.0){
                    pesoValido = true;
                } else {
                    System.out.println(INVALID_INPUT_DATA);
                }
            } catch (InputMismatchException e){
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return pesoIngresado;        
    }
    
    /**
     * 
     * @param mensaje Solicitud de la altura del usuario (en metros)
     * @return La altura del usuario en pulgadas
     */
    public static double pideAltura(String mensaje){
       double alturaIngresada = Double.MIN_VALUE;
       boolean alturaValida = false;
       while(!alturaValida){
           try{
               System.out.println(mensaje);
               alturaIngresada = input.nextDouble();
               if(alturaIngresada > 0.0){
                   alturaValida = true;
               } else {
                   System.out.println(INVALID_INPUT_DATA);
               }
           } catch (InputMismatchException e){
               System.out.println(INVALID_INPUT_DATA);
               input.nextLine();
           }
       }
       return alturaIngresada * 39.37101;   //  Conversion de metros a pulgadas
    }
    
    /**
     * Metodo que calcula el IMC del usuario
     * @param peso Peso en libras del usuario
     * @param altura Altura en pulgadas del usuario
     */
    public static void calculaIMC(double peso, double altura){
        double IMC = (peso * 703) / (altura * altura);
        System.out.printf("Su IMC es de %.2f%n", IMC);
        System.out.println("---");
    }
    
    /**
     * Metodo que muestra la tabla de valores del IMC
     */
    public static void muestraValoresIMC(){
        System.out.println("---");
        System.out.println("**VALORES DE IMC**");
        System.out.println("---");
        System.out.println("Bajo de Peso\t: Menos de 18.5");
        System.out.println("Peso Normal\t: entre 18.5 y 24.9");
        System.out.println("Sobrepeso\t: entre 25.0 y 29.9");
        System.out.println("Obesidad\t: 30.0 o mas");
        System.out.println("---");
    }
    
}
