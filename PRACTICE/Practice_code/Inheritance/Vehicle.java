package PRACTICE.Practice_code.Inheritance;

public class Vehicle {
    private int numWheels;
    private int maxSpeed;

    public Vehicle(int numWheels, int maxSpeed) {
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int numWheels, int maxSpeed, int numberOfDoors) {
        super(numWheels, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

class Motarcycle extends Vehicle {
    private int numberOfCylinder;

    public Motarcycle(int numWheels, int maxSpeed, int numberOfCylinder) {
        super(numWheels, maxSpeed);
        this.numberOfCylinder = numberOfCylinder;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

}
class VehicleDetails {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,120);
        Car car = new Car(4,150,4);
        Motarcycle motarcycle = new Motarcycle(2,100,3);

        vehicle.setNumWheels(2);
        vehicle.setMaxSpeed(80);
        car.setNumberOfDoors(4);
        motarcycle.setNumberOfCylinder(3);

        System.out.println("Vehicle Details:");
        System.out.println("Number of Wheels: " + vehicle.getNumWheels());
        System.out.println("Maximum Speed: " + vehicle.getMaxSpeed());

        System.out.println("\nCar Details:");
        System.out.println("Number of Wheels: " + car.getNumWheels());
        System.out.println("Maximum Speed: " + car.getMaxSpeed());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());

        System.out.println("\nMotorcycle Details:");
        System.out.println("Number of Wheels: " + motarcycle.getNumWheels());
        System.out.println("Maximum Speed: " + motarcycle.getMaxSpeed());
        System.out.println("Number of Cylinders: " + motarcycle.getNumberOfCylinder());
    }
}
