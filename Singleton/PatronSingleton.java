/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author 9567
 */
public class PatronSingleton {
    private static PatronSingleton instancia;
    
    //constructor privado para evitar crear instancias
    private PatronSingleton(){
        
    }
    
    //Metodo publico estatico para obtener la instancia
    public static PatronSingleton getInstance(){
        if (instancia==null) {
            instancia = new PatronSingleton();
        }
        return instancia;
    }
    
    //Metodos de acceso
    public void Message(){
        System.out.println("HOLA DESDE LA UNICA INSTANCIA DE MENSAJE");
    }
    public void Instancia(int entero){
        System.out.println("HOLA DESDE LA UNICA INSTANCIA DE MENSAJE Y NUMERO ENTERO " +entero);
    }
}
