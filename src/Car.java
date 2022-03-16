public class Car {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int gas;

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

    void run() {
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
}
