public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFair(); (X)

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
