public class CarExample2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        myCar.run();

        myCar.tires2[0] = new KumhoTire2();
        myCar.tires2[1] = new KumhoTire2();

        myCar.run();
    }
}
