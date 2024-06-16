public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);

    }
}