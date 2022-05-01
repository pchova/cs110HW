package hwAssignments;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/** Polina Chetnikova CS110 Assignment 8 */
public class VehicleDriver {
    public static void main(String[] args) throws IOException {
        //Read the data from the file into an ArrayList of Vehicles
        Scanner scan = new Scanner(new File("vehicles.txt"));

        //create an array list of vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (scan.hasNext()) {
            //read each line and parse it into its data type, so you can put it into a vehicle object
            //and then add it into an arraylist of vehicles
            String line = scan.nextLine();
            String name = scan.nextLine();
            String address = scan.nextLine();
            String phone = scan.nextLine();
            String make = scan.nextLine();
            String model = scan.nextLine();
            String year = scan.nextLine();
            String mileage = scan.nextLine();

            switch(line) {
                case "hwAssignments.Taxi":
                            String numPass = scan.nextLine();
                            String isSUV = scan.nextLine();
                            String name2 = scan.nextLine();
                            String address2 = scan.nextLine();
                            String phone2 = scan.nextLine();
                            String id = scan.nextLine();

                            vehicles.add(new Taxi(new Person(name, address, phone),
                                make, model, Integer.parseInt(year),
                                Integer.parseInt(mileage), Integer.parseInt(numPass),
                                Boolean.parseBoolean(isSUV),
                                new Person(name2, address2, phone2), id));

                            break;

                case "hwAssignments.Automobile":
                            String np = scan.nextLine();
                            String iSUV = scan.nextLine();

                            vehicles.add(new Automobile(new Person(name, address, phone),
                                make, model, Integer.parseInt(year),
                                Integer.parseInt(mileage), Integer.parseInt(np),
                                Boolean.parseBoolean(iSUV)));

                            break;

                case "hwAssignments.Truck":
                            String cap = scan.nextLine();
                            String axles = scan.nextLine();

                            vehicles.add(new Truck(new Person(name, address, phone),
                                    make, model, Integer.parseInt(year),
                                    Integer.parseInt(mileage), Integer.parseInt(cap),
                                    Integer.parseInt(axles)));
                            break;
            }
        }
        scan.close();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getYear());
        }
    }
}
