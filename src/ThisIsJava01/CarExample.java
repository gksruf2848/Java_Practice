package ThisIsJava01;

public class CarExample {
    public static void main(String[] args) {
        /*
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 250);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();
         */


        /*
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            myCar.run_gas();
        }

        if(myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
        */



        /*
        //클래스 외부에서 메소드 호출
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도 : " + speed + "km/h");
         */



        /*
        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        //멈춤
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " + myCar.getSpeed());
         */

        Car car = new Car();

        for(int i=1; i<=5; i++) {
            int problemLocation = car.run();
            if(problemLocation != 0) {
                System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
                car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
            }
            System.out.println("---------------------------------------");
        }
    }
}
