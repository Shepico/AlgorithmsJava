package backpack;

import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList<Thing> cArr = new ArrayList<>();
        ArrayList<Thing> mArr = new ArrayList<>();
        //заполниkи массив вещами
        Thing[] arr  = new Thing[5];
        arr[0] = new Thing("pot", 1, 3);
        arr[1] = new Thing("book", 1, 6);
        arr[2] = new Thing("binoculars", 5, 5);
        arr[3] = new Thing("aid_kit", 4, 7);
        arr[4] = new Thing("notebook", 5, 4);


        Backpack bp = new Backpack(16); //рюкзак
        bp.pickupThing(arr, 0, 0, 0, 0 , cArr, mArr);


        /*for (Thing t:arr) {
            System.out.println(t);
        }*/


        /*//подсчитали стоимость вcех вещей
        for (int i = 0; i < arr.length; i++) {
            fullCost += arr[i].getCost();
        }

        //Максимальный набор
        arrMax = new ArrayList();
        curMax = new ArrayList();

        maxCost = 0; //Установили максимальную стоимость
        capacity = bp.getCapacity(); //запомнили грузоподъемность рюкзака
        int res = selectT(0, 0, fullCost);
        System.out.println(res);
        System.out.println(bp);

        /*for (Thing t:arrMax) {
            System.out.println(t);
        }*/
    }

    /*static int selectT(int i, int currentWeight, int fullCost) {
        //Включаем предмет
        if (currentWeight + arr[i].getWeight() <= capacity) {
            if (i < arr.length - 1) {
                selectT(i + 1, currentWeight + arr[i].getWeight(), fullCost);
            } else if (fullCost > maxCost) {
                maxCost = fullCost;
            }
        }
        //Исключаем предмет
        if (fullCost > maxCost + arr[i].getCost()) {

            if (i < arr.length - 1) {
                selectT(i + 1, currentWeight, fullCost - arr[i].getCost());
            } else {
                maxCost = fullCost - arr[i].getCost();
            }
        }
        return maxCost;
    }*/
}

