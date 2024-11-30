/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

/*
Use Web para determinar la población mundial actual y la tasa de crecimiento anual de la población mundial. 
Escriba una aplicación que reciba estos valores como entrada y luego muestre la población mundial estimada 
después de uno, dos, tres, cuatro y cinco años.
*/

/**
 *
 * @author rober
 */
public class Ej2_34_CrecimientoPoblacionMundial {
    
    public static void main(String[] args) {
        
        long poblacionMundialActual = 8_200_000_000L;
        double tasaDeCrecimiento = 0.67/100;
        
        //  Llamado al metodo que calcula la poblacion mundial
        //  y muestra el resultado.
        calculaPoblacion(poblacionMundialActual, tasaDeCrecimiento);
                
    }
    
    /**
     * Metodo que calcula la poblacion mundial para cada año.
     * 
     * @param poblacionMundialActual
     * @param tasaDeCrecimiento 
     */
    public static void calculaPoblacion(long poblacionMundialActual, double tasaDeCrecimiento) { 
        for (int i = 1; i <= 5; i++) { 
            poblacionMundialActual = (long) (poblacionMundialActual * (1 + tasaDeCrecimiento)); 
            System.out.println("Poblacion estimada despues de " + i + " anho(s): " + poblacionMundialActual); 
        } 
    }
    
}
