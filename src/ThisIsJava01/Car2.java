package ThisIsJava01;

public class Car2 {
    Tire2[] tires2 = {
            new HankookTire2(),
            new HankookTire2(),
            new HankookTire2(),
            new HankookTire2()
    };

    void run() {
        for(int i = 0; i < 4; i++) {
            tires2[i].roll();
        }
    }
}
