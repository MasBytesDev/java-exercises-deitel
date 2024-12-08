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
public class Ej3_12_FacturaPrueba {

    static Scanner input = new Scanner(System.in);
    static final String INVALID_INPUT_DATA = "Ingrese un dato valido por favor.";
    static final String INVALID_INPUT_QTY = "Ingrese la cantidad correcta de articulos.";
    static final String INVALID_INPUT_PRIZE = "Ingrese un precio valido para el articulo. ";

    public static void main(String[] args) {

        Ej3_12_Factura factura1 = new Ej3_12_Factura();
        factura1.setNumDePieza(pideNumDePieza("Ingrese el Numero de Pieza del producto: "));
        factura1.setDescripcion(pideDescripcion("Ingrese la Descripcion del producto: "));
        factura1.setQtyDeArticulos(pideCantidad("Ingrese la Cantidad de articulos a vender: "));
        factura1.setPrecio(pidePrecio("Ingrese el precio del articulo: "));
        
        System.out.println(factura1);
        

    }

    public static String pideNumDePieza(String mensaje) {
        String numDePieza = "-";
        boolean numDePiezaValido = false;
        while (!numDePiezaValido) {
            try {
                System.out.println(mensaje);
                numDePieza = input.nextLine();
                numDePiezaValido = true;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return numDePieza;
    }

    public static String pideDescripcion(String mensaje) {
        String descripcion = "-";
        boolean descripcionValida = false;
        while (!descripcionValida) {
            try {
                System.out.println(mensaje);
                descripcion = input.nextLine();
                descripcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return descripcion;
    }

    public static int pideCantidad(String mensaje) {
        int qtyDeArticulos = Integer.MIN_VALUE;
        boolean cantidadValida = false;
        while (!cantidadValida) {
            try {
                System.out.println(mensaje);
                qtyDeArticulos = input.nextInt();
                if (qtyDeArticulos >= 0) {
                    cantidadValida = true;
                } else {
                    System.out.println(INVALID_INPUT_QTY);
                }
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return qtyDeArticulos;
    }
    
    public static double pidePrecio(String mensaje){
        double precio = -1.0;    
        boolean precioValido = false;       
        while(!precioValido){
            try{
                System.out.println(mensaje);
                precio = input.nextDouble();
                if(precio >= 0){
                    precioValido = true;
                } else {
                    System.out.println(INVALID_INPUT_PRIZE);
                }
            } catch (InputMismatchException e){
                System.out.println(INVALID_INPUT_DATA);
                input.nextLine();
            }
        }
        return precio;
    }

}
