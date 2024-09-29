/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

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
        //Obtenemos la instancia de la clase (NO SE CREA, SIMPLEMENTE SE OBTIENE)
        PatronSingleton pa = PatronSingleton.getInstance();
        
        pa.Instancia(12);
        pa.Message();
    }
    
}
