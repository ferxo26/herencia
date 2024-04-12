package principal;

import javax.swing.JOptionPane;


public class Empleado extends Persona  {
    private double salario;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }
    public String mostrarEmpleado (){
      JOptionPane.showMessageDialog(null,getNombre() + "\nedad" +getEdad() + "\nsalario" + salario); 
       return null;
       
   }
 
    
}