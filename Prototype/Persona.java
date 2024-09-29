/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author 9567
 */
public class Persona implements Cloneable{
    private String name;
    private Direccion direccion;

    public Persona(String name, Direccion direccion) {
        this.name = name;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
 
    //Metodo de Prototype para poder clonar el objecto
    public Object clon() {
        try{
            Persona clon = (Persona)super.clone();
            clon.direccion = (Direccion) direccion.clon();
            return clon;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", direccion=" + direccion + '}';
    }
    
    
}
