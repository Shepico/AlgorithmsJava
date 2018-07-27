package backpack;

import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList<Thing> cArr = new ArrayList<>();
        ArrayList<Thing> mArr = new ArrayList<>();
        //заполнили массив вещами
        Thing[] arr = new Thing[5];
        arr[0] = new Thing("pot", 1, 3);
        arr[1] = new Thing("book", 1, 6);
        arr[2] = new Thing("binoculars", 5, 5);
        arr[3] = new Thing("aid_kit", 4, 7);
        arr[4] = new Thing("notebook", 5, 4);


        Backpack bp = new Backpack(16); //рюкзак
        //bp.pickupThing(arr, 0, 0, 0, 0 , cArr, mArr, 0, 1);
        bp.pickupThing2(arr, 0, 0, cArr, mArr);  //через цикл сделано

        System.out.println(bp);
    }
}

