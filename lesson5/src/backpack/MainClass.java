package backpack;

class MainClass {
    static Thing[] arr = new Thing[5];
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

        maxCost = 0; //Установили максимальную стоимость
        capacity = bp.getCapacity(); //запомнили грузоподъемность рюкзака
        int res = selectT (0,0, fullCost);
        System.out.println(res);
        //System.out.println(bp);
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
}
