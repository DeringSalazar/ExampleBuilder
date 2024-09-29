/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype;

/**
 *
 * @author 9567
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Direccion direccion  = new Direccion("Calle 124", "Angeles");
        Persona persona1 = new Persona("Juan", direccion);
        
        
        Persona persona2 = (Persona)persona1.clon();
        persona2.setName("Pablo");
        persona2.getDireccion().setCiudad("Ciudad California");
        System.out.println("Persona 1 " + persona1);
        System.out.println("Persona 2 " + persona2);
    }
    
}
