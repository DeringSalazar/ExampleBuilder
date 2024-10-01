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
 
//        Direccion direccion  = new Direccion("Calle 124", "Angeles");
//        Persona persona1 = new Persona("Juan", direccion);
//        
//        
//        Persona persona2 = (Persona)persona1.clon();
//        persona2.setName("Pablo");
//        persona2.getDireccion().setCiudad("Ciudad California");
//        System.out.println("Persona 1 " + persona1);
//        System.out.println("Persona 2 " + persona2);
        
        
        
        //Crear nueva direccion
        SinPatronDireccion dire = new SinPatronDireccion("Calle 123", "Barcelona");
        //Nueva persona y darle la direccion
        SinPatronPersona perso1 = new SinPatronPersona("Juan", dire);
        
        //Se crea una copia manualmente obteniendo los mismo datos de la persona 1
        SinPatronDireccion direcCopia  = new SinPatronDireccion(perso1.getDireccion().getCalle(),perso1.getDireccion().getCiudad());
        SinPatronPersona perso2 = new SinPatronPersona("Juan", direcCopia);
        
        //Modificamos la ciudad de la persona 2
        perso2.getDireccion().setCiudad("Ciudad Belice");
        
        System.out.println("Persona 1 " + perso1);
        System.out.println("Persona 2 " + perso2);
                
    }
    
}
