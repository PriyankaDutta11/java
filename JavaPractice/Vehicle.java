public class Vehicle {
    void drive(){
        System.out.println("Driver drives the car");
    }
}

class New{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
