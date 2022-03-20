public class CarExample2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire2();
        myCar.frontRightTire = new KumhoTire2();

        myCar.run();
    }
}
