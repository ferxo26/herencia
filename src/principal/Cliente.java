package principal;

import javax.swing.JOptionPane;

public class Cliente extends Persona  {
   private  String direccion;

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }
   public String mostrarCliente (){
       
       JOptionPane.showMessageDialog(null,getNombre() + "\nedad" +getEdad() + "\ndireccion" + direccion); 
       return null;
   }

    
    
    
    
}