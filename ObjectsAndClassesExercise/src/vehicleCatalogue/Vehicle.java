package vehicleCatalogue;

import java.util.Locale;

public class Vehicle {
    private String vehicle;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String vehicle, String model, String color, int horsepower) {
        this.vehicle = vehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
    @Override
    public String toString() {
        if(this.vehicle.equalsIgnoreCase("car")) {
            return String.format("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d", this.model, this.color, this.horsepower);
        }else {
            return String.format("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d", this.model, this.color, this.horsepower);
        }
    }
}
