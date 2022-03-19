public class Car {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int gas;
    private int speed;
    private boolean stop;

    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);

    //생성자
    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas==0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run_gas() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다.(gas잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
                return;
            }
        }
    }

    /*
    //클래스 외부에서 메소드 호출
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for(int i = 10; i <= 50; i += 10) {
            speed = i;
            System.out.println("달립니다.(시속 : " + speed + "km/h)");
        }
    }
    */

    //getter와 setter 메소드 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }

    int run() {
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false) { stop(); return 1; }
        if(frontRightTire.roll()==false) { stop(); return 2; }
        if(backLeftTire.roll()==false) { stop(); return 3; }
        if(backRightTire.roll()==false) { stop(); return 4; }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
