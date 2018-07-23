public class Main {

    public static void main (String[] args) {
        //Односторонний список
        System.out.println("Односторонний список");
        List listOne = new ListOneS();
        listOne.display();
        listOne.insertFirst(5);
        listOne.insertFirst(3);
        listOne.insertFirst(4);
        listOne.display();
        listOne.insertLast(5);
        System.out.println("Find - " + listOne.findValue(3));
        System.out.println("Delete value - " + listOne.deleteValue(3));
        listOne.insertFirst(7);
        listOne.insertFirst(1);
        listOne.display();

        //Двухсторонний список
        System.out.println();
        System.out.println("Двухсторонний список");
        List listTwo = new ListTwoS();
        listTwo.insertLast(5);
        listTwo.insertFirst(3);
        listTwo.insertLast(6);
        listTwo.insertFirst(8);
        listTwo.insertLast(4);
        listTwo.display();
        System.out.println("Delete last - " + listTwo.deleteLast());
        System.out.println("Delete first- " + listTwo.deleteFirst());
        listTwo.display();
        System.out.println("Find - " + listTwo.findValue(5));
        System.out.println("Delete value- " + listTwo.deleteValue(5));
        listTwo.insertLast(7);
        listTwo.insertLast(1);
        listTwo.display();
    }
}
