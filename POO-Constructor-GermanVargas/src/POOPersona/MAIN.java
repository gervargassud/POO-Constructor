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
public class MAIN {
    public static void main (String[] args){
             PERSONA1 p1, p2, p3, p4;
       
       p1 = new PERSONA1();
       p2 = new PERSONA1(39872222);
       p3 = new PERSONA1(39872222, "German");
       p4 = new PERSONA1(39872222, "German", "Vargas");
       
       
       p1.mostrarDatos();
       p2.mostrarDatos();
       p3.mostrarDatos1();
       p4.mostrarDatos2();
       
    }
    
        
        
        
    }

