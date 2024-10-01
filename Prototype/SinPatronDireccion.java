/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author 9567
 */
public class SinPatronDireccion {
    private String calle;
    private String ciudad;

        public SinPatronDireccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }
        
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "SinPatronDireccion{" + "calle=" + calle + ", ciudad=" + ciudad + '}';
    }


    
    
    
}
