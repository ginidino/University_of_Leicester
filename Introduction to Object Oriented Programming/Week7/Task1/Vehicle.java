package Lab07_Test;

public abstract class Vehicle {
	public abstract void engine();
}

class Car extends Vehicle {
    
	@Override
	public void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {
    
	@Override
    public void engine() {
        System.out.println("Truck has bad engine");
    }
}
