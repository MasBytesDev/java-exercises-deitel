/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter2;

/**
 * La clase Ej2_31_TablaDeCuadradosYCubos imprime una tabla que muestra el número, su cuadrado y su cubo 
 * para los números del 0 al 10. La tabla se presenta de manera ordenada y alineada, con encabezado e 
 * impresión de los valores correspondientes a cada número.
 * 
 * Ejemplo de salida:
 * <pre>
 * Numero  Cuadrado   Cubo
 * --------------------------
 * 0       0          0
 * 1       1          1
 * 2       4          8
 * 3       9          27
 * 4       16         64
 * 5       25         125
 * 6       36         216
 * 7       49         343
 * 8       64         512
 * 9       81         729
 * 10      100        1000
 * </pre>
 * 
 * La clase no recibe ni devuelve ningún valor. Su función principal es imprimir los resultados de manera 
 * formateada en la consola.
 * 
 * @author rober
 */
public class Ej2_31_TablaDeCuadradosYCubos {

    /**
     * Método principal que genera la tabla de cuadrados y cubos para los números del 0 al 10.
     * 
     * El método utiliza un ciclo `for` para calcular y mostrar el cuadrado y el cubo de cada número en 
     * el rango de 0 a 10. Los resultados se imprimen con formato de tabla, asegurando la alineación correcta 
     * de las columnas.
     * 
     * @param args Argumentos de línea de comandos, no utilizados en esta aplicación.
     */
    public static void main(String[] args) {
        
        // Encabezado de la tabla de cuadrados y cubos
        System.out.printf("%-8s %-10s %-10s%n", "Numero", "Cuadrado", "Cubo");
        System.out.println("---------------------------------");
        
        // Ciclo para mostrar una tabla de cuadrados y cubos hasta el número 10
        for (int i = 0; i <= 10; i++) {
            // Usando un ancho de 8 para los números, 10 para cuadrados y 10 para cubos
            System.out.printf("%-8d %-10d %-10d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }
    }
}
