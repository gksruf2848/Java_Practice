public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "012345-1234567");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("임한결", "010101-0101010");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
