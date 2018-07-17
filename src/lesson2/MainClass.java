package lesson2;

import java.util.concurrent.*;

public class MainClass {
    public static void main (String[] args) {
        ArrayClassMy arr = new ArrayClassMy(10000);
        arr.fillArray(10000);
        ArrayClassMy arr2 = new ArrayClassMy(arr.getArray());
        ArrayClassMy arr3 = new ArrayClassMy(arr.getArray());
        /*arr.addElement(9);
        arr.addElement(8);
        arr.addElement(7);
        arr.insertElement(1,6);
        arr.deleteElement(2);
        arr.addElement(5);
        arr.addElement(1);

        /*System.out.println(arr.linearSearch(7));
        for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }*/
        long timeStart = System.nanoTime();
        arr.sortBubble();
        long timeResult = System.nanoTime()-timeStart;
        System.out.println("sortBuble " + timeResult + " nanoseconds" );
        timeStart = System.nanoTime();
        arr2.sortSelect();
        timeResult = System.nanoTime()-timeStart;
        System.out.println("sortSelect " + timeResult + " nanoseconds" );
        timeStart = System.nanoTime();
        arr3.sortInsert();
        timeResult = System.nanoTime()-timeStart;
        System.out.println("sortInsert " + timeResult + " nanoseconds" );
        //System.out.println("which is " + TimeUnit.SECONDS.convert(timeResult,TimeUnit.NANOSECONDS) + " nanoseconds" );
        //System.out.println(timeFinish-timeStart);
        /*for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }*/

        //System.out.println(arr.binarySearch(9));*/
    }
}
