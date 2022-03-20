public class MyClass {
    //필드
    RemoteControl rc = new Television();

    //생성자
    MyClass(RemoteControl rc) {
        this.rc = rc;
    }

    //메소드
    void methodA() {
        RemoteControl rc = new Audio();
    }

    void methodB(RemoteControl rc) {

    }
}
