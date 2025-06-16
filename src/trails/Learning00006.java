package trails;
class Vehicle{
    public void move(){
        System.out.println("Vehicle is moving");
    }
    public void  fueltype(){
        System.out.println("Unknown Fuel type");
    }
}
class Car extends  Vehicle{
    public void move(){
        System.out.println("Vehicle is moving");
    }
    public void  fueltype(){
        System.out.println("Fuel type:Petrol/diesel");
    }
}
class Bicycle extends Vehicle{
    public void move(){
        System.out.println("Bicycle is being pedaled");
    }
    public void  fueltype(){
        System.out.println("No Fuel required");
    }
}
public class Learning00006 {
    public static  void main(String[] args){
        Vehicle vcl = new Car();
        vcl.move();
        vcl.fueltype();

    }
}
//
//2. Inheritance & Method Overriding
//Question 2:
//Create a Vehicle class with the following:
//A method move() that prints "Vehicle is moving"
//A method fuelType() that returns "Unknown fuel type"
//Now, create a Car class that inherits from Vehicle and overrides:
//move() → Print "Car is moving"
//fuelType() → Return "Petrol/Diesel"
//Create a Bicycle class that overrides:
//move() → Print "Bicycle is being pedaled"
//fuelType() → Return "No fuel required"
//Create an object of Vehicle, Car, and Bicycle and call their move() and fuelType() methods.