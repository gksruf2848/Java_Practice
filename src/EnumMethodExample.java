public class EnumMethodExample {
    public static void main(String[] args) {
        //name() 메소드
        Week today =Week.SUNDAY;
        String name = today.name();
        System.out.println(name);
    }
}
