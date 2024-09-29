/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;

import Builder.CarBuilder;
import Builder.CarManualBuilder;
import Cars.Car;
import Cars.Manual;

//Clase de demostración. Aquí todo se junta.

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        /*
        El director obtiene el objeto constructor concreto del cliente
        (código de aplicación). Esto se debe a que la aplicación sabe mejor cuál
        constructor a utilizar para obtener un producto específico.
        */
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        /*
        El producto final a menudo se recupera de un objeto constructor, ya que
        El director no es consciente y no depende de constructores concretos y
        productos.
        */
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // El director puede conocer varias recetas de construcción.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());  
    }
}
