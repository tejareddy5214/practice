package trails.truckClass.MainClass;

public class Truck extends Car{
    int maxCargoWeight;
    public int load;

    public Truck(String truckColor, int truckMaxSpeed, int truckAcceleration, int truckTyreFriction, int truckMaxCargoWeight) {
        super(truckColor,truckMaxSpeed,truckAcceleration,truckTyreFriction);
        this.maxCargoWeight = truckMaxCargoWeight;
        this.load =0;


    }

    public void loadCargo( int cargoWeight) {
        if(isEngineStarted){
            System.out.println("Cannot load cargo during motion");
        }
        else{
            this.load += cargoWeight;
            if(this.load>this.maxCargoWeight){
                System.out.println("Cannot load cargo more than max limit: "+this.maxCargoWeight);
                this.load-=cargoWeight;
            }
        }
    }

    public void unloadCargo(int cargoWeight) {
        if(isEngineStarted){
            System.out.println("Cannot unload cargo during motion");
        }
        else{
            this.load -= cargoWeight;
            if(this.load<=0){
                // System.out.println("Cannot unload cargo less than min limit: 0");
                this.load=0;
            }
        }
    }

    public void soundHorn() {
        System.out.println(isEngineStarted?"Honk Honk":"Truck has not started yet");
    }
}

/**
 * Truck class should have the following attributes & methods
 *
 * Old Attributes:
 *   color, maxSpeed, acceleration, tyreFriction, isEngineStarted, currentSpeed
 * New Attributes:
 *   maxCargoWeight, load
 *
 * Old Methods:
 *   startEngine, stopEngine, accelerate, applyBrakes, soundHorn
 *
 * Override Methods:
 *   soundHorn:
 *       - Print "Honk Honk" if truck engine is on
 *       - Print "Truck has not started yet" if truck engine is off
 *
 * New Methods:
 *   loadCargo:
 *       - This method will have an argument cargoWeight, denoting the weight to be loaded in the truck.
 *       - Truck can load some cargo within maxCargoWeight (Provided in the input)
 *       - When this method is called when the car engine is off, the current load of the truck
 *         should increase according to the cargoWeight passed as an argument to this method.
 *       - When this method is called when the car engine is on, print the message  "Cannot load cargo during motion"
 *       - When the cargoWeight is more than maxCargoWeight,
 *           print the message  "Cannot load cargo more than max limit: {maxCargoWeight}"
 *   unloadCargo:
 *       - This method will have an argument cargoWeight, denoting the weight to be unloaded from the truck.
 *       - Truck can unload amount of cargoWeight passed as an argument, only when the truck engine is off.
 *       - If the truck engine is on, print the message "Cannot unload cargo during motion"
 *       - Truck load can never go behind 0
 *
 * When a new Truck is created, the engine should be off by default and currentSpeed, load should be 0
 *
 * Implement the Car and Truck class appropriately
 * Inherit the Car class into Truck class and override the methods which have extra features
 */