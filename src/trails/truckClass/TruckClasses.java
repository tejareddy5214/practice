package trails.truckClass;

import trails.truckClass.MainClass.Truck;
/**
 * You need not change any code below.
 */

class TruckClasses {
    public static void main(String[] args) {
//        Scanner input =  new Scanner(System.in);
        Truck truck =  new Truck("Red", 250, 10, 3, 100);
        System.out.println(truck.isEngineStarted);
        truck.loadCargo(50); // Loading cargoWeight 50 to the truck
        System.out.println(truck.load); // 0 + 50 => 50
        truck.unloadCargo(25); // Unloading cargoWeight 25 from the truck
        System.out.println(truck.load); // 50 - 25 => 25
        truck.unloadCargo(70); // Unloading cargoWeight 70 (more than load in the truck)
        System.out.println(truck.load); // 25 - 75 => 0 as load never be negative
        truck.loadCargo(120); // Prints "Cannot load cargo more than max limit: 100"
        truck.loadCargo(20); // Loading cargoWeight 20 to the truck
        truck.startEngine();
        System.out.println(truck.isEngineStarted); // True
        truck.loadCargo(40); // Prints "Cannot load cargo during motion"
        truck.unloadCargo(10); // Prints "Cannot unload cargo during motion"
        truck.soundHorn(); // Prints "Honk Honk"
        truck.stopEngine();
        truck.soundHorn(); // Prints "Truck has not started yet"
    }
}