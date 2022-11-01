package vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<Vehicle> catalogueList=new ArrayList<>();
        double sumCar=0;
        int countCar=0;
        double sumTruck=0;
        int countTruck=0;
        while (!input.equals("End")){
            String[] vehicleArr=input.split("\\s+");
            Vehicle vehicle=new Vehicle(vehicleArr[0],vehicleArr[1],vehicleArr[2],Integer.parseInt(vehicleArr[3]));
            catalogueList.add(vehicle);
            input=scanner.nextLine();
        }
        for (Vehicle horse:catalogueList) {
            if(horse.getVehicle().equalsIgnoreCase("car")){
                sumCar+=horse.getHorsepower();
                countCar++;
            }else {
                sumTruck+=horse.getHorsepower();
                countTruck++;
            }
        }
        while (!input.equals("Close the Catalogue")){
            input=scanner.nextLine();
            for (Vehicle vehicle:catalogueList) {

                if(input.equals(vehicle.getModel())){
                    System.out.println(vehicle.toString());
                }
            }
        }
        double averageCars = sumCar / countCar;
        if(countCar == 0) {averageCars = 0;}
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = sumTruck / countTruck;
        if(countTruck == 0) {averageTrucks = 0;}
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);

    }
}
