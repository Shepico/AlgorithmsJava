package power;

import java.util.Scanner;

class MainClass {
        static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int number;
        int pow;

        System.out.print("Введите число - ");
        number = sc.nextInt();

        System.out.print("Введите степень - ");
        pow = sc.nextInt();

        System.out.println("Result - " + elevate (1, number, pow));

    }

    static int elevate (int result, int num, int p) {
        if (p == 0) {
            return result;
        }
        return num*elevate (result, num, --p);
    }

}
