/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author 9567
 */
public class SinPatronPersona {
    private String name;
    private SinPatronDireccion direccion;

    public SinPatronPersona(String name, SinPatronDireccion direccion) {
        this.name = name;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SinPatronDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(SinPatronDireccion direccion) {
        this.direccion = direccion;
    }

    
    @Override
    public String toString() {
        return "SinPatronPersona{" + "name=" + name + ", direccion=" + direccion + '}';
    }


    
}
