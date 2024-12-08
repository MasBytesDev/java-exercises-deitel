/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter3;

/*
Cree una clase llamada Factura que una ferretería podría utilizar para representar una factura para un artículo 
vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables de instancia: un nú-
mero de pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de artículos de ese tipo que 
se van a comprar (tipo int) y el precio por artículo (double). Su clase debe tener un constructor que iniciali-
ce las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de 
instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es de-
cir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva ese monto como un va-
lor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe 
establecerse en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la 
clase Factura.
 */
/**
 *
 * @author rober
 */
public class Ej3_12_Factura {

    private String numDePieza;
    private String descripcion;
    private int qtyDeArticulos;
    private double precio;

    //  Constructor with args
    public Ej3_12_Factura(String numDePieza, String descripcion, int qtyDeArticulos, double precio) {
        this.numDePieza = numDePieza;
        this.descripcion = descripcion;
        this.qtyDeArticulos = (qtyDeArticulos <= 0) ? 0 : qtyDeArticulos;
        this.precio = (precio <= 0.0) ? 0.0 : precio;
    }

    //  No Args Constructor
    public Ej3_12_Factura() {

    }

    //  Getters && Setters Methods
    public String getNumDePieza() {
        return numDePieza;
    }

    public void setNumDePieza(String numDePieza) {
        this.numDePieza = numDePieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getQtyDeArticulos() {
        return qtyDeArticulos;
    }

    public void setQtyDeArticulos(int qtyDeArticulos) {
        this.qtyDeArticulos = qtyDeArticulos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format(
                "%-10s %-30s %-10s %-10s %-10s\n"
                + // Encabezados de la tabla
                "%-10s %-30s %-10d %-10.2f %-10.2f\n", // Datos
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL",
                numDePieza, descripcion, qtyDeArticulos, precio, qtyDeArticulos * precio
        );
    }

}
