/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOPersona;

/**
 *
 * @author andrea
 */
public class PERSONA1 {
       String nombre, apellido;
    int DNI;
    
    public PERSONA1(){
         
    }
    
    public PERSONA1(int dni){
        
     this.DNI = dni;   
        
    }
    
    public PERSONA1(int dni, String nombre){
        
     this.DNI = dni;
     this.nombre = nombre;
        
    }
    
    public PERSONA1 (int dni, String nombre, String apellido){
        
     this.DNI = dni;
     this.nombre = nombre;
     this.apellido = apellido;
        
        
    }
    
    public void mostrarDatos(){
        
        System.out.println( DNI  );
        
    }
    public void mostrarDatos1(){
        
        System.out.println( DNI +" "+ nombre);
    }
    public void mostrarDatos2(){
        
        System.out.println(DNI + " "+ nombre + " " + apellido);
        
    }
}
