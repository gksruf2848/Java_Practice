package ThisIsJava01;

public class Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }

    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.141592 * r * r;
    }
}
