public class Main {

    public static void main (String[] args) {
        List listOne = new ListOneS();
        listOne.display();
        listOne.insertFirst(5);
        listOne.insertFirst(3);
        listOne.insertFirst(4);
        listOne.display();
        listOne.insertLast(5);
        System.out.println("Delete - " + listOne.findValue(3));
        listOne.deleteValue(3);
        listOne.display();

    }
}
