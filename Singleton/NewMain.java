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
        //PatronSingleton pa = PatronSingleton.getInstance();
        
        //pa.Instancia(12);
        //pa.Message();
        
        
        //A diferencia con el patron singleton, sin el patron podemos crear multiples instancias
        SinPatron ejm1 = new SinPatron();
        SinPatron ejm2 = new SinPatron();
        
        // Utilizar las instancias
        ejm1.Instancia(12);
        ejm1.Message();
        
        ejm2.Instancia(34);
        ejm2.Message();
    }
    
}
