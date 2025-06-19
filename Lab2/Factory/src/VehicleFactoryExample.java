// Vehicle interface
interface Vehicle {
    void drive();
}

// Concrete class for Car
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

// Concrete class for Motorcycle
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");
    }
}

// Concrete class for Truck
class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

// Vehicle Factory class
class VehicleFactory {
    // Method to get vehicle instance based on type
    public static Vehicle createVehicle(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "motorcycle":
                return new Motorcycle();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

// Main class to demonstrate the Factory Pattern
public class VehicleFactoryExample {
    public static void main(String[] args) {
        // Create different vehicles using the factory
        Vehicle car = VehicleFactory.createVehicle("car");
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        Vehicle truck = VehicleFactory.createVehicle("truck");

        // Test driving the vehicles
        if (car != null) car.drive();
        if (motorcycle != null) motorcycle.drive();
        if (truck != null) truck.drive();

        // Example of handling invalid type
        try {
            Vehicle invalid = VehicleFactory.createVehicle("bicycle");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}