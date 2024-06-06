package saijavafullstackdevelopement;

public class VehicleCar {
	String brand;
    String model;
    int year;

    public VehicleCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(brand + " " + model + " " + year + " - this car is launching tomorrow");
    }

    public static class Car {
        String color;
        VehicleCar vehicle;

        public Car(String color, VehicleCar vehicle) {
            this.color = color;
            this.vehicle = vehicle;
        }

        public void honk() {
            System.out.println(color);
            System.out.println(vehicle.brand + " " + vehicle.model + " " + vehicle.year);
        }
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	VehicleCar vehicle = new VehicleCar("Tata", "Marvel Model", 2024);
        Car car = new Car("black", vehicle);
        vehicle.drive();
        car.honk();
    }

}
