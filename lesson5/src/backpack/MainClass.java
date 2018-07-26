package backpack;

import java.util.ArrayList;

class MainClass {
    static Thing[] arr = new Thing[5];
    static ArrayList<Thing> arrMax;
    static Backpack bp = new Backpack(9);
    static int maxCost;
    static int fullCost;
    static int capacity;

    public static void main (String[] args){
        //заполниои массив вещами
        arr[0] = new Thing("book", 1,6);
        arr[1] = new Thing("binoculars", 2,5);
        arr[2] = new Thing("aid_kit", 4,7);
        arr[3] = new Thing("notebook", 5,4);
        arr[4] = new Thing("pot", 1,3);

        //подсчитали стоимость вcех вещей
        for (int i=0; i<arr.length; i++){
            fullCost += arr[i].getCost();
        }

        //Максимальный набор
        arrMax = new ArrayList();

        maxCost = 0; //Установили максимальную стоимость
        capacity = bp.getCapacity(); //запомнили грузоподъемность рюкзака
        int res = selectT (0,0, fullCost);
        System.out.println(res);
        //System.out.println(bp);
        selectArr(0,0, 0, 0);
        for (Thing t:arrMax) {
            System.out.println(t);
        }
    }

     static int selectT (int i, int currentWeight, int fullCost){
        //Включаем предмет
        if (currentWeight + arr[i].getWeight() <= capacity ) {
            if (i < arr.length - 1) {
                selectT(i+1, currentWeight + arr[i].getWeight(), fullCost);
            } else if (fullCost > maxCost) {
                maxCost = fullCost;
            }
        }
        //Исключаем предмет
        if (fullCost > maxCost + arr[i].getCost()) {

            if (i < arr.length - 1) {
                selectT(i+1, currentWeight, fullCost - arr[i].getCost());
            }else {
                maxCost = fullCost - arr[i].getCost();
            }
        }
        return maxCost;
    }

    static void selectArr(int i, int cw, int maxCost, int curCost) {
        if (cw + arr[i].getWeight() <= capacity) {
            arrMax.add(arr[i]);
            curCost = curCost + arr[i].getCost();
            if (i < arr.length) {
                selectArr (i++, cw+arr[i].getWeight(), maxCost, curCost);
            } else if (curCost > maxCost ) {
                maxCost = curCost;
                curCost = 0;
                System.out.println(maxCost);
            }
        } else if (curCost > maxCost ) {
            maxCost = curCost;
            curCost = 0;
            System.out.println(maxCost);
        }
    }



    static int knapsack(int[] values, int[] weights, int capa, int[] tab, int i) {
        if(i>=arr.length) return 0;
        if(tab[capa] != 0)
            return tab[capa];

        int value1 = knapsack(values, weights, capa, tab, i+1);
        int value2 = 0;
        if(W >= weights[i]) value2 = knapsack(values, weights, W-weights[i], tab, i+1) + values[i];

        return tab[W] = (value1>value2) ? value1 : value2;
    }
}
