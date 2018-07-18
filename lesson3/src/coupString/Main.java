package coupString;

public class Main {
    public static void main (String[] argd) {
        CharString arrStr = new CharString("очередь");
        System.out.println(arrStr.coup());

        CharString arrStr2 = new CharString("гриф утверждения");
        System.out.println(arrStr2.coup());
    }
}
