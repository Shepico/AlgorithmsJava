package coupString;

public class Main {
    public static void main (String[] argd) {
        CharString arrStr = new CharString("очередь");
        System.out.println(arrStr.coup());

        CharStringStack arrStr2 = new CharStringStack("гриф утверждения");
        arrStr2.coup();
    }
}
