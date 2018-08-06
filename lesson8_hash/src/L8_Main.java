public class L8_Main {

    public static void main (String[] args){
        Item[] itemArr = new Item[9];

        Item one = new Item("Dress", 44);
        Item two = new Item("Dress", 46);
        Item three = new Item("Dress", 48);

        Item four = new Item("Shorts", 40);
        Item five = new Item("Shorts", 42);
        Item sex = new Item("Shorts", 50);

        Item seven = new Item("Pants", 44);
        Item eight = new Item("Pants", 48);
        Item nine = new Item("Pants", 52);

        Item ten = new Item("Cloths", 38);

        itemArr[0] = one;
        itemArr[1] = two;
        itemArr[2] = three;
        itemArr[3] = four;
        itemArr[4] = five;
        itemArr[5] = sex;
        itemArr[6] = seven;
        itemArr[7] = eight;
        itemArr[8] = nine;


        //Тут можно посмотреть hash code для всех элементнов
        /*for (int i=0; i<itemArr.length; i++){
            System.out.println(itemArr[i]);
            System.out.println(itemArr[i].hashCode());
        }*/
////////////////////////////////////////////////////////

        HashTable ht = new HashTable();
        ht.add(one);
        ht.add(two);
        ht.add(three);
        ht.add(four);
        ht.add(five);
        ht.add(sex);
        ht.add(seven);
        ht.add(eight);
        ht.add(nine);

        ht.display();
        System.out.println("************************************************");

        System.out.println("Find - " + ht.findItem(ten));
        System.out.println("Find - " + ht.findItem(seven));

        System.out.println("Remove - " + ht.removeItem(nine));
        ht.add(ten);
        System.out.println("************************************************");

        ht.display();
    }
}
