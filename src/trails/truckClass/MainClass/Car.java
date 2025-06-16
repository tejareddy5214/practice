package trails.truckClass.MainClass;

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    public boolean isEngineStarted;

    public Car(String color, int maxSpeed, int acceleration, int tyreFriction) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.tyreFriction = tyreFriction;
        this.isEngineStarted = false;
    }

    public void startEngine() {
        this.isEngineStarted = true;
    }

    public void stopEngine() {
        this.isEngineStarted = false;
        this.currentSpeed =0;
    }

    public void accelerate() {
        if (!isEngineStarted) {
            System.out.println("Car has not started yet");
        } else {
            if (currentSpeed < maxSpeed) {
                currentSpeed += acceleration;
                if (currentSpeed > maxSpeed) {
                    currentSpeed = maxSpeed;
                }
            }
        }
    }

    public void soundHorn() {
        System.out.println(isEngineStarted?"Honk Honk":"Truck has not started yet");
    }

    public void applyBrakes() {
        if (currentSpeed > 0) {
            currentSpeed -= tyreFriction;
            if (currentSpeed < 0) {
                currentSpeed = 0;
            }
        }
    }
}
