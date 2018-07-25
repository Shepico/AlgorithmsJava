import java.util.Iterator;

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

        //Стек
        System.out.println();
        System.out.println("Стек");
        Stack stack = new Stack();
        stack.pop(1);
        stack.pop(2);
        stack.pop(3);
        stack.pop(4);
        stack.display();
        System.out.println("push - " + stack.push());
        System.out.println("push - " + stack.push());
        stack.display();

        //Очередь
        System.out.println();
        System.out.println("Очередь");
        Queue que = new Queue();
        que.pop(1);
        que.pop(2);
        que.pop(3);
        que.pop(4);
        que.pop(5);
        que.pop(6);
        que.display();
        System.out.println("push - " + que.push());
        System.out.println("push - " + que.push());
        que.display();

        //Итератор из Вебинара
        System.out.println();
        System.out.println("Итератор");
        ListOneS listOneI = new ListOneS();
        listOneI.insertFirst(5);
        listOneI.insertFirst(3);
        listOneI.insertFirst(4);
        listOneI.insertFirst(1);
        listOneI.insertFirst(2);
        listOneI.insertFirst(6);

        /*Iterator <Integer> iterator =  listOneI.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            System.out.println(next);
        }*/

        for (int value: listOneI) {
            System.out.println(value);
        }
    }
}
