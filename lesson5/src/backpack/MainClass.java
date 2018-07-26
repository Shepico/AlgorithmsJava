package backpack;

class MainClass {

    public static void main (String[] args){
        Thing[] arr = new Thing[5];
        arr[0] = new Thing("book", 1,6);
        arr[1] = new Thing("binoculars", 2,5);
        arr[2] = new Thing("aid_kit", 4,7);
        arr[3] = new Thing("notebook", 5,4);
        arr[4] = new Thing("pot", 1,3);

        System.out.println(arr[1]);

        Backpack bp = new Backpack(7);
        selectThing(arr, bp.getCapacity());
    }

    static void selectThing (Thing[] arr, int capacity) {
        int maxCost=0;
        int maxWeight = 0;
        for (int i=0; i<arr.length & maxWeight < capacity; i++){
            maxCost = maxCost + arr[i].getCost();
            maxWeight = maxWeight + arr[i].getWeight();
        }
        System.out.println(maxCost + " " + maxWeight);

    }

}
