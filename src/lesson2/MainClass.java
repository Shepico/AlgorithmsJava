package lesson2;

public class MainClass {
    public static void main (String[] args) {
        ArrayClassMy arr = new ArrayClassMy(5);
        arr.addElement(9);
        arr.addElement(8);
        arr.addElement(7);
        arr.insertElement(1,6);
        arr.deleteElement(2);
        arr.addElement(5);
        arr.addElement(1);

        System.out.println(arr.linearSearch(7));
        /*for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }*/
        //arr.sortBubble();
        arr.sortSelect();
        for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }
    }
}
