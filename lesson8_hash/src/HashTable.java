import sun.nio.cs.ArrayEncoder;

import java.util.ArrayList;

public class HashTable {
    private ArrayList<Item> items;
    private ArrayList<Item>[] hashTable;
    //private ArrayList<ArrayList<Item>> hashTable;

    HashTable() {
        hashTable = new ArrayList[10];
        for (int i=0; i<hashTable.length; i++) {
            hashTable[i] = null;
        }
    }

   void add(Item item) {
       ArrayList<Item> currentList = findArray(item);
       currentList.add(item);
   }

   ArrayList<Item> findArray (Item item) {
       int key = item.hashCode();
       if (this.hashTable[key] == null) {
           ArrayList<Item> result = new ArrayList();
           hashTable[key] = result;
           return result;
       }else
           return hashTable[key];
   }

   Item findItem (Item item) {
       int key = item.hashCode();
       /*if (key < 0 || key > hashTable.length - 1 ){
           return null;
       }*/
       ArrayList<Item> currentList = findArray(item);//hashTable[key];
       for (int i = 0; i < currentList.size(); i++) {
            if (currentList.get(i).equals(item)) {
                return currentList.get(i);
            }
       }
       return null;
   }

   void display() {
        for (int i=0; i<this.hashTable.length; i++){
            System.out.println("hash code = " + i);
            if (this.hashTable[i] == null) {
                continue;
            }
            for (int j=0; j<this.hashTable[i].size(); j++){
                System.out.println(this.hashTable[i].get(j));
            }
        }
   }

   Item removeItem(Item item) {
       ArrayList<Item> currentList = findArray(item);
       for (int i=0; i<currentList.size(); i++) {
           if (currentList.get(i) == item) {
               Item currentItem = currentList.get(i);
               currentList.remove(i);
               return  currentItem;
           }
       }
       return null;
   }
}
