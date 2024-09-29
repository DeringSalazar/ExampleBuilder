/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars;

import Components.Engine;
import Components.Transmission;
import Components.TripComputer;
import Components.GPSNavigator;

/*
El manual del coche es otro producto. Tenga en cuenta que no tiene el mismo antepasado.
 * como un coche. No están relacionados.
*/

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += """
                    Trip Computer: Functional
                    """;
        } else {
            info += """
                    Trip Computer: N/A
                    """;
        }
        if (this.gpsNavigator != null) {
            info += """
                    GPS Navigator: Functional
                    """;
        } else {
            info += """
                    GPS Navigator: N/A
                    """;
        }
        return info;
    }
}
