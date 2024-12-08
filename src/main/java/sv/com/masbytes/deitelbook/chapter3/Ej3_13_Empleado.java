/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.masbytes.deitelbook.chapter3;


/*
Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer nombre (tipo String), 
un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor que 
inicialice las tres variables de instancia. Proporcione un método establecer y un método obtener para cada 
variable de instancia. Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación 
de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. 
Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un 
aumento del 10% y muestre el salario anual de cada Empleado otra vez.
*/

/**
 *
 * @author rober
 */
public class Ej3_13_Empleado {
    
    private String nombres;
    private String apellidos;
    private double salarioMensual;
    
    //  Constructor with Args.
    public Ej3_13_Empleado(String nombres, String apellidos, double salarioMensual){
        this.nombres = nombres;
        this.apellidos = apellidos;
        if(salarioMensual < 0.0){
            this.salarioMensual = 0.0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }
    
    //  No Args Constructor
    public Ej3_13_Empleado(){
        
    }
    
    //  Getters & Setters Methods
    public String getNombres(){
        return nombres;
    }
    
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public double getSalarioMensual(){
        return salarioMensual;
    }
    
    public void setSalarioMensual(double salarioMensual){
        if(salarioMensual < 0){
            this.salarioMensual = 0.0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }
    
}
